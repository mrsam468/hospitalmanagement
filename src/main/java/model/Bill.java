package model;

public class Bill {
    private String patientName;
    private int bill;

    public Bill(int bill, String patientName) {
        this.bill = bill;
        this.patientName = patientName;
    }

    public int bill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public String patientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
