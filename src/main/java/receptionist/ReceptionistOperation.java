package receptionist;

import patients.PatientDetails;
import ward.Wards;

import java.util.ArrayList;
import java.util.List;

public class ReceptionistOperation {
    private final List<Wards> wards = new ArrayList<>();
    private final List<PatientDetails> registeredPatients = new ArrayList<>();

    public ReceptionistOperation(PatientDetails patientDetails, Wards wardsDetails) {
        registeredPatients.add(patientDetails);
        wards.add(wardsDetails);
    }

    public List<PatientDetails> viewPatient() {
        return registeredPatients;
    }

    public List<Wards> viewAvailableWard() {
        List<Wards> availableWards = new ArrayList<>();
        for (Wards wards : wards) {
            if (wards.getWardCapacity() > wards.getNumberOfOccupiedSpaces()) {
                availableWards.add(wards);
            }
        }
        return availableWards;
    }

}
