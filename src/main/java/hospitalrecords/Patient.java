package hospitalrecords;

public class Patient {
    private String firstName;
    private String lastName;
    private String otherName;
    private int patientId;
    private int age;
    private String illnessName;
    private int walletBalance;
    private Wards wardAssigned;

    public Patient(String firstName,String lastName,String otherName, int patientId, int age, String illnessName, int walletBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.age = age;
        this.patientId = patientId;
        this.illnessName = illnessName;
        this.walletBalance = walletBalance;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + otherName;
    }

    public void setWardAssigned(Wards wardAssigned) {
        this.wardAssigned = wardAssigned;
    }

    public Wards getWardAssigned() {
        return wardAssigned;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getAge() {
        return age;
    }

    public String getIllnessName() {
        return illnessName;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int newAmount) {
        walletBalance = newAmount;
    }

    @Override
    public String toString() {
        return "[Name: " + getFullName() + ", PatientId: " + getPatientId()
                + ", age: " + getAge() + ", Illnessname: " + getIllnessName()
                + ", walletBalance: " + getWalletBalance() + ", WardAssigned :" + getWardAssigned() + "]";
    }
}
