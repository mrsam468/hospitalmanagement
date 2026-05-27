package doctors;

import hospitalrecords.Doctor;
import operations.DoctorsOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hospitalrecords.Patient;
import operations.PatientOperation;
import hospitalrecords.Wards;

import static org.junit.jupiter.api.Assertions.*;

class DoctorsOperationTest {
    Wards ward1;
    Patient patientDetails1;
    Doctor doctor1;
    Doctor doctor2;
    DoctorsOperation doctorsOperation;
    PatientOperation patientOperation;

    @BeforeEach
    void setUp() {
        ward1 = new Wards(2, "safety room", 15, 12);
        doctor1 = new Doctor("james", "kelvin", "", "james23@gmail.com", 24, "ghana");
        doctor2 = new Doctor("david", "john", "ryan", "davie3@gmail.com", 29, "nigerian");

        patientDetails1 = new Patient("Daniel Abel", 2, 24, "malaria", 5000);
        doctorsOperation = new DoctorsOperation(doctor1, patientDetails1, patientDetails1.getIllnessName(), "paracetamol", ward1, 1500);
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