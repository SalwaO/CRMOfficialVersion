/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.NoteStage;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Julian
 */
@Stateless
public class NoteStageFacade extends AbstractFacade<NoteStage> {

    @PersistenceContext
    private EntityManager entityManager;

    public NoteStageFacade() {
        super(NoteStage.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    public void persist(NoteStage noteStage) {
        create(noteStage);
    }

    public void merge(NoteStage noteStage) {
        edit(noteStage);
    }

    public void delete(NoteStage noteStage) {
        remove(noteStage);
    }

    public NoteStage get(int id) {
        return find(id);
    }

    public List<NoteStage> getAll() {
        return findAll();
    }

    public void ajouterLesNotesSage() {
        System.out.println("sessionbeans.NoteStageFacade.ajouterLesNotesSage()");
    }
}
