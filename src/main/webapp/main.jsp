
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>main</title>
</head>
<body>
<p font-size:20px font-weight:800>用户主界面</p>
<p>用户:<input type="text"  readonly="readonly" style="border:none;" value=${username} /></p>
<a href="toBuy.do">点击购物</a><br>
<a href="toSearch.do">订单查询</a><br>
<%
    List<Integer> roleIds=(List<Integer>)session.getAttribute("roleIds");
    if(roleIds.contains(1)){
%>
<a href="toProducer.do">供应商查询</a>
<%
    }
%>
</body>
</html>
