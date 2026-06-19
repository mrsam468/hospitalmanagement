package model;

import java.util.ArrayList;
import java.util.List;

public class Ward {
    private int wardId;
    private String wardName;
    private int wardCapacity;
    private int numberOfOccupiedSpaces;
    private List<Patient> assignedPatients = new ArrayList<>();

    public Ward(int wardId, String wardName, int wardCapacity, int numberOfOccupiedSpaces) {
        this.wardId = wardId;
        this.wardName = wardName;
        this.wardCapacity = wardCapacity;
        this.numberOfOccupiedSpaces = numberOfOccupiedSpaces;
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(List<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
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
