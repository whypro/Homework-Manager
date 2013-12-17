<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>查看教师</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="查看教师">
</head>

<body>
	<ul>
	    <li>ID: ${teacher.id}</li>
	    <li>教师号: ${teacher.number}</li>
	    <li>姓名: ${teacher.name}</li>
	    <li>性别: ${teacher.gender}</li>
	    <li>办公电话: ${teacher.telephone}</li>
	    <li>手机: ${teacher.mobile}</li>
	    <li>电子邮箱: ${teacher.email}</li>
	    <li>学院: </li>
	    <li>备注: ${teacher.description}</li>
	</ul>
</body>
</html>


