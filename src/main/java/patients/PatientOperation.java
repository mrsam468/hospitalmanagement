package patients;

import doctors.DoctorsOperation;
import exceptions.InsufficientBalanceException;

public class PatientOperation extends PatientDetails{
    DoctorsOperation doctorsOperation;
    public PatientOperation(String fullName, int patientId, int age, String illnessName, int walletBalance, DoctorsOperation doctorsOperation) {
        super(fullName, patientId, age, illnessName, walletBalance);
        this.doctorsOperation = doctorsOperation;
    }

    public String viewAssignedDoctor(){
        return doctorsOperation.getDoctorsName();
    }

    public String viewDiagnose(){
        return doctorsOperation.getDiagnosis();
    }

    public String viewTreatmentPrescribed(){
        return doctorsOperation.getDrugPrescription();
    }

    public void payBill() throws InsufficientBalanceException {
        if (getWalletBalance()<doctorsOperation.getBill()){
            throw new InsufficientBalanceException("you do not have enough money to pay for your bills");
        }
    }
}
