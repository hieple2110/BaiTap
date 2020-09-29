<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 28/09/2020
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new Miss</title>
    <style>
        a {
            text-decoration: none;
        }

        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Create new Miss</h1>
<p>
    <c:if test="${requestScope['message']!=null}">
        <span class="message">${requestScope['message']}></span>
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
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Brith day:</td>
                <td><input type="text" name="brithday" id="brithday"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><input type="text" name="phone" id="phone"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td>Passport:</td>
                <td><input type="text" name="passport" id="passport"></td>
            </tr>
            <tr>
                <td>Job:</td>
                <td><input type="text" name="job" id="job"></td>
            </tr>
            <tr>
                <td>Educational:</td>
                <td><input type="text" name="educational" id="educational"></td>
            </tr>
            <tr>
                <td>Nation:</td>
                <td><input type="text" name="nation" id="nation"></td>
            </tr>
            <tr>
                <td>Studyunit:</td>
                <td><input type="text" name="studyunit" id="studyunit"></td>
            </tr>
            <tr>
                <td>Heigth:</td>
                <td><input type="text" name="heigth" id="heigth"></td>
            </tr>
            <tr>
                <td>Weigth:</td>
                <td><input type="text" name="weigth" id="weigth"></td>
            </tr>
            <tr>
                <td>Gift:</td>
                <td><input type="text" name="gift" id="gift"></td>
            </tr>
            <tr>
                <td>Image:</td>
                <td><input type="text" name="image" id="image"></td>

            </tr>
            <tr>
                <td>Provincial:</td>
                <%--                <td><input type="text" name="provincial" id="provincial"></td>--%>
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
                <td><input type="text" name="approval" id="approval"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create Miss"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
