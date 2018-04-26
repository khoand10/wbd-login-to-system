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
    <title>System</title>
  </head>
  <body>
    ${sessionScope.message}
    <h1>Welcome <%= request.getAttribute("user")%> to come back code gym!</h1>
  </body>
</html>
