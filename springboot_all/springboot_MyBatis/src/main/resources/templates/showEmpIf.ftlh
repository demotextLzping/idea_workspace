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
        <th>上级</th>
        <th>薪资</th>
        <th>补助</th>
        <th>部门</th>
    </tr>
    <#if empListIf??>
        <#list empListIf as emp>
            <tr <#if emp_index%2==0> style="background-color: gray" </#if> >
                <td>${emp_index}</td>
                <td>${emp.empno}</td>
                <td <#if emp.ename=='king'>style="color:aqua"</#if>> ${emp.ename}</td>
                <td>${emp.job}</td>
                <td>${emp.mgr!'无'}</td>
                <td <#if emp.sal gte 2000> style="color: red" </#if>> ${emp.sal}</td>
                <td>${emp.comm!'0'}</td>
                <td>${emp.deptno}</td>
            </tr>
        </#list>
    </#if>
</table>
</body>
</html>