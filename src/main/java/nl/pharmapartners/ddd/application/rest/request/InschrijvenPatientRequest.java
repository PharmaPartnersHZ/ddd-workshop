package nl.pharmapartners.ddd.application.rest.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InschrijvenPatientRequest {

    private String voornaam;
    private String achternaam;
    private String geboorteDatum;
    private String geslacht;
    private String burgerServiceNummer;
}
