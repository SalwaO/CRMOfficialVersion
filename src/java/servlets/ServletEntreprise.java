/**
 *
 * @author sebastien
 */
package servlets;

import gestionnaire.GestionnaireEntreprise;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletEntreprise", urlPatterns = {"/ServletEntreprise"})
public class ServletEntreprise extends HttpServlet {

    @EJB
    private GestionnaireEntreprise gestionnaireEntreprise;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String action = request.getParameter("action");
        String forwardTo = "";
        String message = "";

        if (action != null) {
            ///////////////////////// lister, creer, chercher, supprimer, modifier ...           
            if (action.equals("listerLesEntreprises")) {

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
        // On récupère le contenu du formulaire  
        String lastName = request.getParameter("nom");
        String firstName = request.getParameter("prenom");
        String login = request.getParameter("login");

        response.setHeader("Pragma", "No-cache"); //empeche le cache, empeche de voir l'ancien etat d'une page
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-cache");
    }
}
