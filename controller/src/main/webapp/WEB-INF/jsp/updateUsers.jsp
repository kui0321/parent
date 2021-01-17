<%--
  Created by IntelliJ IDEA.
  User: STRIDE
  Date: 2021/1/15
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/users/updateUsers" method="post">
        <input type="hidden" name="userid" value="${users.userid}">
        用户名：<input type="text" name="username" value="${users.username}"><br/>
        用户年龄：<input type="text" name="userage" value="${users.userage}"><br/>
        <input type="submit" value="OK">
    </form>
</body>
</html>
