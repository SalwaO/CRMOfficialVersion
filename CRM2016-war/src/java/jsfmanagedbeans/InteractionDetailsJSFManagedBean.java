/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfmanagedbeans;

import entities.Interaction;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sessionbeans.InteractionFacade;

/**
 *
 * @author Julian
 */
@Named(value = "interactionDetailJSFManagedBean")
@ViewScoped
public class InteractionDetailsJSFManagedBean {

    private int interactionId;
    private Interaction interaction;

    @EJB
    private InteractionFacade interactionFacade;

    /**
     * Creates a new instance of InteractionDetailJSFManagedBean
     */
    public InteractionDetailsJSFManagedBean() {
    }

    public int getInteractionId() {
        return interactionId;
    }

    public Interaction getInteraction() {
        return interaction;
    }

    public String back() {
        System.out.println("jsfmanagedbeans.InteractionDetailsJSFManagedBean.back()");
        return "index?faces-redirect=true";
    }

    public void loadInteraction() {
        this.interaction = interactionFacade.get(interactionId);
    }
}
