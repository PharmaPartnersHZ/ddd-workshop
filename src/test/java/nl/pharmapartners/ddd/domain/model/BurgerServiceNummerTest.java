package nl.pharmapartners.ddd.domain.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

public class BurgerServiceNummerTest {

    @Test
    void burgerServiceNummerIsValid() {
        final var bsn = "613891041";
        BurgerServiceNummer burgerServiceNummer = new BurgerServiceNummer(bsn);
    }

    @Test
    void burgerServiceNummerIsInvalid_whenAmountOfDigitsIsNot8Or9() {
        final var bsn = "6891041";
        assertThrows(IllegalArgumentException.class, () -> new BurgerServiceNummer(bsn));
    }

    @Test
    void burgerServiceNummerIsInvalid_when11ProefFails() {
        final var bsn = "689331041";
        assertThrows(IllegalArgumentException.class, () -> new BurgerServiceNummer(bsn));
    }
}
