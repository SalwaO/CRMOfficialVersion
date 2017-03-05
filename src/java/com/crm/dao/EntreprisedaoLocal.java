/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    void modifierEntreprise(Entreprise entreprise);

    void supprimerEntreprise(String mail);

    Entreprise getEntrepriseByMail(String mail);
    
    List<Entreprise> getEntrepriseByMailAndByPassword(String mail, String password);
    
    List<Entreprise> getAllEntreprises();

}
