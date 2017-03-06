<%-- 
    Author     : sebastien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRM MIAGE</title>
    </head>
    <body>
        <h1>Bienvenue sur le CRM Entreprise de la Miage</h1>
        
        <div id="message">    
        <!-- Message qui s'affiche lorsque la page est appelé avec un paramètre http message -->  
        <c:if test="${!empty param['message']}">  
            <h2>Message : ${param.message}</h2>  
        </c:if>  
            
        </div>
    <!-- TABLEAU DES ENTREPRISES -->   
        <div id="tableauEntreprise">
            <table class="listing">  

                <c:if test="${param['action'] == 'listerLesEntreprises'}" >  

                    <tr>  
                        <th>Nom</th>  
                        <th>Adresse</th>  
                        <th>Code postal</th>  
                        <th>Ville</th>  
                        <th>Description</th>
                    </tr>  
                    
                        <c:set var="total" value="0"/>  

                        <c:forEach var="e" items="${requestScope['listeDesEntreprises']}">  
                            <tr>  
                                <td>${e.nom}</td>  
                                <td>${e.adresse}</td>  
                                <td>${e.codePostal}</td> 
                                <td>${e.ville}</td> 
                                <td>${e.description}</td> 
                              
                                <!-- On compte le nombre de users -->  
                                <c:set var="total" value="${total+1}"/>  
                            </tr>  
                        </c:forEach>  

                        <!-- Affichage du solde total dans la dernière ligne du tableau -->  
                        <tr><td><b>TOTAL</b></td><td><b>${total}</b></td></tr>  

                </c:if>  
            </table>
        </div>  
                        
    </body>
</html>
