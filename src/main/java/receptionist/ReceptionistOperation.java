package receptionist;

import exceptions.NoMoreSpaceAvailableException;
import patients.PatientDetails;
import ward.Wards;

import java.util.ArrayList;
import java.util.List;

public class ReceptionistOperation {
    private Wards wards;
    private List<Wards> availableWards = new ArrayList<>();
    private final List<PatientDetails> registeredPatients = new ArrayList<>();


    public void registerPatients(PatientDetails patientDetails) {
        registeredPatients.add(patientDetails);
    }

    public void setWards(Wards wards, PatientDetails patientDetails) {
        if (wards.getWardCapacity() <= wards.getNumberOfOccupiedSpaces()) {
            throw new NoMoreSpaceAvailableException("this ward is already occupied can you please take another one?");
        }
        patientDetails.setWardAssigned(wards);
        this.availableWards.add(wards);
    }

    public Wards getWards() {
        return wards;
    }

    public List<String> viewPatients() {
        List<String> patients = new ArrayList<>();
        for (PatientDetails registered : registeredPatients) {
            patients.add(registered.toString());
        }
        return patients;
    }

    public List<Wards> viewAvailableWard() {
        List<Wards> availableWards = new ArrayList<>();
        for (Wards wards : availableWards) {
            if (wards.getWardCapacity() > wards.getNumberOfOccupiedSpaces()) {
                availableWards.add(wards);
            }
        }
        return availableWards;
    }

    public String patientsWard() {
        for (PatientDetails registeredPatient : registeredPatients) {
            return registeredPatient.getFullName() + " is assigned to " + viewAvailableWard().getFirst().getWardId();
        }
        return null;
    }

}
