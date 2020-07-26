<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>buy</title>
</head>
<body>
<p font-size:20px font-weight:800>购物模块</p>
<p>用户:<input type="text"   readonly="readonly" style="border:none;" value=${username} /></p>
<a href="toMain.do">返回主界面</a><br>

<form action="buy.do" method="post">
    商品名称:<input name="itemname" type="text"><br/>
    数量:<input name="sum" type="number"><br/>
    <input type="submit" value="购买">
</form>

</body>
</html>
