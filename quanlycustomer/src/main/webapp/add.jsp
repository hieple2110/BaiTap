<%@ page import="service.CustomerService" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24/09/2020
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add customer</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h2>Add customer</h2>
    <a href="index.jsp">Tro lai</a>
    <form action="${pageContext.request.contextPath}/add" method="post">
        <label>Fullname: </label><br/>
        <input type="text" name="fullname"><br/>
        <label>Address: </label><br/>
        <input type="text" name="address"><br/>
        <label>Email: </label><br/>
        <input type="text" name="email"><br/>
        <input type="submit" id="submit" value="Add"/>
</form>
<%if (CustomerService.created){%>
    <%String str = "<script>alert('thanh cong')</script>";%>
    <%=str%>
<%}%>
<% CustomerService.created = false;%>
</body>
</html>
