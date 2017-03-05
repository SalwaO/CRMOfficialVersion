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
    public Entreprise getEntrepriseByMail(String mail
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

    @Override
    public void ajouterEntreprise() {

        String nom;
        String prenom;
        String mail;
        String password;
        String pseudonyme;
        int i = 0;

        String csvFile = "/test.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] data = line.split(cvsSplitBy);

                nom = data[0];
                prenom = data[1];
                mail = data[2];
                password = data[3];
                pseudonyme = data[4];

                System.out.println("\t ********************************************************************************* ");

                System.out.println("nom :" + nom);
                System.out.println("prenom :" + prenom);
                System.out.println("mail :" + mail);
                System.out.println("password :" + password);
                System.out.println("pseudonyme :" + pseudonyme);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
