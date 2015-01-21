package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Patient;

@ApplicationScoped
public class PatientManager {

    private List<Patient> db = new ArrayList<Patient>();

    public void addPatient(Patient patient) {
        Patient newPatient = new Patient();

        newPatient.setFirstName(patient.getFirstName());
        newPatient.setSecoundName(patient.getSecoundName());
        newPatient.setPhoneNumber(patient.getPhoneNumber());
        newPatient.setPin(patient.getPin());
        newPatient.setCity(patient.getCity());
        newPatient.setStreet(patient.getStreet());
        newPatient.setZipCode(patient.getZipCode());
        newPatient.setDoctorKind(patient.getDoctorKind());

        db.add(newPatient);
    }

    // Removes the Patient with given PIN
    public void deletePatient(Patient Patient) {
        Patient PatientToRemove = null;
        for (Patient p : db) {
            if (Patient.getPin().equals(p.getPin())) {
                PatientToRemove = p;
                break;
            }
        }
        if (PatientToRemove != null)
            db.remove(PatientToRemove);
    }

    public List<Patient> getAllPatients() {
        return db;
    }
}
