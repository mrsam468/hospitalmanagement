import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Receptionist receptionist = new Receptionist("James ","David","Gabriel");
        Patient patient1 = new Patient("john","favour","sunday",3,23,"malaria",2300);
        Patient patient2 = new Patient("daniel","Abraham","joshia",2,26,"typhoid",3000);
        Ward ward1 = new Ward(2,"purple",34,17);
        Ward ward2 = new Ward(1,"Green",34,22);
        Bill bill1 = new Bill(1500,patient1.getFullName());
        Bill bill2 = new Bill(2000,patient2.getFullName());
        Doctor doctor1 = new Doctor("josphine","success","joshua","ibenjaminsamuel57@gmail.com",34,"nigeria",patient1,"malarai","panadol",ward2,bill1);
        Doctor doctor2 = new Doctor("alex","elijah","bright","james20@gmail.com",31,"Ghana",patient2,"malarai","panadol",ward1,bill2);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        receptionist.registerPatient(patient1);
        receptionist.registerPatient(patient2);

//        System.out.println(receptionist.viewPatients());
        receptionist.assignPatientToWard(ward2,patient1);
        receptionist.assignPatientToWard(ward1,patient2);
        MedicalReport patient1MedicalReport = new MedicalReport(doctor1);
        MedicalReport patient2MedicalReport = new MedicalReport(doctor2);
//        System.out.println(patient2MedicalReport);
        System.out.println(patient1MedicalReport);
        receptionist.debitPatient(doctor1);
        receptionist.debitPatient(doctor2);
        receptionist.dischargePatient(patient1);
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
