package entities;

import entities.Stage;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-07T12:25:13")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ { 

    public static volatile SingularAttribute<Etudiant, String> mail;
    public static volatile ListAttribute<Etudiant, Stage> stages;
    public static volatile SingularAttribute<Etudiant, String> telephone;
    public static volatile SingularAttribute<Etudiant, Integer> etudiantId;
    public static volatile SingularAttribute<Etudiant, String> formation;
    public static volatile SingularAttribute<Etudiant, String> prenom;
    public static volatile SingularAttribute<Etudiant, String> nom;

}