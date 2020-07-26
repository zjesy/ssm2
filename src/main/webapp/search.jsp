<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>search</title>
</head>
<body>
<p>用户:<input type="text"   readonly="readonly" style="border:none;" value=${username} /></p>
<p font-size:20px font-weight:800>订单信息</p>
<a href="toMain.do">返回主界面</a><br>

<form action="find.do" method="post" >

    商品名称:<input name="itemname" type="text" placeholder="itemname"><br/>

    <input type="submit" value="查询">
</form>

<table>
    <thead>
    <tr>
        <th >ID</th>
        <th >商品名</th>
        <th >商品数量</th>
        <th >购买时间</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.itemname}</td>
            <td>${item.sum}</td>
            <td>${item.time}</td>
            <td >
                <a href="delete.do?id=${item.id}" >删除</a>
                <a href="toUpdate.do?id=${item.id}" >修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
