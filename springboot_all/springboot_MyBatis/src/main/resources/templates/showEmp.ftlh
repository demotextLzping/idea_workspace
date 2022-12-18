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
    <#list empList as emp> <#--类似于for(Emp emp :empList) -->
        <tr>
            <td>${emp_index}</td> //_index 得到循环的下标，使用方法为变量后直接跟_index,从0开始
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.sal}</td>
            <td>${emp.deptno}</td>
        </tr>
    </#list>
</table>
</body>
</html>