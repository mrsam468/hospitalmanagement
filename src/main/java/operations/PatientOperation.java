package operations;

import exceptions.InsufficientBalanceException;

public class PatientOperation {
    private DoctorsOperation doctorsOperation;

    public PatientOperation(DoctorsOperation doctorsOperation) {
        this.doctorsOperation = doctorsOperation;
    }

    public String viewAssignedDoctor() {
        return doctorsOperation.getDoctorsName();
    }

    public String viewDiagnose() {
        return doctorsOperation.getDiagnosis();
    }

    public String viewTreatmentPrescribed() {
        return doctorsOperation.getDrugPrescription();
    }

    public void payBill() throws InsufficientBalanceException {
        if (doctorsOperation.getPatientAssigned().getWalletBalance() < doctorsOperation.getBill()) {
            throw new InsufficientBalanceException("you do not have enough money to pay for your bills");
        } else {
            doctorsOperation.getPatientAssigned().setWalletBalance(doctorsOperation.getPatientAssigned().getWalletBalance() - doctorsOperation.getBill());
            System.out.println(doctorsOperation.getPatientAssigned().getWalletBalance());
        }
    }
}
