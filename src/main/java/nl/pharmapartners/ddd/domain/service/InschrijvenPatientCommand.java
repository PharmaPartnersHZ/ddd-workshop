package nl.pharmapartners.ddd.domain.service;

import lombok.Data;

@Data
public class InschrijvenPatientCommand {

    private String voornaam;
    private String achternaam;
    private String geboorteDatum;
    private String burgerServiceNummer;
    private String geslacht;

}
