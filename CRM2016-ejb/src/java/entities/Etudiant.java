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
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int etudiantId;
    
    private String prenom;
    private String nom;
    private String formation;
    private String mail;
    private String telephone;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Stage> stages;

    public Etudiant() {
    }

    public Etudiant(String prenom, String nom, String formation, String mail, String telephone) {
        this.prenom = prenom;
        this.nom = nom;
        this.formation = formation;
        this.mail = mail;
        this.telephone = telephone;
        this.stages = new ArrayList<>();
    }
    
    public int getEtudiantId() {
        return etudiantId;
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

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Stage> getStages() {
        return stages;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) etudiantId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        // TODO: Warning - this method won't work in the case the etudiantId fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        
        Etudiant other = (Etudiant) object;
        
        return this.etudiantId == other.etudiantId;
    }

    @Override
    public String toString() {
        return "entities.Etudiant[ etudiantId=" + etudiantId + " ]";
    }
    
}
