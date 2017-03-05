/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table
@NamedQueries (@NamedQuery(name="Entreprise.getAll", query="SELECT e FROM Entreprise e"))
public class Entreprise implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id  
    @Column
    private String mail;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String pseudonyme;
    @Column
    private String password;
    

    
    public Entreprise() {
    }

    public Entreprise(String nom, String prenom, String mail, String password, String pseudonyme) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.password = password;
        this.pseudonyme =pseudonyme;
    }

    public String getMail() {
        return mail;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPseudonyme() {
        return pseudonyme;
    }

    public String getPassword() {
        return password;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPseudonyme(String pseudonyme) {
        this.pseudonyme = pseudonyme;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "com.test.model.Personne[ mail=" + mail+ " ]";
    }
    
}
