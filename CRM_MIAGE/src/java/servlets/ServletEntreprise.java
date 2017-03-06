/**
 *
 * @author sebastien
 */
package servlets;

import entities.Entreprise;
import gestionnaire.EntrepriseFacade;
import java.io.IOException;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletEntreprise", urlPatterns = {"/ServletEntreprise"})
public class ServletEntreprise extends HttpServlet{
    @EJB
    private EntrepriseFacade entrepriseFacade;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String action = request.getParameter("action");
        String nomEnt = request.getParameter("nomEnt");
        String adresseEnt = request.getParameter("adresseEnt");
        String cd = request.getParameter("cd");
        String ville = request.getParameter("ville");
        String description = request.getParameter("Description");
        String forwardTo ;
        String message ;
        
        if (action != null) {
 ///////////////////////// lister, creer, chercher, supprimer, modifier ...           
            if (action.equals("listerLesEntreprises")) {
                Collection<Entreprise> listeEntreprise = entrepriseFacade.getAllEntreprise();
                request.setAttribute("listeDesEntreprise", listeEntreprise);
                forwardTo = "index.jsp?action=listerLesEntreprises";
                message = "Liste des entreprises :";
                RequestDispatcher dp = request.getRequestDispatcher(forwardTo + "&message=" + message);
                dp.forward(request, response); 
            }
            if (action.equals("creerEntreprisesDeTest")) {
                entrepriseFacade.creerEntreprisesDeTest();
                Collection<Entreprise> listeEntreprise = entrepriseFacade.getAllEntreprise();
                request.setAttribute("listeDesEntreprise", listeEntreprise);
                forwardTo = "index.jsp?action=listerLesEntreprises";
                message = "Liste des entreprises :";
                RequestDispatcher dp = request.getRequestDispatcher(forwardTo + "&message=" + message);
                dp.forward(request, response); 
            }
            if (action.equals("ajouterEntreprise")) {
                entrepriseFacade.ajouterEntreprise(nomEnt, adresseEnt, cd, ville, description);
                Collection<Entreprise> listeEntreprise = entrepriseFacade.getAllEntreprise();
                request.setAttribute("listeDesEntreprises", listeEntreprise);
                forwardTo = "index.jsp?action=listerLesEntreprises";
                message = "Vous avez ajouté une entreprise !";
                RequestDispatcher dp = request.getRequestDispatcher(forwardTo + "&message=" + message);
                dp.forward(request, response);
            }
        }
    }
////////////////////////////////////// METHODES //////////////////
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

        response.setHeader("Pragma", "No-cache"); //empeche le cache, empeche de voir l'ancien etat d'une page
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-cache");
    }
}
