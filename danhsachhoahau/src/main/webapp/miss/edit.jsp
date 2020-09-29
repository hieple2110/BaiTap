<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 28/09/2020
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Miss</title>
    <style>
        a{
            text-decoration: none;
        }
        .message{
            color: green;
        }
        img{
            width: 100px;
            height: 100px;
        }
    </style>
</head>
<body>
<h1>Edit Miss</h1>
<p>
    <c:if test="${requestScope['message']!=null}">
        <span class="message">${requestScope['message']}</span>
    </c:if>
</p>
<p>
    <a href="/misss">Back to miss list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Miss information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${miss.getName()}"></td>
            </tr>
            <tr>
                <td>Brith day:</td>
                <td><input type="text" name="brithday" id="brithday" value="${miss.getBrithday()}"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" id="address" value="${miss.getAddress()}"></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><input type="text" name="phone" id="phone" value="${miss.getPhone()}"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" id="email" value="${miss.getEmail()}"></td>
            </tr>
            <tr>
                <td>Passport:</td>
                <td><input type="text" name="passport" id="passport" value="${miss.getPassport()}"></td>
            </tr>
            <tr>
                <td>Job:</td>
                <td><input type="text" name="job" id="job" value="${miss.getJob()}"></td>
            </tr>
            <tr>
                <td>Educational:</td>
                <td><input type="text" name="educational" id="educational" value="${miss.getEducational()}"></td>
            </tr>
            <tr>
                <td>Nation:</td>
                <td><input type="text" name="nation" id="nation" value="${miss.getNation()}"></td>
            </tr>
            <tr>
                <td>Studyunit:</td>
                <td><input type="text" name="studyunit" id="studyunit" value="${miss.getStudyunit()}"></td>
            </tr>
            <tr>
                <td>Heigth:</td>
                <td><input type="text" name="heigth" id="heigth" value="${miss.getHeigth()}"></td>
            </tr>
            <tr>
                <td>Weigth:</td>
                <td><input type="text" name="weigth" id="weigth" value="${miss.getWeigth()}"></td>
            </tr>
            <tr>
                <td>Gift:</td>
                <td><input type="text" name="gift" id="gift" value="${miss.getGift()}"></td>
            </tr>
            <tr>
                <td>Image:</td>
<%--                <td><img  src="image/${miss.getImage()}" name="image" )></td>--%>
                <td><img src="${miss.getImage()} "></td>
            </tr>
            <tr>
                <td>Link Image:</td>
                <td><input type="text"  name="image" value="${miss.getImage()}"></td>
            </tr>
            <tr>
                <td>Provincial:</td>
<%--                <td><input type="text" name="provincial" id="provincial" value="${miss.getProvincial()}" ></td>--%>
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
                <td><input type="text" name="approval" id="approval" value="${miss.getApproval()}" ></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Edit Miss"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
