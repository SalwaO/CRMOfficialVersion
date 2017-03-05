/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private int id;
    
    private StageType stageType;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    private String intitule;
    private String contenu;

    public Stage() {
    }

    public Stage(StageType stageType, Date dateDebut, Date dateFin, String intitule, String contenu) {
        this.stageType = stageType;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.intitule = intitule;
        this.contenu = contenu;
    }

    public int getId() {
        return id;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stage)) {
            return false;
        }
        
        Stage other = (Stage) object;
        
        if (this.id != other.id) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "entities.Stage[ id=" + id + " ]";
    }
}
