<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>请登录</title>
</head>
<body>
<%--<form action="login.do" method="post">--%>
<%--请输入用户名：<input type="text" name="username"> <br/>--%>
<%--请输入密码：<input type="password" name="password"> <br/>--%>
<%--<input type="submit" name="submit1" value="登录">--%>
<%--</form>--%>
<form action="dyna_actionform.do" method="post">
        姓名：<input type="text" name="username"> <br/>
        年龄：<input type="text" name="age"> <br/>
    <input type="submit" value="提交"><br>
</form>
    <li>测试上传</li>
    <br>
    <p>
        <form action="upload.do" method="post" enctype="multipart/form-data">
    标题：<input type="text" name="title"><br>
    文件：<input type="file" name="myfile"><br>
    <input type="submit" value="提交">

</form>
    </p>
<br>
<form action="type_convert.do" method="post">
    intValue:<input type="text" name="intValue"><br>
    doubleValue:<input type="text" name="doubleValue"><br>
    booleanValue:<input type="text" name="booleanValue"><br>
    java.sql.date<input type="text" name="sqlDate"><br>
    java.util.date<input type="text" name="sqlDate"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>