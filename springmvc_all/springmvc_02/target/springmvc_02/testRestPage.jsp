<%--
  Created by IntelliJ IDEA.
  User: Lzping
  Date: 2022/11/4
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isErrorPage="true"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="testRest/10010" method="post">
    <%--    请求中携带一个特殊的参数 _method 用该参数表PUT和DELETE--%>
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="PUT">
</form>
<form action="testRest/10010" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="DELETE">
</form>

<form action="testRest/10010" method="get">
    <input type="submit" value="GET">
</form>
<form action="testRest/10010" method="post">
    <input type="submit" value="POST">
</form>
</body>
</html>
