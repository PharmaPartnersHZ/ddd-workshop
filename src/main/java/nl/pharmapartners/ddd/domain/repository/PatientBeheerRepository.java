package nl.pharmapartners.ddd.domain.repository;


import lombok.RequiredArgsConstructor;
import nl.pharmapartners.ddd.domain.model.Patient;
import nl.pharmapartners.ddd.infrastructure.repository.H2PatientRepository;
import nl.pharmapartners.ddd.infrastructure.repository.mapper.PatientEntityMapper;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class PatientBeheerRepository implements PatientRepository {

    private final H2PatientRepository h2PatientRepository;

    private final PatientEntityMapper patientEntityMapper;

    @Override
    //TODO 3: give the method a proper name
    public void aRandomName(Patient patient) {
        h2PatientRepository.save(patientEntityMapper.toPatientEntity(patient));
    }
}
