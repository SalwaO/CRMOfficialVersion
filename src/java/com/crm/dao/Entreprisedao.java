/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.dao;

import com.crm.model.Entreprise;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class Entreprisedao implements EntreprisedaoLocal {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void ajouterEntreprise(Entreprise entreprise) {
        entityManager.persist(entreprise);
    }

    

    @Override
    public void modifierEntreprise(Entreprise entreprise) {
        entityManager.merge(entreprise);
    }


    @Override
    public void supprimerEntreprise(String mail
    ) {
        entityManager.remove(getEntrepriseByMail(mail));
    }

    @Override
    public Entreprise  getEntrepriseByMail(String mail
    ) {
        return entityManager.find(Entreprise.class, mail);
    }

    @Override
    public List<Entreprise> getEntrepriseByMailAndByPassword(String mail, String password
    ) {
        Query q = entityManager.createQuery("SELECT p FROM Entreprise p WHERE p.mail = :mail AND p.password = :password");
        q.setParameter("mail", mail);
        q.setParameter("password", password);
        return q.getResultList();
    }

    @Override
    public List<Entreprise> getAllEntreprises() {
        return entityManager.createNamedQuery("Entreprise.getAll").getResultList();
    }
    
    /*@Override
    public void ajouterEntreprise() {

        String nom;
        String prenom;
        String mail;
        String password;
        String pseudonyme;
        Entreprise entreprise;
        int i = 0;

        String csvFile = "D:/Userfiles/soutamha/Documents/reader/TestProject/src/java/resources/files/test.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader caf = new BufferedReader(new FileReader(csvFile))) {

            while ((line = caf.readLine()) != null) {

                i++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String[][] tab = new String[i][5];
            int j = 0;

            while ((line = br.readLine()) != null && j < i) {

                String[] data = line.split(cvsSplitBy);

                nom = data[0];
                prenom = data[1];
                mail = data[2];
                password = data[3];
                pseudonyme = data[4];

                tab[j][0] = nom;
                tab[j][1] = prenom;
                tab[j][2] = mail;
                tab[j][3] = password;
                tab[j][4] = pseudonyme;

                System.out.println("\t ********************************************************************************* ");

                System.out.println("nom :" + tab[j][0]);
                System.out.println("prenom :" + tab[j][1]);
                System.out.println("mail :" + tab[j][2]);
                System.out.println("password :" + tab[j][3]);
                System.out.println("pseudonyme :" + tab[j][4]);

                j++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

}

