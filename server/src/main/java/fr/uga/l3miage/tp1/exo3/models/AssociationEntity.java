package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AssociationEntity {

    @Id
    private String name;
    private String presidentName;
    private String treasureName;
    private String secretaryName;
    private AssociationType associationType;
    @ManyToOne
    //Une ou plusieurs association sont liées à une seule fédération en meme temps
    private FederationEntity federation;

}
