package doctors;

import operations.DoctorsOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import HospitalRecords.Patient;
import operations.PatientOperation;
import HospitalRecords.Wards;

import static org.junit.jupiter.api.Assertions.*;

class DoctorsOperationTest {
    Wards ward1;
    Patient patientDetails1;
    DoctorsOperation doctorsOperation;
    PatientOperation patientOperation;

    @BeforeEach
    void setUp() {
        ward1 = new Wards(2, "safety room", 15, 12);
        patientDetails1 = new Patient("Daniel Abel", 2, 24, "malaria", 5000);
        doctorsOperation = new DoctorsOperation("David", patientDetails1, patientDetails1.getIllnessName(), "paracetamol", ward1, 1500);
        patientOperation = new PatientOperation(doctorsOperation);
    }

    @Test
    void getDoctorsName() {
        assertEquals("David", doctorsOperation.getDoctorsName());
    }

    @Test
    void getBill() {
        assertEquals(1500, doctorsOperation.getBill());
    }

    @Test
    void getPatientAssigned() {
        assertEquals(patientDetails1, doctorsOperation.getPatientAssigned());
    }

    @Test
    void getDiagnosis() {
        assertEquals("malaria", doctorsOperation.getDiagnosis());
    }

    @Test
    void getDrugPrescription() {
        assertEquals("paracetamol", doctorsOperation.getDrugPrescription());
    }

    @Test
    void dischargePatient() {
        assertEquals("you are free to go home", doctorsOperation.dischargePatient());
    }
}