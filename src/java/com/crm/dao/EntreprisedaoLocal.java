
package com.crm.dao;

import com.crm.model.Entreprise;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author soutamha
 */
@Local
public interface EntreprisedaoLocal {

    void ajouterEntreprise(Entreprise entreprise);

    void ajouterEntreprise();

    void modifierEntreprise(Entreprise entreprise);

    void supprimerEntreprise(String mail);

    Entreprise getEntrepriseByMail(String mail);

    List<Entreprise> getEntrepriseByMailAndByPassword(String mail, String password);

    List<Entreprise> getAllEntreprises();

}
