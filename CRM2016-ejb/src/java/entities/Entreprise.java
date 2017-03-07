/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author mbuffa
 */
@Entity
public class Entreprise implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entrepriseId;
    
    private String nom;
    private String description;
    private String adresse;
    private String codePostal;
    private String ville;
    
    @Column(columnDefinition = "LONG VARCHAR")
    private String contacts;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreation;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Interaction> interactions;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Stage> stages;

    public Entreprise() {
    }

    public Entreprise(String nom, String description, String adresse, String codePostal, String ville, String contacts, Date dateCreation) {
        this.nom = nom;
        this.description = description;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.contacts = contacts;
        this.dateCreation = dateCreation;
        this.interactions = new ArrayList<>();
        this.stages = new ArrayList<>();
    }

    public int getEntrepriseId() {
        return entrepriseId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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

    public List<Stage> getStages() {
        return stages;
    }

    public void addStage(Stage stage) {
        stages.add(stage);
    }

    public void removeStage(Stage stage) {
        stages.remove(stage);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) entrepriseId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the entrepriseId fields are not set
        if (!(object instanceof Entreprise)) {
            return false;
        }

        Entreprise other = (Entreprise) object;

        return this.entrepriseId == other.entrepriseId;
    }

    @Override
    public String toString() {
        return "entities.Entreprise[ entrepriseId=" + entrepriseId + " ]";
    }
}
