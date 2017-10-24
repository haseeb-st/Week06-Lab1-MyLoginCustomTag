<%-- 
    Document   : login
    Created on : Oct 24, 2017, 1:48:11 PM
    Author     : 687159
--%>

<%@tag description="Log In Tag" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="user"%>
<%@attribute name="pass"%>
<%@attribute name="remember"%>
<%@attribute name="submit"%>
<%-- any content can be specified here e.g.: --%>
Username: <input type="text" name="user"><br>
Password: <input type="password" name="pass"><br>
<input type="checkbox" name="remember"> Remember me
<input type="submit" value="submit" name="submit">