<%--
  Created by IntelliJ IDEA.
  User: STRIDE
  Date: 2021/1/15
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" align="center">
        <tr>
            <th>用户名</th>
            <th>年龄</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="user">
            <tr>
                <td>${user.username}</td>
                <td>${user.userage}</td>
                <td>
                    <a href="/users/preUpdateUser?userid=${user.userid}">更新</a>
                    <a href="/users/deleteUser?userid=${user.userid}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
