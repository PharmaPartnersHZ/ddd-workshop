package nl.pharmapartners.ddd.domain.model;

import lombok.Data;

@Data
//TODO 2: add the proper annotation from the annotations package here
public class BurgerServiceNummer {
    
    private long burgerServiceNummer;
    public BurgerServiceNummer(String burgerServiceNummer) {
        validateInput(burgerServiceNummer);
        this.burgerServiceNummer = Long.parseLong(burgerServiceNummer);
    }

    private void validateInput(String burgerServiceNummer) {
        //TODO 4: apply the proper business rules here
        throw new IllegalArgumentException("Entered BSN is not valid");
    }
}
