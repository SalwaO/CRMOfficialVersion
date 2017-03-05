<%-- 
    Document   : homepage
    Created on : 01-Mar-2017, 15:36:53
    Author     : soutamha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD Test for CRM Application</title>
    </head>
    <body>
        <h1>List of People</h1>

        <form action ="./EntrepriseSevlet" method="POST">
            <table>
                <tr>
                    <td>Nom</td>
                    <td><input type="text" name="nom" value="${entreprise.nom}"/></td>
                </tr>
                <tr>
                    <td>Presom</td>
                    <td><input type="text" name="prenom" value="${entreprise.prenom}"/></td>
                </tr>
                <tr>
                    <td>Mail</td>
                    <td><input type="text" name="mail" value="${entreprise.mail}"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><td><input type="text" name="password" value="${entreprise.password}"/></td></td>
                </tr>
                <tr>
                    <td>Pseydoname</td>
                    <td><td><input type="text" name="pseudonyme" value="${entreprise.pseudonyme}"/></td></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add"/>
                        <input type="submit" name="action" value="Edit"/>
                        <input type="submit" name="action" value="Delete"/>
                        <input type="submit" name="action" value="Search"/>
                    </td>
                </tr>
            </table>
        </form>

        <br>
        <table border="1">

            <th>Nom</th>
            <th>Prenom</th>
            <th>Mail</th>
            <th>Password</th>
            <th>Pseudoname</th>

            <c:forEach items="${allEntreprise}" var="cust">
                <tr>
                    <td>${cust.nom}</td>
                    <td>${cust.prenom}</td>
                    <td>${cust.mail}</td>
                    <td>${cust.password}</td>
                    <td>${cust.pseudonyme}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>

