<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="添加教师" />
<title>添加教师</title>

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
          <c:set var="schoolPage" scope="request" value="true" />
          <%@ include file="../side-nav.jsp"%>
        </ul>
      </div>
      <div class="col-lg-10">
        <form class="form-horizontal"
          action="<%=request.getContextPath()%>/school/add"
          method="POST">

          <div class="form-group">
            <label for="number" class="col-lg-2 control-label">学院号</label>
            <div class="col-lg-6">
              <input class="form-control" name="number"
                value="${school.number}" />
            </div>
            <div class="col-lg-4 hidden">
              <p class="text-danger">请输入学院号</p>
            </div>
          </div>

          <div class="form-group">
            <label for="name" class="col-lg-2 control-label">学院名称</label>
            <div class="col-lg-6">
              <input class="form-control" name="name"
                value="${school.name}" />
            </div>
            <div class="col-lg-4 hidden">
              <p class="text-danger">请输入学院名称</p>
            </div>
          </div>

          <div class="form-group">
            <label for="description" class="col-lg-2 control-label">简介</label>
            <div class="col-lg-6">
              <textarea name="description" class="form-control" rows="3">${school.description}</textarea>
            </div>
            <div class="col-lg-4 hidden">
              <p class="text-danger">请输入简介</p>
            </div>
          </div>

          <div class="form-group">
            <div class="col-lg-offset-2 col-lg-6">
              <button type="submit" class="btn btn-primary pull-left">保存</button>
              <a href="<%=request.getContextPath()%>/school"
                class="btn btn-primary pull-right">返回</a>
            </div>

          </div>
        </form>

      </div>
    </div>
  </div>

</body>
</html>

