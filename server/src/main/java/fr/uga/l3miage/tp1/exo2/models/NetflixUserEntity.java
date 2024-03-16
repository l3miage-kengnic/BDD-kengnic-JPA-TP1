package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="netflix_user")
public class NetflixUserEntity {

    @Id
    private Long id;
    private String uuid;
    private String lastname;
    private String firstname;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private LocalDate birthDate;
    @OneToOne
    // Un user est lié (possédé) par un account
    //On peut accéder à l'account correspondant, connaissant un user
    private NetflixAccountEntity account;


}
