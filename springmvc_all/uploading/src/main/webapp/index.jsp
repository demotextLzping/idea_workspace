<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#uploadFile").click(function () {
                //获取要上传的文件
                var photoFile = $("#photo")[0].files[0]
                //判断是否获取达到文件(是否选择了文件)
                if (photoFile == undefined) {
                    alert("还未选择任何文件！")
                    return;
                }
                //将文件装进FormData对象
                var formData = new FormData();
                formData.append("headPhoto", photoFile)
                //使用ajax向后台传递数数据
                $.ajax({
                    type: "post",
                    data: formData,
                    url: "fileUpload.do",
                    processData: false,
                    contentType: false,
                    success: function (result) {
                        //提示框，提示操作信息
                        alert(result.message)
                        //获取头像的地址称，在页面中显示头像
                        $("#headImg").attr("src", "http://127.0.0.1:8090/upload/" + result.newFileName);
                        //获取头像的的名称，并赋值给photoInput，方便数据库操作
                        $("#photoInput").val(result.newFileName)
                        //获取头像的类型，并赋值给fileTypeInput，方便数据库操作
                        $("#fileTypeInput").val(result.fileType)
                    },
                    //进度条代码
                    xhr: function () {
                        var xhr = new XMLHttpRequest();
                        //使用XMLHttpRequest.upload监听上传过程，注册progress事件，打印回调函数中的event事件
                        xhr.upload.addEventListener('progress', function (e) {
                            console.log(e);
                            //loaded代表上传了多少
                            //total代表总数为多少
                            var progressRate = (e.loaded / e.total) * 100 + '%';

                            //通过设置进度条的宽度达到效果
                            $('.progress > div').css('width', progressRate);
                        })
                        return xhr;
                    }
                })
            })
        })
    </script>
    <style>
        <%--        进度条--%>
        /*https://www.cnblogs.com/wuyu1787/p/8919588.html#:~:text=jQuery.ajax%E6%96%87%E4%BB%B6%E4%B8%8A%E4%BC%A0%E8%BF%9B%E5%BA%A6%E6%9D%A1%20XMLHttpRequest.upload%20%E5%90%91%E5%90%8E%E5%8F%B0%E4%B8%8A%E4%BC%A0%E6%96%87%E4%BB%B6%E6%97%B6%E7%9B%91%E5%90%AC%E8%BF%9B%E5%BA%A6%EF%BC%8C%E4%B8%BB%E8%A6%81%E4%BD%BF%E7%94%A8%E7%9A%84%E6%98%AF%20XMLHttpRequest%20%E6%8F%90%E4%BE%9B%E7%9A%84,upload%20%E6%96%B9%E6%B3%95%EF%BC%8C%E6%AD%A4%E6%96%B9%E6%B3%95%E4%BC%9A%E8%BF%94%E5%9B%9E%E4%B8%80%E4%B8%AA%20XMLHttpRequestUpload%20%E5%AF%B9%E8%B1%A1%EF%BC%8C%E7%94%A8%E6%9D%A5%E8%A1%A8%E7%A4%BA%E4%B8%8A%E4%BC%A0%E8%BF%9B%E5%BA%A6%20%E3%80%82*/
        .progress {
            width: 210px;
            height: 10px;
            border: 1px solid #ccc;
            border-radius: 10px;
            margin: 10px 0px;
            overflow: hidden;
        }

        /* 初始状态设置进度条宽度为0px */
        .progress > div {
            width: 0px;
            height: 100%;
            background-color: hotpink;
            transition: all .3s ease;
        }
    </style>
</head>
<body>
<form action="addPlayer" method="get">
    <p>账号: <input type="text" name="name"/></p>
    <p>密码: <input type="password" name="password"/></p>
    <p>昵称: <input type="text" name="nickname"/></p>
    <p>头像: <input id="photo" type="file"/><br/>
        <img id="headImg"  style="width: 210px;height: 180px;" alt="您还未上传图片"><br/>
        <a id="uploadFile" href="javascript:void(0)">立即上传</a>
    <div class="progress">
        <div></div>
    </div>
    </p>
    <input id="photoInput" type="hidden" name="photo"/>
    <input id="fileTypeInput" type="hidden" name="fileType"/>
    <p><input type="submit" name="注册" style="width: 80px"/></p>
</form>
</body>
</html>
