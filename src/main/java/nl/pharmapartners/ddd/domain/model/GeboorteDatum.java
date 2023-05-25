package nl.pharmapartners.ddd.domain.model;

import lombok.Data;
import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class GeboorteDatum {

    private LocalDate date;

    public GeboorteDatum(String geboortedatum) {
        LocalDate geboorteDatumAsDate = createGeboorteDatum(geboortedatum);
        validateGeboorteDatum(date);
        this.date = geboorteDatumAsDate;
    }

    private void validateGeboorteDatum(LocalDate date) {
        //TODO: apply business rules here
    }

    private LocalDate createGeboorteDatum(String geboorteDatum) {
        //deze wellicht nog even verplaatsen naar een util
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(geboorteDatum, dateTimeFormatter);
    }

}
