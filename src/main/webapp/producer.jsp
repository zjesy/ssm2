<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>producer</title>
</head>
<body>
<p font-size:20px font-weight:800>用户主界面</p>
<p>用户:<input type="text"  readonly="readonly" style="border:none;" value=${username} /></p>
<a href="toMain.do">返回主界面</a>
<table>
    <thead>
    <tr>
        <th >产品编码</th>
        <th >产品品牌</th>
        <th >产品名</th>
        <th >供应商</th>
        <th >电话</th>
        <th >地址</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="info">
        <tr>
            <td>${info.proCode}</td>
            <td>${info.proName}</td>
            <td>${info.proDesc}</td>
            <td>${info.proContact}</td>
            <td>${info.proPhone}</td>
            <td>${info.proAddress}</td>

            <td >
                <a href="#" >删除</a>
                <a href="#" >修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>