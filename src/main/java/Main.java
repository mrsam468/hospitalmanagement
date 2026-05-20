import doctors.DoctorsOperation;
import patients.PatientDetails;
import patients.PatientOperation;
import receptionist.ReceptionistOperation;
import ward.Wards;

public class Main {
    public static void main(String[] args) {
        ReceptionistOperation receptionistOperation = new ReceptionistOperation();

        Wards ward1 = new Wards(2, "safety room", 15, 12);
        Wards ward2 = new Wards(3, "quite room", 12, 8);

        PatientDetails patientDetails1 = new PatientDetails("Daniel Abel", 2, 24, "malaria", 5000);
        PatientDetails patientDetails2 = new PatientDetails("Josiah Bethel", 4, 44, "typhoid", 4000);

        DoctorsOperation doctorsOperation1 = new DoctorsOperation("James", patientDetails1, patientDetails1.getIllnessName(), "paracetamol", ward1, 3000);
        DoctorsOperation doctorsOperation2 = new DoctorsOperation("James", patientDetails2, patientDetails2.getIllnessName(), "paracetamol", ward2, 3000);

        PatientOperation patient1Operation = new PatientOperation(doctorsOperation1);
        PatientOperation patient2Operation = new PatientOperation(doctorsOperation2);


        receptionistOperation.registerPatients(patientDetails1);
        receptionistOperation.registerPatients(patientDetails2);

        receptionistOperation.setWards(ward2, patientDetails1);
        receptionistOperation.setWards(ward1, patientDetails2);

        System.out.println(doctorsOperation1.getDiagnosis());
        System.out.println(doctorsOperation2.getDiagnosis());

        System.out.println(doctorsOperation2.medicalReport());
        System.out.println(doctorsOperation1.medicalReport());

        receptionistOperation.viewPatients();

        patient1Operation.payBill();
        patient2Operation.payBill();

        doctorsOperation1.dischargePatient();
        doctorsOperation2.dischargePatient();
    }
}
