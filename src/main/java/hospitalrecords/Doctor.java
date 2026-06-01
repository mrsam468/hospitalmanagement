package hospitalrecords;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String firstName;
    private String lastName;
    private String otherName;
    private String email;
    private int age;
    private String nationality;
    private Patient patientAssigned;
    private final String diagnosis;
    private final String drugPrescription;
    private final Wards wardAssigned;
    private final int bill;
    private List<Patient> assignedPatients = new ArrayList<>();

    public Doctor( String firstName, String lastName, String otherName, String email, int age, String nationality,Patient patientDetails, String diagnosis, String drugPrescription, Wards wardsAssigned, int bill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.email = email;
        this.age = age;
        this.nationality = nationality;
        this.patientAssigned = patientDetails;
        this.diagnosis = diagnosis;
        this.drugPrescription = drugPrescription;
        this.wardAssigned = wardsAssigned;
        this.bill = bill;
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



    public String getFullName() {
        return firstName + " " + lastName + " " + otherName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String dischargePatient() {
        return "you are free to go home";
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", otherName='" + otherName + '\'' +
                ", email='" + email + '\'' +
                ", nationality='" + nationality + '\'' +
                ", patientAssigned=" + patientAssigned +
                ", diagnosis='" + diagnosis + '\'' +
                ", drugPrescription='" + drugPrescription + '\'' +
                ", wardAssigned=" + wardAssigned +
                ", bill=" + bill +
                ", assignedPatients=" + assignedPatients +
                '}';
    }
}
