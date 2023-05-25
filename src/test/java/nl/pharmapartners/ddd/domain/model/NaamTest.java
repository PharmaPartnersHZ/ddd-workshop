package nl.pharmapartners.ddd.domain.model;

import org.junit.jupiter.api.Test;

public class NaamTest {

    @Test
    void naamIsValid() {
        final var voornaam = "Henk";
        final var achternaam = "de Groot";
        Naam naam = new Naam(voornaam, achternaam);
    }

    void naamIsInValid_whenVoornamIsAbsent() {
        final var achternaam = "de Groot";
        Naam naam = new Naam(null, achternaam);
    }

    //TODO: optional - add more tests here


}
