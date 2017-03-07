/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Etudiant;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Julian
 */
@Stateless
public class EtudiantFacade extends AbstractFacade<Etudiant> {

    @PersistenceContext
    private EntityManager entityManager;

    public EtudiantFacade() {
        super(Etudiant.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    public void persist(Etudiant etudiant) {
        create(etudiant);
    }

    public void merge(Etudiant etudiant) {
        edit(etudiant);
    }

    public void delete(Etudiant etudiant) {
        remove(etudiant);
    }

    public Etudiant get(int id) {
        return find(id);
    }

    public List<Etudiant> getAll() {
        return findAll();
    }

    public void ajouterLesEtudiants() {
        System.out.println("sessionbeans.EtudiantFacade.ajouterLesEtudiants()");
    }
}
