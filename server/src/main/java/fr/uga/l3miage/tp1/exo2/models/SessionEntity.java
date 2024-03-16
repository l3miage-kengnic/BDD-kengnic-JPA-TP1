package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SessionEntity {

    @Id
    private String idSession;
    private String lastCommand;
    private String currentDir;
    private boolean lock;

    @OneToOne(mappedBy = "session")
    // une Session possède un User, pas l'inverse
    // quand meme on a une relation bidirectionnelle
    //car on peut accéder à la session, connaissant
    // son user
    private UserEntity user;

}
