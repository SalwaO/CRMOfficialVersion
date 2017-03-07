/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.TaxeApprentissage;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Julian
 */
@Stateless
public class TaxeApprentissageFacade extends AbstractFacade<TaxeApprentissage> {

    @PersistenceContext
    private EntityManager entityManager;

    public TaxeApprentissageFacade() {
        super(TaxeApprentissage.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    public void persist(TaxeApprentissage taxeApprentissage) {
        create(taxeApprentissage);
    }

    public void merge(TaxeApprentissage taxeApprentissage) {
        edit(taxeApprentissage);
    }

    public void delete(TaxeApprentissage taxeApprentissage) {
        remove(taxeApprentissage);
    }

    public TaxeApprentissage get(int id) {
        return find(id);
    }

    public List<TaxeApprentissage> getAll() {
        return findAll();
    }

    public void ajouterLesTaxesApprentissage() {
        System.out.println("sessionbeans.TaxeApprentissageFacade.ajouterLesTaxesApprentissage()");
    }
}
