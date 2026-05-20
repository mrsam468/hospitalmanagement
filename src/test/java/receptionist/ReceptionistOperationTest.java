package receptionist;

import patients.PatientDetails;

import static org.junit.jupiter.api.Assertions.*;

class ReceptionistOperationTest {
    ReceptionistOperation receptionistOperation;
    PatientDetails patientDetails1;
    PatientDetails patientDetails2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        receptionistOperation = new ReceptionistOperation();
        patientDetails1 = new PatientDetails("Daniel Abel", 2, 24, "malaria", 5000);
        patientDetails2 = new PatientDetails("Kelvin Abel", 2, 24, "malaria", 5000);
        receptionistOperation.registerPatients(patientDetails2);
    }

    @org.junit.jupiter.api.Test
    void registerPatients() {
        receptionistOperation.registerPatients(patientDetails1);
        assertEquals(2, receptionistOperation.viewPatients().size());
    }


    @org.junit.jupiter.api.Test
    void viewPatients() {
        assertEquals(1, receptionistOperation.viewPatients().size());
    }

}