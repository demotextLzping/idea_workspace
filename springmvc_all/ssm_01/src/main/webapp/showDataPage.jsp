<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>获取域中的数据</p>
requestScope:    message:    ${requestScope.message}    name:    ${requestScope.user[0].name}<br/>
sessionScope:    message:    ${sessionScope.message}    name:    ${sessionScope.user[0].name}<br/>
applicationScope:    message:    ${applicationScope.message}    name:    ${applicationScope.user[0].name}
<p>获取请求参数</p>
requestParam :    message:    ${param.message}
</body>
</html>
