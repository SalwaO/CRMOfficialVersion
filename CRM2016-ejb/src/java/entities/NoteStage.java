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
    private int noteStageId;

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

    public int getNoteStageId() {
        return noteStageId;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }
    
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) noteStageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        // TODO: Warning - this method won't work in the case the noteStageId fields are not set
        if (!(object instanceof NoteStage)) {
            return false;
        }

        NoteStage other = (NoteStage) object;

        return this.noteStageId == other.noteStageId;
    }

    @Override
    public String toString() {
        return "entities.NoteStage[ id=" + noteStageId + " ]";
    }
}
