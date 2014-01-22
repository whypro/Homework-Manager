<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>


<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="查看所有课程">
<title>查看所有课程</title>

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
          <c:set var="coursePage" scope="request" value="true" />
          <%@ include file="../side-nav.jsp"%>
        </ul>
      </div>
      <div class="col-lg-10">
        <table class="table table-hover table-responsive">
          <thead>
            <tr>
              <th>ID</th>
              <th>课程号</th>
              <th>课程名称</th>
              <th>简介</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var='course' items="${courses}">
              <tr id="${course.id} }">
                <td>${course.id}</td>
                <td>${course.number}</td>
                <td><a
                  href="<%=request.getContextPath()%>/course/${course.id}">
                    ${course.name} </a></td>
                <td>${course.description}</td>
                <td>
                  <form
                    action="<%=request.getContextPath()%>/course/${course.id}"
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
        <a href="<%=request.getContextPath()%>/course/add"
          class="btn btn-primary">添加课程</a>
      </div>
    </div>
  </div>
</body>
</html>







