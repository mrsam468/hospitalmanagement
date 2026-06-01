import hospitalrecords.Doctor;
import hospitalrecords.Receptionist;
import hospitalrecords.Patient;
import hospitalrecords.Wards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Receptionist receptionist = new Receptionist("David","Gabriel","Daniel");

        Patient patient1 = new Patient("Daniel ","Abel","kate", 2, 24, "malaria", 5000);
        Patient patient2 = new Patient("Josiah"," Bethel" ,"chapel", 4, 44, "typhoid", 4000);
        List<Patient> listOfPatient = new ArrayList<>();
        listOfPatient.add(patient1);
        listOfPatient.add(patient2);

        Wards ward1 = new Wards(2, "safety room", 15, 12);
        Wards ward2 = new Wards(3, "quite room", 12, 8);

        Doctor doctor1 = new Doctor("james", "kelvin", "", "james23@gmail.com", 24, "ghana",patient2,"typhoid","panadol",ward1,2000);
        Doctor doctor2 = new Doctor("david", "john", "ryan", "davie3@gmail.com", 29, "nigerian",patient1,"malaria","paracetamol",ward2,5000);
        List<Doctor> listOfDoctors = new ArrayList<>();
        listOfDoctors.add(doctor1);
        listOfDoctors.add(doctor2);

        receptionist.registerPatients(patient1,ward2);
        receptionist.registerPatients(patient2,ward1);









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
