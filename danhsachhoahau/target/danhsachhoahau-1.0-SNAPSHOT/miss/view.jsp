<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 28/09/2020
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Information Miss</title>
    <style>
        a {
            text-decoration: none;
        }
        img{
            width: 100px;
            height: 100px;
        }
    </style>
</head>
<body>
<h1>Miss details</h1>
<p>
    <a href="/misss">back to miss list</a>
</p>
<p>
    <a href="/misss?action=duyet">back to list Approval</a>
</p>
<form>
    <fieldset>
        <legend>Miss Information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${requestScope['miss'].getName()}</td>
            </tr>
            <tr>
                <td>Brithday:</td>
                <td>${requestScope["miss"].getBrithday()}</td>
            </tr>
            <tr>
                <td>Address:</td>
                <td>${requestScope["miss"].getAddress()}</td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td>${requestScope["miss"].getPhone()}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${requestScope["miss"].getEmail()}</td>
            </tr>
            <tr>
                <td>Passport:</td>
                <td>${requestScope["miss"].getPassport()}</td>
            </tr>
            <tr>
                <td>Job:</td>
                <td>${requestScope["miss"].getJob()}</td>
            </tr>
            <tr>
                <td>Educational:</td>
                <td>${requestScope["miss"].getEducational()}</td>
            </tr>
            <tr>
                <td>Nation:</td>
                <td>${requestScope["miss"].getNation()}</td>
            </tr>
            <tr>
                <td>Studyunit:</td>
                <td>${requestScope["miss"].getStudyunit()}</td>
            </tr>
            <tr>
                <td>Heigth:</td>
                <td>${requestScope["miss"].getHeigth()}</td>
            </tr>
            <tr>
                <td>Weigth:</td>
                <td>${requestScope["miss"].getWeigth()}</td>
            </tr>
            <tr>
                <td>Gift:</td>
                <td>${requestScope["miss"].getGift()}</td>
            </tr>
            <tr>
                <td>Image:</td>
                <td><img src="${miss.getImage()} "></td>
            </tr>
            <tr>
                <td>Provincial:</td>
                <td>
                    <select name="provincial" id="cars">
                        <option value="provincial">Provincial</option>
                        <option value="Ha Noi">Ha Noi</option>
                        <option value="Hue">Hue</option>
                        <option value="Da Nang">Da Nang</option>
                        <option value="Nha Trang">Nha Trang</option>
                        <option value="Vung Tau">Vung Tau</option>
                        <option value="Ho Chi Minh">Ho Chi Minh</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Approval:</td>
                <td>${requestScope["miss"].getApproval()}</td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
