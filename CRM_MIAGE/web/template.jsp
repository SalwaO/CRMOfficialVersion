<%-- 
    Document   : template
    Created on : 12 févr. 2017, 14:46:38
    Author     : sebastien
--%>
 <%@ page language="java" contentType="text/html; charset=UTF-8"  
        pageEncoding="UTF-8"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

    <html>  
    <head>  
    <title>${param.title}</title>  
    <link rel="stylesheet" type="text/css"  
        href="${pageContext.request.contextPath}/resources/style.css" />  
    <link rel="stylesheet" type="text/css"  
        href="${pageContext.request.contextPath}/resources/header-login-signup.css" />     
   
    </head>  
    <body>  
        <jsp:include page="header.jsp"/>  
          
        <h1>${param.title}</h1>  
      
        <jsp:include page="${param.content}.jsp"/>  
          
        <jsp:include page="footer.jsp"/>  
          
          
    </body>  
    </html>  