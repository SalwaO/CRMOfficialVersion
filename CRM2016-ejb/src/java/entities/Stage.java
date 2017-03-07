/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Julian
 */
@Entity
public class Stage implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stageId;
    
    @Enumerated(EnumType.STRING)
    private StageType stageType;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    private String intitule;
    private String contenu;
    
    @OneToOne
    private Etudiant etudiant;
    
    @OneToOne
    private Entreprise entreprise;
    
    public Stage() {
    }

    public Stage(StageType stageType, Date dateDebut, Date dateFin, String intitule, String contenu, Etudiant etudiant, Entreprise entreprise) {
        this.stageType = stageType;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.intitule = intitule;
        this.contenu = contenu;
        this.etudiant = etudiant;
        this.entreprise = entreprise;
    }

    public int getStageId() {
        return stageId;
    }
    
    public StageType getStageType() {
        return stageType;
    }

    public void setStageType(StageType stageType) {
        this.stageType = stageType;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) stageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the stageId fields are not set
        if (!(object instanceof Stage)) {
            return false;
        }
        
        Stage other = (Stage) object;
        
        return this.stageId == other.stageId;
    }

    @Override
    public String toString() {
        return "entities.Stage[ stageId=" + stageId + " ]";
    }
}
