/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Interaction;
import entities.InteractionType;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Julian
 */
@Stateless
public class InteractionFacade extends AbstractFacade<Interaction> {

    @PersistenceContext
    private EntityManager entityManager;

    public InteractionFacade() {
        super(Interaction.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    public void persist(Interaction interaction) {
        create(interaction);
    }

    public Interaction get(int id) {
        return find(id);
    }

    public List<Interaction> getAll() {
        return findAll();
    }

    public void ajouterLesInteractions() {
        System.out.println("sessionbeans.InteractionFacade.ajouterLesInteractions()");
        Interaction interaction = new Interaction(InteractionType.TELEPHONE, "Sopra Steria cherche des stagiares de troisième année.");
        create(interaction);
    }
}
