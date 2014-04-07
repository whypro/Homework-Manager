<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>


<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="查看所有教师">
<title>查看所有教师</title>

<link href="<%=request.getContextPath()%>/css/bootstrap.min.css"
  rel="stylesheet" />
<script type="text/javascript"
  src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script type="text/javascript"
  src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>

</head>

<body>
  <%@ include file="../header.jsp"%>
  <div class="container">
    <div class="row">
      <div class="col-lg-2">
        <ul class="nav nav-pills nav-stacked">
          <c:set var="teacherPage" scope="request" value="true" />
          <%@ include file="../side-nav.jsp"%>
        </ul>
      </div>
      <div class="col-lg-10">
        <table class="table table-hover table-responsive">
          <thead>
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
          </thead>
          <tbody>


            <c:forEach var='teacher' items="${teachers}">
              <tr id="${teacher.id} }">
                <td>${teacher.id}</td>
                <td>${teacher.number}</td>
                <td><a
                  href="<%=request.getContextPath()%>/teacher/${teacher.id}">
                    ${teacher.name} </a></td>
                <td>${teacher.gender}</td>
                <td>${teacher.telephone}</td>
                <td>${teacher.mobile}</td>
                <td>${teacher.email}</td>
                <td></td>
                <td>${teacher.description}</td>
                <td>
                  <form
                    action="<%=request.getContextPath()%>/teacher/${teacher.id}"
                    method="post">
                    <input type="hidden" name="_method" value="DELETE" />
                    <input class="btn btn-primary btn-xs" type="submit"
                      value="删除" />
                  </form>
                </td>
              </tr>
            </c:forEach>

          </tbody>

        </table>
        <a href="<%=request.getContextPath()%>/teacher/add"
          class="btn btn-primary">添加教师</a>
      </div>
    </div>
  </div>
</body>
</html>







