/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Julian
 */
@Entity
public class NoteStage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double note;
    
    @OneToOne
    private Etudiant etudiant;
    
    @OneToOne
    private Stage stage;

    public NoteStage() {
    }

    public NoteStage(double note, Etudiant etudiant, Stage stage) {
        this.note = note;
        this.etudiant = etudiant;
        this.stage = stage;
    }

    public double getNote() {
        return note;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Stage getStage() {
        return stage;
    }
    
    public int getId() {
        return id;
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
        if (!(object instanceof NoteStage)) {
            return false;
        }
        
        NoteStage other = (NoteStage) object;
        
        if (this.id != other.id ) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "entities.NoteStage[ id=" + id + " ]";
    }
}
