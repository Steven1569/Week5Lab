<%-- 
    Document   : home
    Created on : Oct 9, 2022, 12:46:38 PM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>  
        <h1>Welcome ${user.username}</h1>
       <a href="login?logout">Log out</a>
      
    </body>
</html>
