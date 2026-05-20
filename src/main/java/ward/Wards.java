package ward;

public class Wards {
    private final int wardId;
    private final String wardName;
    private final int wardCapacity;
    private final int numberOfOccupiedSpaces;

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
