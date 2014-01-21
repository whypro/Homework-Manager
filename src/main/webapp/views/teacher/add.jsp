<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
	<meta http-equiv="description" content="添加教师" />
	<title>添加教师</title>
</head>
<body>
<form action="" method="post">
    <ul>
       <li>
            <label for="number">教师号</label>
            <input name="number" />
        </li>
        <li>
            <label for="name">姓名</label>
            <input name="name" />
        </li>
        <li>
            <label for="password">密码</label>
            <input name="password" />
        </li>
        <li>
            <label for="password-again">确认密码</label>
            <input name="password-again" />
        </li>
        <li>
            <label for="gender">性别</label>
            <select name="gender">
               <option value="男">男</option>
               <option value="女">女</option>
            </select>
        </li>
        <li>
            <label for="telephone">固定电话</label>
            <input name="telephone" />
        </li>
        <li>
            <label for="mobile">手机</label>
            <input name="mobile" />
        </li>
        <li>
            <label for="email">电子邮箱</label>
            <input name="email" />
        </li>
        <li>
            <label for="school-id">学院ID</label>
            <input name="school-id" />
        </li>
        <li>
            <label for="description">简介</label>
            <input name="description" />
        </li>
    </ul>
    <input type="submit" value="注册" />
</form>
</body>
</html>

