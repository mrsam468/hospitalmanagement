package patients;

import hospitalrecords.Doctor;
import hospitalrecords.Patient;
import operations.PatientOperation;
import operations.DoctorsOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hospitalrecords.Wards;

import static org.junit.jupiter.api.Assertions.*;

class PatientOperationTest {
    Wards ward1;
    Patient patientDetails1;
    DoctorsOperation doctorsOperation;
    PatientOperation patientOperation;
    Doctor doctor1;
    Doctor doctor2;

    @BeforeEach
    void setUp() {
        ward1 = new Wards(2, "safety room", 15, 12);
        doctor1 = new Doctor("james", "kelvin", "", "james23@gmail.com", 24, "ghana");
        doctor2 = new Doctor("david", "john", "ryan", "davie3@gmail.com", 29, "nigerian");

        patientDetails1 = new Patient("Daniel Abel", 2, 24, "malaria", 5000);
        doctorsOperation = new DoctorsOperation(doctor2, patientDetails1, patientDetails1.getIllnessName(), "paracetamol", ward1, 1500);
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