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
    private int id;
    private String nom;
    private String adresse;
    private String codePostal;
    private String ville;
    private String description;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreation;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Interaction> interactions;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Stage> stages;

    public Entreprise() {
    }

    public Entreprise(int id, String nom, String adresse, String codePostal, String ville, String description) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.description = description;
    }

    public Entreprise(String nom, String adresse, String codePostal, String ville, String description) {
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.description = description;
        this.dateCreation = new Date();
        this.interactions = new ArrayList();
        this.stages = new ArrayList<>();
    }

    public Entreprise(String nom, String adresse, String codePostal, String ville, String description, Date dateCreation, List<Interaction> interactions, List<Stage> stages) {
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.description = description;
        this.dateCreation = dateCreation;
        this.interactions = interactions;
        this.stages = stages;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreation() {
        return dateCreation;
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
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entreprise)) {
            return false;
        }

        Entreprise other = (Entreprise) object;

        if (this.id != other.id) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "entities.Entreprise[ id=" + id + " ]";
    }
}
