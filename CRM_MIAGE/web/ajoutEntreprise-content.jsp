<%-- 
    Document   : ajoutEntreprise-content
    Created on : 6 mars 2017, 06:20:07
    Author     : sebastien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajout d'une entreprise</title>
    </head>
    <body>
        <h1>Ajouter une entreprise</h1>
        
            <form action="ServletEntreprise" method="get">  
                        Nom : <input type="text" name="nomEnt" value="${e.nom}"/><br> 
                        Adresse : <input type="text" name="adresseEnt" value="${e.adresse}"/><br>  
                        Code Postal : <input type="number" name="cd" value="${e.codePostal} "/><br> 
                        Ville : <input type="text" name="Ville" value="${e.Ville} "/><br> 
                        Description : <input type="text" name="Description" value="${e.description} "/><br> 
                        <input type="hidden" name="action" value="ajouterEntreprise"/>  
                        <input type="submit" value="Ajouter" name="submit"/>  
            </form> 
        
        
        
    </body>
</html>
