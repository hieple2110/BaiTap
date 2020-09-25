<%@ page import="service.CustomerService" %>
<%@ page import="model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24/09/2020
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Edit customer</h2>
<a href="index.jsp">Tro lai</a>
<form action="edit" method="post">
    <%
        int id = Integer.parseInt(request.getParameter("id"));
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.getById(id);
    %>
    <label>Fullname: </label><br/>
    <input type="text" name="fullname" value="<%= customer.getFullname()%>"><br/>
    <label>Address: </label><br/>
    <input type="text" name="address" value="<%= customer.getAddress()%>"><br/>
    <label>Email: </label><br/>
    <input type="text" name="email" value="<%= customer.getEmail()%>"><br/>
    <input type="hidden" name="id" value="<%= customer.getId()%>">
    <input type="submit" id="submit" value="Edit"/>
</form>
</body>
</html>
