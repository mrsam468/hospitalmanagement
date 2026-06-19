package model;

import exceptions.InsufficientBalanceException;

import java.util.ArrayList;
import java.util.List;

public class Receptionist {
    Hospital hospital = new Hospital();
    private String firstName;
    private String lastName;
    private String otherName;
    private Ward wards;

    public Receptionist(String firstName,String lastName,String otherName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
    }

//    public void registerPatient(String firstName, String lastName, String otherName, int patientId, int age, String illnessName, int walletBalance){
//        Patient patient = new Patient(firstName,lastName,otherName,patientId,age,illnessName,walletBalance);
//        hospital.addPatients(patient);
//    }

    public void registerPatient(Patient patient){
        hospital.addPatients(patient);
    }

    public List<String> viewPatients() {
        List<String> patients = new ArrayList<>();
        for (Patient registered : hospital.viewpatients()) {
            patients.add(registered.toString());
        }
        return patients;
    }

    public void assignPatientToDoctor(Doctor doctor, Patient patient){
        List<Patient> patientList = doctor.getAssignedPatients();
        patientList.add(patient);
    }

    public void assignPatientToWard(Ward ward,Patient patient){
        List<Patient> patients = ward.getAssignedPatients();
        patients.add(patient);
    }

    public void debitPatient(Doctor doctor){
        for (Patient patient : hospital.viewpatients()){
            if (doctor.getBill().patientName().equals(patient.getFullName())){
                if (doctor.getBill().bill() > patient.getWalletBalance()){
                    throw new InsufficientBalanceException("you do not have enough money to pay");
                }else{
                    patient.setWalletBalance(patient.getWalletBalance()-doctor.getBill().bill());
                }
            }
        }
    }

}
