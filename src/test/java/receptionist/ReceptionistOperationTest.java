package receptionist;

import HospitalRecords.Patient;
import HospitalRecords.Wards;
import operations.ReceptionistOperation;

import static org.junit.jupiter.api.Assertions.*;

class ReceptionistOperationTest {
    Wards ward1;
    Wards ward2;
    ReceptionistOperation receptionistOperation;
    Patient patientDetails1;
    Patient patientDetails2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        receptionistOperation = new ReceptionistOperation();
        ward1 = new Wards(2, "safety room", 15, 12);
        ward2 = new Wards(3, "quite room", 12, 8);

        patientDetails1 = new Patient("Daniel Abel", 2, 24, "malaria", 5000);
        patientDetails2 = new Patient("Kelvin Abel", 2, 24, "malaria", 5000);
        receptionistOperation.registerPatients(patientDetails2,ward1);
    }

    @org.junit.jupiter.api.Test
    void registerPatients() {
        receptionistOperation.registerPatients(patientDetails1,ward2);
        assertEquals(2, receptionistOperation.viewPatients().size());
    }


    @org.junit.jupiter.api.Test
    void viewPatients() {
        assertEquals(1, receptionistOperation.viewPatients().size());
    }

}