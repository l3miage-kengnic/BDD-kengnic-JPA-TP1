package fr.uga.l3miage.tp1.exo1.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class BikeEntity {
    @Id
    private String immatriculation;
    private Integer capacity;

    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber;

    private Boolean automatic;

    private Boolean shifter;

    private ShifterType shifterType;

    private LocalDate circulationDate;

}
