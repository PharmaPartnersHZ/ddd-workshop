package nl.pharmapartners.ddd.domain.model;

import lombok.Getter;
import nl.pharmapartners.ddd.domain.service.InschrijvenPatientCommand;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
//TODO 2: add the proper annotation from the annotations package here
public class Patient {


    private Naam naam;
    private BurgerServiceNummer burgerServiceNummer;
    private GeboorteDatum geboorteDatum;
    private Geslacht geslacht;

    public Patient(InschrijvenPatientCommand InschrijvenPatientCommand) {
        this.naam = new Naam(InschrijvenPatientCommand.getVoornaam(), InschrijvenPatientCommand.getAchternaam());
        this.burgerServiceNummer = new BurgerServiceNummer(InschrijvenPatientCommand.getBurgerServiceNummer());
        this.geboorteDatum = new GeboorteDatum(InschrijvenPatientCommand.getGeboorteDatum());
        this.geslacht = Geslacht.getGeslacht(InschrijvenPatientCommand.getGeslacht());
    }
}
