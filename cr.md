# CR BDD JPA TP1
## Exo1: Repnses aux question

1-Je n'ai pas pu observer la base de données, parceque ja connexion via pgAdmin m'est refusée.

2-Effets des propriétés de @Column:
   **unique=true**: l'attribut correspondant à cet @Column ne doit pas avoir la mème valeur pour deux instances d'objet différents dans la base de données.
   **precision=1**: l'attribut (qui est de type Double) correspondant à cet @Column doit avoir un seul chiffre après la virgule.

3-Il est nécessaire de mettre les annotations @Column :
    -lorsque on est en mode Validte, pour faire correspondre l'attribut qu'on est en train de créer à la bonne colonne de la table qu'on est en train de modeliser en entity.
    -ou lorsque on veut préciser une caractéristique particulière à l'attribut qu'on est en train de créer (unique par exemple).
