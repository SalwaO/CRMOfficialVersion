/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfmanagedbeans;

import entities.Interaction;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sessionbeans.InteractionFacade;

/**
 *
 * @author Julian
 */
@Named(value = "interactionJSFManagedBean")
@ViewScoped
public class InteractionJSFManagedBean {

    @EJB
    private InteractionFacade interactionFacade;
    
    /**
     * Creates a new instance of InteractionJSFManagedBean
     */
    public InteractionJSFManagedBean() {
    }
    
    public List<Interaction> getAllInteraction() {
        return interactionFacade.findAll();
    }
    
    public String showInteractionDetails(int interactionId) {
        return "interactiondetails?interactionId=" + interactionId;
    }
}
