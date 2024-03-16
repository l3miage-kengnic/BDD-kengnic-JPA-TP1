package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table(name="brand_miage")
public class BrandEntity {

    @Id
    private String compagany_name;
    @Column(length = 11)
    private String siretNumber;
    //Hello Cher Nicolas, à ce niveau on était un peu perdus
    //En fait on ne sais pas si BrandEntity c'est le nom de l'entité elle meme
    // ou si ça doit etre le nom du type de son attribut "type"
    // au final on a considéré que le type de l'attribut "type" c'est l'enum BrandType
    private BrandType type;

    @ManyToOne
    //une ou plusieurs Brands peuvent commercialser un produit "Product"
    private ProductEntity produit;


}
