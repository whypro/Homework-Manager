<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>查看所有教师</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="查看所有教师">
</head>

<body>
    <table>
        <tr>
            <th>ID</th>
            <th>教师号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>办公电话</th>
            <th>手机</th>
            <th>电子邮箱</th>
            <th>学院</th>
            <th>备注</th>
            <th></th>
        </tr>
    
    <c:forEach var='teacher' items="${teachers}">
        <tr>
            <td>${teacher.id}</td>
            <td>${teacher.number}</td>
            <td>
                <a href="<%=request.getContextPath()%>/teacher/${teacher.id}">
                    ${teacher.name}
                </a>
            </td>
            <td>${teacher.gender}</td>
            <td>${teacher.telephone}</td>
            <td>${teacher.mobile}</td>
            <td>${teacher.email}</td>
            <td></td>
            <td>${teacher.description}</td>
            <td>
            <form action="<%=request.getContextPath()%>/teacher/${teacher.id}" method="post">
            <input type="hidden" name="_method" value="DELETE" />
            <input type="submit" value="删除" />
            </form>
            </td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>


