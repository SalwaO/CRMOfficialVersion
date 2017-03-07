package entities;

import entities.Etudiant;
import entities.Stage;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-07T11:54:07")
@StaticMetamodel(NoteStage.class)
public class NoteStage_ { 

    public static volatile SingularAttribute<NoteStage, Double> note;
    public static volatile SingularAttribute<NoteStage, Integer> noteStageId;
    public static volatile SingularAttribute<NoteStage, Stage> stage;
    public static volatile SingularAttribute<NoteStage, Etudiant> etudiant;

}