package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;

@Entity
public class UserEntity {

    @Id
    private Long idUser;
    private boolean SSO;
    private OffsetDateTime lastConnexion;
    @OneToOne
    // un User est lié à une Session
    private SessionEntity session;

}
