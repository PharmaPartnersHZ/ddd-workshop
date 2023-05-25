package nl.pharmapartners.ddd.infrastructure.repository.mapper;

import nl.pharmapartners.ddd.domain.model.Patient;
import nl.pharmapartners.ddd.infrastructure.repository.PatientEntity;
import org.springframework.stereotype.Component;

@Component
public class PatientEntityMapper {

    public PatientEntity toPatientEntity(Patient patient) {
        PatientEntity patientEntity = new PatientEntity();
        if (patient.getNaam() != null){
            patientEntity.setVoornaam(patient.getNaam().getVoornaam());
            patientEntity.setAchternaam(patient.getNaam().getAchternaam());
        }
        if (patient.getGeboorteDatum() != null) {
            patientEntity.setGeboorteDatum(patient.getGeboorteDatum().getDate());
        }
        if (patient.getBurgerServiceNummer() != null) {
            patientEntity.setBurgerServiceNummer(patient.getBurgerServiceNummer().getBurgerServiceNummer());
        }
        if (patient.getGeslacht() != null) {
            patientEntity.setGeslacht(patient.getGeslacht().getCode());
        }
        return patientEntity;
    }

}
