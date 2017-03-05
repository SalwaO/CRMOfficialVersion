
package com.crm.controller;

import com.crm.dao.EntreprisedaoLocal;
import com.crm.model.Entreprise;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author soutamha
 */
@WebServlet(name = "EntrepriseSevlet", urlPatterns = {"/EntrepriseSevlet"})
public class EntrepriseSevlet extends HttpServlet {

    
       @EJB
    private EntreprisedaoLocal entrepriseDao;
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String action = request.getParameter("action");
        String mail = request.getParameter("mail");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudonyme = request.getParameter("pseudonyme");
        String password = request.getParameter("password");
       
        
        Entreprise entreprise= new Entreprise(nom,prenom,mail,password,pseudonyme);
        
        if ("Add".equalsIgnoreCase(action)){
            
            entrepriseDao.ajouterEntreprise(entreprise);           
        }else if ("Edit".equalsIgnoreCase(action)){
            
           entrepriseDao.modifierEntreprise(entreprise);
           
        }else if ("Delete".equalsIgnoreCase(action)){
            
            entrepriseDao.supprimerEntreprise(mail);
            
        }else if ("Search".equalsIgnoreCase(action)){
            
            entreprise = entrepriseDao.getEntrepriseByMail(mail);            
        }
        
        request.setAttribute("entreprise", entreprise);
        request.setAttribute("allEntreprise", entrepriseDao.getAllEntreprises());
        request.getRequestDispatcher("homepage.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
