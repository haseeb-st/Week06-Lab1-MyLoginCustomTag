<%-- 
    Document   : index
    Created on : Oct 4, 2017, 8:46:36 PM
    Author     : 687159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sait" uri="/WEB-INF/tlds/sait.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remember Me Login Page</title>
    </head>
    <body>
        <sait:DebugTag>
        <H2>Debug Info:</H2>
        ********************<BR>
        -Remote Host: ${pageContext.request.remoteHost}<BR>
        -Session ID: ${pageContext.session.id}<BR>
        ********************<BR>
        </sait:DebugTag>
        <h1>Remember Me Login Page</h1>
            <form action = "login" method="post">
                <ct:login user="${user}"/>
            </form>
        ${wrongValues}
    </body>
</html>
