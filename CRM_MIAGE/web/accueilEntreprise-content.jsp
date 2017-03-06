<%-- 
    Document   : accueilEntreprise
    Created on : 5 mars 2017, 23:10:05
    Author     : sebastien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Les entreprises</title>
    </head>
    <body>
        <h1>Les entreprises</h1>
        <div id="menuPrincipal"> <!-- MENU POUR LES UTILISATEUR DU SITE -->
            <ul id="menu-der">
                <li><a href="index.jsp">Accueil</a></li>
                <li><a href="ajoutEntreprise.jsp">Ajouter une entreprise</a></li>
                <li><a href="ServletEntreprise?action=listerLesEntreprises">Lister les entreprise</a>
                <li><a href="ServletEntreprise?action=creerEntreprisesDeTest">Créer des entreprises de test</a>
                <li><a href="chercherEntreprise.jsp">Chercher une entreprise</a>
            </ul>
    </div>
    </body>
</html>
