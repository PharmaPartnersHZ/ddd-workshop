package nl.pharmapartners.ddd.domain.service;

import lombok.RequiredArgsConstructor;
import nl.pharmapartners.ddd.domain.model.Patient;
import nl.pharmapartners.ddd.domain.repository.PatientRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PatientBeheerService implements PatientService {

    private final PatientRepository patientRepository;
    @Override
    // TODO 3: give the method a proper name
    public void aRandomName(InschrijvenPatientCommand InschrijvenPatientCommand) {
        Patient patient = new Patient(InschrijvenPatientCommand);
        patientRepository.aRandomName(patient);
    }
}
