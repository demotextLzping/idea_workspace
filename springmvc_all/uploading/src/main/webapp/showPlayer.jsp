<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #playerTable {
            width: 50%;
            border: 3px solid gray;
            margin: 0px auto;
            text-align: center;
        }

        #playerTable th, td {
            border: 1px solid lightgreen;
        }

        #playerTable img {
            width: 140px;
            height: 115px;
        }
    </style>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $.ajax({
                type: "get",
                url: "getAllPlayer",
                success: function (player) {
                    $.each(player, function (i, e) {
                        $("#playerTable").append('<tr>\n' +
                            '<td>' + e.id + '</td>\n' +
                            '<td>' + e.name + '</td>\n' +
                            '<td>' + e.password + '</td>\n' +
                            '<td>' + e.nickname + '</td>\n' +
                            '<td>\n' +
                            '       <img src="http://192.168.0.107:8090/upload/' + e.photo + '" alt="">\n' +
                            '</td>\n' +
                            '<td>' +
                            '<a href="fileDownload.do?photo=' + e.photo + '&fileType=' + e.fileType + '">头像下载</a>\n' +
                            '</td>\n' +
                            '</tr>')
                    })
                }
            })
        })
    </script>
</head>
<body>
<table id="playerTable">
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>昵称</th>
        <th>头像</th>
        <th>操作</th>
    </tr>
</table>
</body>
</html>
