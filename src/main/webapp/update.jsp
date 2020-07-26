<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<p font-size:20px font-weight:800>更新订单</p>
<p>用户:<input type="text"   readonly="readonly" style="border:none;" value=${buyer} /></p>
<a href="toMain.do">返回主界面</a><br>
<form action="update.do?id=${id}" method="post">
    商品名称:<input name="itemname" type="text" placeholder="${itemname}"><br/>
    数量:<input name="sum" type="number" placeholder="${sum}"><br/>
    购买时间:<input type="text" readonly="readonly" placeholder="${time}"><br>
    <input type="submit" value="更新">
</form>
</body>
</html>
