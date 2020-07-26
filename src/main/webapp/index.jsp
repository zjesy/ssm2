<%--
  Created by IntelliJ IDEA.
  User: 86136
  Date: 2020/7/20
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<p font-size:20px font-weight:800>用户登陆</p>
<form action="login.do" method="post">
    name:<input name="username" type="text"><br>
    password:<input name="password" type="password"><br>
    <input type="submit" value="login">
</form>
<a href="registe.jsp">registe</a>
</body>
</html>
