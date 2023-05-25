package nl.pharmapartners.ddd.domain.model;

import lombok.Data;

@Data
//TODO 2: add the proper annotation from the annotations package here
public class Naam {

    private String voornaam;
    private String achternaam;
    //TODO: optional - add a tussenvoegsel in the naam
    public Naam(String voornaam, String achternaam) {
        validateInput(voornaam, achternaam);
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    private void validateInput(String voornaam, String achternaam) {
        //TODO 5: apply business rules here (e.g. no numbers or empty strings)
        throw new IllegalArgumentException("Entered name was invalid");
    }
}
