<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 25/04/2018
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login form</title>
</head>
<body>
    <h2>Login</h2>
    <form method="post" action="/login">
        UserName: <input type="text" name="username"><br>
        PassWord: <input type="password" name="password"><br>
        <input type="submit" value="login">
    </form>
</body>
</html>
