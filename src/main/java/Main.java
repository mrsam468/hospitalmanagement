import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Receptionist receptionist1 = new Receptionist("David","Gabriel","Daniel");
        Receptionist receptionist2 = new Receptionist("Ga","Gabriel","Daniel");
        Receptionist receptionist3 = new Receptionist("Nab","Gabriel","Daniel");

        Patient patient1 = new Patient("Daniel ","Abel","kate", 2, 24, "malaria", 5000);
        Patient patient2 = new Patient("Josiah"," Bethel" ,"chapel", 2, 44, "typhoid", 4000);

        Ward ward1 = new Ward(2, "safety room", 15, 12);
        Ward ward2 = new Ward(3, "quite room", 12, 8);

        Bill bill1 = new Bill(2300,patient1.getFullName());
        Bill bill2 = new Bill(4533,patient2.getFullName());

        Doctor doctor1 = new Doctor("james", "kelvin", "", "james23@gmail.com", 24, "ghana",patient2,"typhoid","panadol",ward1,bill1);
        Doctor doctor2 = new Doctor("david", "john", "ryan", "davie3@gmail.com", 29, "nigerian",patient1,"malaria","paracetamol",ward2,bill2);
//        List<Doctor> doctors = List.of(
//                doctor1,doctor2
//        );
//        hospital.addDoctor(doctors);
//
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        receptionist2.registerPatient(patient1);
        receptionist2.registerPatient(patient2);

        receptionist2.assignPatientToDoctor(doctor1,patient1);
        receptionist2.assignPatientToDoctor(doctor2,patient2);

        receptionist2.assignPatientToWard(ward1,patient1);
        receptionist2.assignPatientToWard(ward2,patient2);


        System.out.println(receptionist2.viewPatients());
        System.out.println(receptionist1.viewPatients());


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
