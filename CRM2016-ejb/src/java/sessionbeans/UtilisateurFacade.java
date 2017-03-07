/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Utilisateur;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Julian
 */
@Stateless
public class UtilisateurFacade extends AbstractFacade<Utilisateur> {

    @PersistenceContext
    private EntityManager entityManager;

    public UtilisateurFacade() {
        super(Utilisateur.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public void persist(Utilisateur utilisateur) {
        create(utilisateur);
    }

    public void merge(Utilisateur utilisateur) {
        edit(utilisateur);
    }

    public Utilisateur get(int id) {
        return find(id);
    }

    public List<Utilisateur> getAll() {
        return findAll();
    }

    public void ajouterLesUtilisateurs() {
        System.out.println("sessionbeans.UtilisateurFacade.ajouterLesUtilisateurs()");
    }
}
