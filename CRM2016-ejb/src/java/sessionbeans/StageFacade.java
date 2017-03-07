/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Stage;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Julian
 */
@Stateless
public class StageFacade extends AbstractFacade<Stage> {

    @PersistenceContext
    private EntityManager entityManager;

    public StageFacade() {
        super(Stage.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    public void persist(Stage stage) {
        create(stage);
    }

    public void merge(Stage stage) {
        edit(stage);
    }

    public void delete(Stage stage) {
        remove(stage);
    }

    public Stage get(int id) {
        return find(id);
    }

    public List<Stage> getAll() {
        return findAll();
    }

    public void ajouterLesStages() {
        System.out.println("sessionbeans.StageFacade.ajouterLesStages()");
    }
}
