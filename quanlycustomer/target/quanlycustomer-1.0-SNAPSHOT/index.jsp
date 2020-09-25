<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Customer" %>
<%@ page import="static service.CustomerService.listCustomer" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24/09/2020
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customr List</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
            text-align: left;
        }
    </style>
</head>
<body>
<h2>Customr List</h2>
<a href="add.jsp">Add</a>
<table width="100%">
    <thead>
    <tr>
        <th>Fullname</th>
        <th>Address</th>
        <th>Email</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <%
       ArrayList<Customer> customerArrayList = new ArrayList<>(listCustomer.values());
        for (Customer customer : customerArrayList) {
    %>
    <tr>
        <td><%=customer.getFullname()%>
        </td>
        <td><%=customer.getAddress()%>
        </td>
        <td><%=customer.getEmail()%>
        </td>
        <td><a href="edit.jsp?id=<%=customer.getId() %>">Sua |</a> <a href="delete?id=<%=customer.getId() %>">Xoa</a></td>
    </tr>
    <%}%>
    </tbody>
</table>
</body>
</html>
