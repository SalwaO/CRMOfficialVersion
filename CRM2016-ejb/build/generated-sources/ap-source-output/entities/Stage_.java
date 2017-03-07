package entities;

import entities.Entreprise;
import entities.Etudiant;
import entities.StageType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-07T12:25:13")
@StaticMetamodel(Stage.class)
public class Stage_ { 

    public static volatile SingularAttribute<Stage, Entreprise> entreprise;
    public static volatile SingularAttribute<Stage, StageType> stageType;
    public static volatile SingularAttribute<Stage, Date> dateDebut;
    public static volatile SingularAttribute<Stage, Date> dateFin;
    public static volatile SingularAttribute<Stage, String> intitule;
    public static volatile SingularAttribute<Stage, String> contenu;
    public static volatile SingularAttribute<Stage, Etudiant> etudiant;
    public static volatile SingularAttribute<Stage, Integer> stageId;

}