package doctors;

import patients.PatientDetails;
import ward.Wards;

public class DoctorsOperation {
    private final String doctorsName;
    private PatientDetails patientAssigned;
    private final String diagnosis;
    private final String drugPrescription;
    private final Wards wardAssigned;

    public DoctorsOperation(String doctorsName, PatientDetails patientDetails, String diagnosis, String drugPrescription, Wards wardsAssigned) {
        this.doctorsName = doctorsName;
        this.patientAssigned = patientDetails;
        this.diagnosis = diagnosis;
        this.drugPrescription = drugPrescription;
        this.wardAssigned = wardsAssigned;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    private void assignPatient(PatientDetails patientDetails) {
        patientAssigned = patientDetails;
    }

    public PatientDetails getPatientAssigned() {
        return patientAssigned;
    }

    public String medicalReport() {
        return "Patient Fullname : " + patientAssigned.getFullName() + " Doctors Name : "
                + doctorsName + " Diagnosis " + diagnosis + " Treatement Prescribed" +
                drugPrescription + " Ward assigned " + wardAssigned;
    }

}
