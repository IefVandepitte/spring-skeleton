<%-- 
    Document   : memberForm
    Created on : 10-jan-2019, 21:03:47
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
        <form:form method="POST" action="registrationMember.htm"
                   commandName="registration">
            <form:input path="userName"/>
            <form:password path="password"/>
<!--            <input type="text" name="username" size="15"/>-->
            <input type="submit" value="OK"/>
            STUB
        </form:form>
    </body>
</html>
