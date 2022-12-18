<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        #empTable {
            width: 80%;
            border: 1px solid pink;
            margin: 0px auto;
        }

        #empTable th, td {
            border: 1px solid gray;
            text-align: center;
        }
    </style>
</head>
<body>
<table id="empTable">
    <tr>
        <th>索引</th>
        <th>工号</th>
        <th>姓名</th>
        <th>岗位</th>
        <th>薪资</th>
        <th>部门</th>
    </tr>
    <#list empMap?keys as k>
        <tr>
            <td>${k_index}</td>
            <td>${k}</td>
            <td>${empMap[k].empno}</td>
            <td>${empMap[k].job}</td>
            <td>${empMap[k].sal}</td>
            <td>${empMap[k].deptno}</td>
        </tr>
    </#list>
</table>
</body>
</html>