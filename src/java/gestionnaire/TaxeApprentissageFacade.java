/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnaire;

import entities.TaxeApprentissage;
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
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TaxeApprentissageFacade() {
        super(TaxeApprentissage.class);
    }
    
}
