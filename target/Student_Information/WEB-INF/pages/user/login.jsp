<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: cyh
  Date: 2018/3/16
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>用户登录</h2><hr>
<
<form action="/user/loginValidate" method="post">
    用户名:<input type="text" name="username"><br>
    密码<<input type="password" name="password">
    <button type="submit">登录</button>
</form>

</body>
</html>
