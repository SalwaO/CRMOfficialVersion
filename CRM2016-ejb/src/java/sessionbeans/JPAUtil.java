/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;

/**
 *
 * @author mbuffa
 */
@Singleton
@Startup
@LocalBean
public class JPAUtil {
    
    @EJB
    private InteractionFacade interactionFacade;

    @EJB
    private UtilisateurFacade utilisateurFacade;
    
    @EJB
    private EtudiantFacade etudiantFacade;
    
    @EJB
    private StageFacade stageFacade;
    
    @EJB
    private NoteStageFacade noteStageFacade;
    
    @EJB
    private EntrepriseFacade entrepriseFacade;

    @EJB
    private TaxeApprentissageFacade taxeApprentissageFacade;
    
    @PostConstruct
    public void initializeDataBase() {
        System.out.println("sessionbeans.JPAUtil.initializeDataBase()");
        interactionFacade.ajouterLesInteractions();
        utilisateurFacade.ajouterLesUtilisateurs();
        etudiantFacade.ajouterLesEtudiants();
        stageFacade.ajouterLesStages();
        noteStageFacade.ajouterLesNotesSage();
        entrepriseFacade.ajouterLesEntreprises();
        taxeApprentissageFacade.ajouterLesTaxesApprentissage();
    }
}
