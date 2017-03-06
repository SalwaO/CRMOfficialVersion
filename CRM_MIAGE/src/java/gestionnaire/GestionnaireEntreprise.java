/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnaire;

import entities.Entreprise;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
@LocalBean
public class GestionnaireEntreprise {

    @PersistenceContext
    private EntityManager em;
    
    public Collection<Entreprise> getAllEntreprise() {
        // Exécution d'une requête équivalente à un select *  
        Query q = em.createQuery("select e from Entreprise e");
        return q.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    // Creer une entreprise
    
    // rechercher une entreprise
    
    // renvoyer toutes les entreprises
    
}
