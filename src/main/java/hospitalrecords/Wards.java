package hospitalrecords;

import java.util.ArrayList;
import java.util.List;

public class Wards {
    private int wardId;
    private String wardName;
    private int wardCapacity;
    private int numberOfOccupiedSpaces;
    private List<Patient> patientsAssignedToWard = new ArrayList<>();

    public Wards(int wardId, String wardName, int wardCapacity, int numberOfOccupiedSpaces) {
        this.wardId = wardId;
        this.wardName = wardName;
        this.wardCapacity = wardCapacity;
        this.numberOfOccupiedSpaces = numberOfOccupiedSpaces;
    }

    public int getWardId() {
        return wardId;
    }

    public String getWardName() {
        return wardName;
    }

    public int getWardCapacity() {
        return wardCapacity;
    }

    public int getNumberOfOccupiedSpaces() {
        return numberOfOccupiedSpaces;
    }

    public void setPatientsAssignedToWard(Patient patient) {
        patientsAssignedToWard.add(patient);
    }

    public List<String> getPatientsAssignedToWard() {
        List<String> patients = new ArrayList<>();
        for (Patient patient : patientsAssignedToWard) {
            patients.add(patient.getFullName());
        }
        return patients;
    }

    @Override
    public String toString() {
        return "Ward{" +
                "wardId=" + wardId +
                ", wardName='" + wardName + '\'' +
                ", wardCapacity=" + wardCapacity +
                ", numberOfOccupiedSpaces=" + numberOfOccupiedSpaces +
                '}';
    }
}
