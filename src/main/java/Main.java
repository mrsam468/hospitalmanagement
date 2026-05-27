import hospitalrecords.Doctor;
import operations.DoctorsOperation;
import hospitalrecords.Patient;
import operations.PatientOperation;
import operations.ReceptionistOperation;
import hospitalrecords.Wards;

public class Main {
    public static void main(String[] args) {
        ReceptionistOperation receptionistOperation = new ReceptionistOperation();

        Doctor doctor1 = new Doctor("james", "kelvin", "", "james23@gmail.com", 24, "ghana");
        Doctor doctor2 = new Doctor("david", "john", "ryan", "davie3@gmail.com", 29, "nigerian");

        Wards ward1 = new Wards(2, "safety room", 15, 12);
        Wards ward2 = new Wards(3, "quite room", 12, 8);

        Patient patientDetails1 = new Patient("Daniel Abel", 2, 24, "malaria", 5000);
        Patient patientDetails2 = new Patient("Josiah Bethel", 4, 44, "typhoid", 4000);

        DoctorsOperation doctorsOperation1 = new DoctorsOperation(doctor1, patientDetails1, patientDetails1.getIllnessName(), "paracetamol", ward1, 3000);
        DoctorsOperation doctorsOperation2 = new DoctorsOperation(doctor2, patientDetails2, patientDetails2.getIllnessName(), "paracetamol", ward2, 3000);

        PatientOperation patient1Operation = new PatientOperation(doctorsOperation1);
        PatientOperation patient2Operation = new PatientOperation(doctorsOperation2);;

        receptionistOperation.registerPatients(patientDetails1,ward2);
        receptionistOperation.registerPatients(patientDetails2,ward1);


        System.out.println(doctorsOperation1.getDiagnosis());
        System.out.println(doctorsOperation2.getDiagnosis());

        System.out.println(doctorsOperation2.medicalReport());
        System.out.println(doctorsOperation1.medicalReport());

        System.out.println(ward1.getPatientsAssignedToWard());

        System.out.println(receptionistOperation.viewAvailableWard());

        patient1Operation.payBill();
        patient2Operation.payBill();

        doctorsOperation1.dischargePatient();
        doctorsOperation2.dischargePatient();

        System.out.println(receptionistOperation.viewPatients());
    }
}
























//Is there any topic you haven’t covered. here?
//Introduction to OOP
//2. Pillars of OOP
//3.Primitive and non-primitive data types(Strings, int, floats, oop, Classes, interfaces)
//4. Access Modifiers
//5. this and
// keyword
//6. final and static
//7. Interface and Abstract Classes
//8. String Class
//9. The first Understanding Conditional statements, for loops, while loops
//10. The Unit Testing
//11. Intro to Exception handling
