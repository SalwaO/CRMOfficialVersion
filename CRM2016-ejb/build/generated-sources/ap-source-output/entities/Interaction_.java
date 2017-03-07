package entities;

import entities.InteractionType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-07T11:54:07")
@StaticMetamodel(Interaction.class)
public class Interaction_ { 

    public static volatile SingularAttribute<Interaction, Integer> interactionId;
    public static volatile SingularAttribute<Interaction, InteractionType> interactionType;
    public static volatile SingularAttribute<Interaction, Date> dateInteraction;
    public static volatile SingularAttribute<Interaction, String> contenu;

}