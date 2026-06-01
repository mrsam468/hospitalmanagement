package hospitalrecords;

import java.util.ArrayList;
import java.util.List;

public class Receptionist {
    private String firstName;
    private String lastName;
    private String otherName;
    private Wards wards;
    private final List<Patient> registeredPatients = new ArrayList<>();
    private List<Wards> allWards = new ArrayList<>();

    public Receptionist(String firstName,String lastName,String otherName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setOtherName(String otherName){
        this.otherName = otherName;
    }

    public String getFullName(){
        return firstName + " " + lastName + " " + " " + otherName;
    }

    private void setWards(Patient patient) {
        wards.setPatientsAssignedToWard(patient);
    }


    public void registerPatients(Patient patient, Wards ward) {
        this.wards = ward;
        setWards(wards);
        patient.setWardAssigned(wards);
        setWards(patient);
        registeredPatients.add(patient);
    }

    public List<String> viewPatients() {
        List<String> patients = new ArrayList<>();
        for (Patient registered : registeredPatients) {
            patients.add(registered.toString());
        }
        return patients;
    }

    private void setWards(Wards wards) {
        allWards.add(wards);
    }
}
