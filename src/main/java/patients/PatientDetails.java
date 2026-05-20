package patients;

import ward.Wards;

public class PatientDetails {
    private String fullName;
    private int patientId;
    private int age;
    private String illnessName;
    private int walletBalance;
    private Wards wardAssigned;

    public PatientDetails(String fullName, int patientId, int age, String illnessName, int walletBalance) {
        this.fullName = fullName;
        this.age = age;
        this.patientId = patientId;
        this.illnessName = illnessName;
        this.walletBalance = walletBalance;
    }

    public String getFullName() {
        return fullName;
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
