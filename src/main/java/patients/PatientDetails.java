package patients;

public class PatientDetails {
    private String fullName;
    private int patientId;
    private int age;
    private String illnessName;
    private int walletBalance;

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

}
