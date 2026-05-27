package operations;

import hospitalrecords.Doctor;
import hospitalrecords.Patient;
import hospitalrecords.Wards;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class DoctorsOperation {
    private final Doctor doctor;
    private Patient patientAssigned;
    private final String diagnosis;
    private final String drugPrescription;
    private final Wards wardAssigned;
    private final int bill;
    private List<Patient> assignedPatients = new ArrayList<>();

    public DoctorsOperation(Doctor doctor, Patient patientDetails, String diagnosis, String drugPrescription, Wards wardsAssigned, int bill) {
        this.doctor = doctor;
        this.patientAssigned = patientDetails;
        this.diagnosis = diagnosis;
        this.drugPrescription = drugPrescription;
        this.wardAssigned = wardsAssigned;
        this.bill = bill;
    }

    public String getDoctorsName() {
        return doctor.getFullName();
    }

    public int getBill() {
        return bill;
    }

    private void assignPatient(Patient patientDetails) {
        patientAssigned = patientDetails;
    }

    public Patient getPatientAssigned() {
        return patientAssigned;
    }

    public void setAssignedPatient(Patient patient) {
        assignedPatients.add(patient);
    }

    public List<Patient> viewPatiencesAssigned() {
        return assignedPatients;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getDrugPrescription() {
        return drugPrescription;
    }

    public String medicalReport() {
        return "Patient Fullname : " + patientAssigned.getFullName() + ", Doctors Name : "
                + doctor.getFullName() + ", Diagnosis " + diagnosis + ", Treatement Prescribed: " +
                drugPrescription + ", Ward assigned: " + wardAssigned;
    }

    public String dischargePatient() {
        return "you are free to go home";
    }

}
