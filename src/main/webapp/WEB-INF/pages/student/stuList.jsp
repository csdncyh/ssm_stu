<%--
  Created by IntelliJ IDEA.
  User: cyh
  Date: 2018/3/16
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生管理系统</title>
    <script src="/js/jquery-1.12.3.min.js"></script>
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/jquery.bootgrid.min.css">
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="/js/jquery.bootgrid.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap-datetimepicker.min.js"></script>
    <link rel="stylesheet" href="/css/bootstrap-datetimepicker.min.css" type="text/css"></link>

    <script>
        $(document).ready(function(){
            $('#query_btn').click(function () {
                var value = $('#query_text').val()
                window.location.href = ("/stu/getStuById/"+value)
            })

        });
    </script>
</head>
<body>

<table border="1">
    <a href="/stu/addPage">新增</a><br>
    <input id="query_text" type="text" /><button id="query_btn">按id搜索</button>

    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>专业</th>
    </tr>
    <c:forEach items="${stus}" var="stu">
        <tr>
            <td>${stu.stuId}</td>
            <td>${stu.stuName}</td>
            <td>${stu.stuAge}</td>
            <td>${stu.stuMajor}</td>
            <td><a href="/stu/addPage/${stu.stuId}">修改</a></td>
            <td><a href="/stu/deleteStu/${stu.stuId}">删除</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
