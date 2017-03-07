/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Entreprise;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mbuffa
 */
@Stateless
public class EntrepriseFacade extends AbstractFacade<Entreprise> {

    @PersistenceContext
    private EntityManager entityManager;

    public EntrepriseFacade() {
        super(Entreprise.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public void persist(Entreprise entreprise) {
        create(entreprise);
    }

    public void merge(Entreprise entreprise) {
        edit(entreprise);
    }

    public void delete(Entreprise entreprise) {
        remove(entreprise);
    }

    public Entreprise get(int id) {
        return find(id);
    }

    public List<Entreprise> getAll() {
        return findAll();
    }

    public void ajouterLesEntreprises() {
        System.out.println("sessionbeans.EntrepriseFacade.ajouterLesEntreprises()");
    }
}
