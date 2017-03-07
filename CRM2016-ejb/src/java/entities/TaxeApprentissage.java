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
public class TaxeApprentissage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taxeAprentissageId;
    
    private double montant;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date année;

    public TaxeApprentissage() {
    }

    public TaxeApprentissage(double montant, Date année) {
        this.montant = montant;
        this.année = année;
    }

    public int getTaxeAprentissageId() {
        return taxeAprentissageId;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getAnnée() {
        return année;
    }

    public void setAnnée(Date année) {
        this.année = année;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) taxeAprentissageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        // TODO: Warning - this method won't work in the case the taxeAprentissageId fields are not set
        if (!(object instanceof TaxeApprentissage)) {
            return false;
        }
        
        TaxeApprentissage other = (TaxeApprentissage) object;
        
        return this.taxeAprentissageId == other.taxeAprentissageId;
    }

    @Override
    public String toString() {
        return "entities.TaxeApprentissage[ taxeAprentissageId=" + taxeAprentissageId + " ]";
    }
}
