<%--
  Created by IntelliJ IDEA.
  User: cyh
  Date: 2018/3/17
  Time: 7:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <script src="/js/jquery-1.12.3.min.js"></script>
    <script>
        $(document).ready(function(){
            $('#add_btn').click(function () {
                $('#from_id').attr("action","/stu/addStu")
                $('#from_id').submit()
            });
            $('#update_btn').click(function () {
                $('#from_id').attr("action","/stu/updateStu")
                $('#from_id').submit()
            });
        })
    </script>
</head>
<body>
    <form id="from_id" action="" method="post">
        <p>${stu.stuId}</p>
        <input type="hidden" name="stuId" value="${stu.stuId}"/>
        姓名<input type="text" name="stuName" value="${stu.stuName}"/><br />
        年龄<input type="text" name="stuAge" value="${stu.stuAge}"/><br />
        专业<input type="text" name="stuMajor" value="${stu.stuMajor}"/><br />
        <c:if test="${stu.stuName == null}">
            <input type="button" id="add_btn" value="添加"/>
        </c:if>
        <c:if test="${stu.stuName != null}" >
            <input type="button" id="update_btn" value="修改"/>
        </c:if>
    </form>
</body>
</html>
