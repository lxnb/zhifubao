<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>持名法州主页</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.min.js"></script>
    <script type="text/javascript">
        function del() {
            $.ajax({
                type : "delete",
                url : "${pageContext.request.contextPath}/restful/deleteUser/3/2",
                /*async : true,*/
            });
        }

        function upd() {
            $.ajax({
                type : "put",
                data:"id=1&name=王五&password=654321&city=中国",
                url : "${pageContext.request.contextPath}/restful/udateUser",
                async : true
            });
        }
    </script>
<body>
<!-- 删除 -->
<button id="btn" onclick="del()">delete request</button>
<!-- 更新 -->
<button id="btn2" onclick="upd()">update request</button>
<!-- 增加 -->
<form action="${pageContext.request.contextPath}/restful/addUser" method="post">
    name<input type="text" name="name" />
    password<input type="text" name="password" />
    city<input type="text" name="city" />
    <input type="submit" value="submit" />
</form>
<!-- 查询 -->
<a href="${pageContext.request.contextPath}/restful/getUser/1">select request</a>

</body>
</html>