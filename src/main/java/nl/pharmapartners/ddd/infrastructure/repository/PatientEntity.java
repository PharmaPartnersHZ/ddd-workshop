package nl.pharmapartners.ddd.infrastructure.repository;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Patient")
@Data
//TODO: optional - add another repository to store the patient in (e.g. Mongodb)
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String voornaam;

    @Column(nullable = false)
    private String achternaam;

    @Column(nullable = false)
    private String geslacht;

    @Column(nullable = false)
    private LocalDate geboorteDatum;

    @Column
    private Long burgerServiceNummer;

}
