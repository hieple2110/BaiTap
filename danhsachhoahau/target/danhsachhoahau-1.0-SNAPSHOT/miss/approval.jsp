<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 29/09/2020
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Approval</title>
    <style>
        a{
            text-decoration: none;
        }
        img{
            width: 100px;
            height: 100px;
        }
    </style>

</head>
<body>
<h1>List Approval</h1>
<p>
    <a href="/misss">Back to Miss list</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Brithday</td>
        <td>Address</td>
        <td>Phone</td>
        <td>Email</td>
        <td>Passport</td>
        <td>Job</td>
        <td>Educational</td>
        <td>Nation</td>
        <td>Studyunit</td>
        <td>Heigth</td>
        <td>Weigth</td>
        <td>Gift</td>
        <td>Provincial</td>
        <td>Approval</td>
    </tr>
    <c:forEach items='${requestScope["miss"]}' var="misses">
        <tr>
            <td><a href="/misss?action=view&id=${misses.getId()}">${misses.getName()}</a></td>
            <td>${misses.getBrithday()}</td>
            <td>${misses.getAddress()}</td>
            <td>${misses.getPhone()}</td>
            <td>${misses.getEmail()}</td>
            <td>${misses.getPassport()}</td>
            <td>${misses.getJob()}</td>
            <td>${misses.getEducational()}</td>
            <td>${misses.getNation()}</td>
            <td>${misses.getStudyunit()}</td>
            <td>${misses.getHeigth()}</td>
            <td>${misses.getWeigth()}</td>
            <td>${misses.getGift()}</td>
            <td>${misses.getProvincial()}</td>
            <td>${misses.getApproval()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
