/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author mbuffa
 */
@Entity
public class Interaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int interactionId;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateInteraction;
    
    @Enumerated(EnumType.STRING)
    private InteractionType interactionType;
    
    @Column(columnDefinition = "LONG VARCHAR")
    private String contenu;

    public Interaction() {
    }

    public Interaction(InteractionType interactionType, String contenu) {
        this.dateInteraction = new Date();
        this.interactionType = interactionType;
        this.contenu = contenu;
    }

    public int getInteractionId() {
        return interactionId;
    }

    public Date getDateInteraction() {
        return dateInteraction;
    }

    public InteractionType getInteractionType() {
        return interactionType;
    }

    public String getContenu() {
        return contenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) interactionId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        // TODO: Warning - this method won't work in the case the interactionId fields are not set
        if (!(object instanceof Interaction)) {
            return false;
        }

        Interaction other = (Interaction) object;

        return this.interactionId == other.interactionId;
    }

    @Override
    public String toString() {
        return "entities.Interaction[ id=" + interactionId + " ]";
    }
}
