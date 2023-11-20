package nl.pharmapartners.ddd.domain.model;

import lombok.Data;

@Data
//TODO 2: add the proper annotation from the annotations package here
public class BurgerServiceNummer {
    
    private String burgerServiceNummer;
    public BurgerServiceNummer(String burgerServiceNummer) {
        validateInput(burgerServiceNummer);
        this.burgerServiceNummer = burgerServiceNummer;
    }

    private void validateInput(String burgerServiceNummer) {
        //TODO 4: apply the proper business rules here
        throw new IllegalArgumentException("Entered BSN is not valid");
    }
}
