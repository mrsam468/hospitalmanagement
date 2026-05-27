package operations;

import HospitalRecords.Patient;
import HospitalRecords.Wards;
import exceptions.NoMoreSpaceAvailableException;

import java.util.ArrayList;
import java.util.List;

public class ReceptionistOperation {
    private Wards wards;
    private final List<Patient> registeredPatients = new ArrayList<>();
    private List<Wards> allWards = new ArrayList<>();

    private void setWards(Patient patient){
        wards.setPatientsAssignedToWard(patient);
    }


    public void registerPatients(Patient patient,Wards ward) {
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

    private void setWards(Wards wards){
      allWards.add(wards);
    }

    public List<Wards> viewAvailableWard() {
            List<Wards> availableWards = new ArrayList<>();
            for (Wards wards : allWards){
                if (wards.getWardCapacity() > wards.getNumberOfOccupiedSpaces()){
                    availableWards.add(wards);
                }
            }
            return availableWards;
    }

}
