package model;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Receptionist> receptionists = new ArrayList<>();
    private List<Ward> wards = new ArrayList<>();

    public List<Doctor> doctors() {
        return doctors;
    }

    public void addDoctor(List<Doctor> doctor) {
            doctors = doctor;
        }
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }

    public List<Patient> viewpatients() {
        return patients;
    }

    public void addPatients(Patient patient) {
        this.patients.add(patient);
    }

    public List<Receptionist> receptionists() {
        return receptionists;
    }

    public void setReceptionists(List<Receptionist> receptionists) {
        this.receptionists = receptionists;
    }

    public List<Ward> wards() {
        return this.wards;
    }

    public void addWards(Ward ward) {
        this.wards.add(ward);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "doctors=" + doctors +
                ", patients=" + patients +
                ", receptionists=" + receptionists +
                ", wards=" + wards +
                '}';
    }
}
