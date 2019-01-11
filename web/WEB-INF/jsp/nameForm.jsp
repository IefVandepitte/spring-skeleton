<%-- 
    Document   : nameForm
    Created on : 10-jan-2019, 14:28:54
    Author     : ief
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter your name</h1>
        <form:form method="POST" action="hello.htm"
                   modelAttribute="name">
            Name:
            
            <form:input path="value" size="15"/>
            <input type="submit" value="OK"/>
        </form:form>
    </body>
</html>
