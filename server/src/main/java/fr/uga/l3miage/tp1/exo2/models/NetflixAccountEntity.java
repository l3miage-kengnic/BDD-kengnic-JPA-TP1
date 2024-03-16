package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {

    @Id
    private Long id;
    private int nb_devices;
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;
    @OneToOne(mappedBy="account")
    // un account posséde un user et pas l'inverse
    // quand meme on a une relation bidirectionnelle
      //car on peut accéder à l'account, connaissant
      // son user
    private NetflixUserEntity user ;
}
