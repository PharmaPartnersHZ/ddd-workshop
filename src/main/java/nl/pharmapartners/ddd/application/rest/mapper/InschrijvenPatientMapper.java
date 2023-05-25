package nl.pharmapartners.ddd.application.rest.mapper;

import nl.pharmapartners.ddd.application.rest.request.InschrijvenPatientRequest;
import nl.pharmapartners.ddd.domain.service.InschrijvenPatientCommand;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class InschrijvenPatientMapper {

    public InschrijvenPatientCommand InschrijvenPatientCommand(InschrijvenPatientRequest inschrijvenPatientRequest) {
        final var InschrijvenPatientCommand = new InschrijvenPatientCommand();
        if (StringUtils.isNotBlank(inschrijvenPatientRequest.getGeboorteDatum())) {
            InschrijvenPatientCommand.setGeboorteDatum(inschrijvenPatientRequest.getGeboorteDatum());
        }
        if (StringUtils.isNotBlank(inschrijvenPatientRequest.getVoornaam())) {
            InschrijvenPatientCommand.setVoornaam(inschrijvenPatientRequest.getVoornaam());
        }
        if (StringUtils.isNotBlank(inschrijvenPatientRequest.getAchternaam())) {
            InschrijvenPatientCommand.setAchternaam(inschrijvenPatientRequest.getAchternaam());
        }
        if (StringUtils.isNotBlank(inschrijvenPatientRequest.getGeslacht())) {
            InschrijvenPatientCommand.setGeslacht(inschrijvenPatientRequest.getGeslacht());
        }
        if (StringUtils.isNotBlank(inschrijvenPatientRequest.getBurgerServiceNummer())) {
            InschrijvenPatientCommand.setBurgerServiceNummer(inschrijvenPatientRequest.getBurgerServiceNummer());
        }
        return InschrijvenPatientCommand;
    }
}
