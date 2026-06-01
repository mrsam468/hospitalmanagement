package hospitalrecords;

public class MedicalReport {
    private Doctor doctor;
    public MedicalReport(Doctor doctor){
        this.doctor = doctor;
    }
    public String medicalReport() {
        return "Patient Fullname : " + doctor.getPatientAssigned().getFullName() + ", Doctors Name : "
                + doctor.getFullName() + ", Diagnosis " + doctor.getDiagnosis() + ", Treatement Prescribed: " +
                doctor.getDrugPrescription() + ", Ward assigned: " + doctor.getPatientAssigned().getWardAssigned();
    }
}
