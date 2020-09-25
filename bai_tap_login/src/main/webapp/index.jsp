<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 23/09/2020
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    <label>User</label><br>
    <input type="text" name="user" placeholder="User"><br>
    <label>Password</label><br>
    <input type="text" name="password" placeholder="Password"><br>
    <input type="submit" id="submit" value="Search">


</form>
</body>
</html>
