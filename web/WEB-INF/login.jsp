<%-- 
    Document   : login
    Created on : Oct 10, 2020, 5:58:53 PM
    Author     : 816076
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="login">
            <p style="display:inline;">Username: </p><input type="text" name="username" value="${username}"><br>
            <p style="display:inline;">Password: </p><input type="password" name="password" value="${password}"><br>
            <input type="submit" value="Log in"> 
            <p>${message}</p>
        </form>
    </body>
</html>
