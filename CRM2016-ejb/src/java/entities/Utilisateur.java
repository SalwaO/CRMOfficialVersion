/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Julian
 */
@Entity
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int utilisateurId;
    
    private String username;
    private String password;
    private String prenom;
    private String nom;
    private String mail;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Interaction> interactions;

    public Utilisateur() {
    }

    public Utilisateur(String username, String password, String prenom, String nom, String mail) {
        this.username = username;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
        this.mail = mail;
        this.interactions = new ArrayList<>();
    }

    public int getId() {
        return utilisateurId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public List<Interaction> getInteractions() {
        return interactions;
    }

    public void addInteraction(Interaction i) {
        interactions.add(i);
    }

    public void removeInteraction(Interaction i) {
        interactions.remove(i);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) utilisateurId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        // TODO: Warning - this method won't work in the case the utilisateurId fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        
        Utilisateur other = (Utilisateur) object;
        
        return this.utilisateurId == other.utilisateurId;
    }

    @Override
    public String toString() {
        return "entities.Utilisateur[ utilisateurId=" + utilisateurId + " ]";
    } 
}
