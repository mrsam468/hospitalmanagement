package patients;

import doctors.DoctorsOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ward.Wards;

import static org.junit.jupiter.api.Assertions.*;

class PatientOperationTest {
    Wards ward1;
    PatientDetails patientDetails1;
    DoctorsOperation doctorsOperation;
    PatientOperation patientOperation;

    @BeforeEach
    void setUp() {
        ward1 = new Wards(2, "safety room", 15, 12);
        patientDetails1 = new PatientDetails("Daniel Abel", 2, 24, "malaria", 5000);
        doctorsOperation = new DoctorsOperation("David", patientDetails1, patientDetails1.getIllnessName(), "paracetamol", ward1, 1500);
        patientOperation = new PatientOperation(doctorsOperation);
    }

    @Test
    void viewAssignedDoctor() {
        assertEquals("David", patientOperation.viewAssignedDoctor());
    }

    @Test
    void viewDiagnose() {
        assertEquals("malaria", patientOperation.viewDiagnose());
    }

    @Test
    void viewTreatmentPrescribed() {
        assertEquals("paracetamol", patientOperation.viewTreatmentPrescribed());
    }

    @Test
    void payBill() {
        patientOperation.payBill();
        assertEquals(3500, patientDetails1.getWalletBalance());
    }
}