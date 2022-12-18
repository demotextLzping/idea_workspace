<%--
  Created by IntelliJ IDEA.
  User: Lzping
  Date: 2022/11/4
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--传统方法--%>
<form action="getParamByRequest.do" method="get">
    <input type="text" name="username"><br/>
    <input type="text" name="password"><br/>
    <input type="submit" name="byRequest">
</form>
<form action="getParamByArgName.do" method="get">
    <input type="text" name="username"><br/>
    <input type="text" name="pwd"><br/>
    <input type="submit" name="noRequest">
</form>
</body>
</html>
