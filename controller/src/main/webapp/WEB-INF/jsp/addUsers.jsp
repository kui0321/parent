<%--
  Created by IntelliJ IDEA.
  User: STRIDE
  Date: 2021/1/12
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/users/addUsers" method="post">
        用户名：<input type="text" name="username"><br/>
        用户年龄：<input type="text" name="userage"><br/>
        <input type="submit" value="OK">
    </form>
</body>
</html>
