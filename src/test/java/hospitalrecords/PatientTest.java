package hospitalrecords;

import model.MedicalReport;
import model.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {
    Patient patient;

    @BeforeEach
    void init(){
        patient = new Patient("Daniel","Abel","kate", 2, 24, "malaria", 5000);
    }

    @Test
    void getFullName() {
        assertEquals("Daniel Abel kate",patient.getFullName());
    }


    @Test
    void getPatientId() {
        assertEquals(2,patient.getPatientId());
    }

    @Test
    void getAge() {
        assertEquals(24,patient.getAge());
    }

    @Test
    void getIllnessName() {
        assertEquals("malaria",patient.getIllnessName());
    }

    @Test
    void getWalletBalance() {
        assertEquals(5000,patient.getWalletBalance());
    }

}