package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_entity")
public class ProductEntity {

    @Id
    @Column(length = 15)
    private String bar_code_number;
    private String name;
    private boolean consumable;

    @OneToMany(mappedBy = "produit")
    // un produit "Product" peut etre commercialisé par une ou plusieures Brands
    // il suffit que la Brand aie le reference (l'id) de ce produit dans son catalogue
      // : d'où la non utilisation d'une table d'association, mais d'un mappedBy
    private Set<BrandEntity> brands;

}
