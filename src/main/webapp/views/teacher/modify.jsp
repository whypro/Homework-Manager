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
          <c:set var="teacherPage" scope="request" value="true" />
          <%@ include file="../side-nav.jsp"%>
        </ul>
      </div>
      <div class="col-lg-10">
        <form class="form-horizontal"
          action="<%=request.getContextPath()%>/teacher/${teacher.id}"
          method="POST">
          <div class="form-group">
            <label for="number" class="col-lg-2 control-label">教师号</label>
            <div class="col-lg-6">
              <input class="form-control" name="number"
                value="${teacher.number}" />
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请输入教师号</p>
            </div>
          </div>


          <div class="form-group">
            <label for="name" class="col-lg-2 control-label">姓名</label>
            <div class="col-lg-6">
              <input class="form-control" name="name"
                value="${teacher.name}" />
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请输入姓名</p>
            </div>
          </div>

          <div class="form-group">
            <label for="password" class="col-lg-2 control-label">密码</label>
            <div class="col-lg-6">
              <input class="form-control" name="password"
                type="password" />
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请输入密码</p>
            </div>
          </div>
          <div class="form-group">
            <label for="password-again" class="col-lg-2 control-label">确认密码</label>
            <div class="col-lg-6">
              <input class="form-control" name="password-again"
                type="password" />
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请再次输入密码</p>
            </div>
          </div>
          <div class="form-group">
            <label for="gender" class="col-lg-2 control-label">性别</label>
            <div class="col-lg-6">
              <select name="gender" class="form-control">
                <option value="男"
                  <c:if test="${teacher.gender == '男'}"> selected</c:if>>男</option>
                <option value="女"
                  <c:if test="${teacher.gender == '女'}"> selected</c:if>>女</option>
              </select>
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请选择性别</p>
            </div>
          </div>

          <div class="form-group">
            <label for="telephone" class="col-lg-2 control-label">固定电话</label>
            <div class="col-lg-6">
              <input class="form-control" name="telephone"
                value="${teacher.telephone}" />
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请输入固定电话号码</p>
            </div>
          </div>

          <div class="form-group">
            <label for="mobile" class="col-lg-2 control-label">手机</label>
            <div class="col-lg-6">
              <input class="form-control" name="mobile"
                value="${teacher.mobile}" />
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请输入手机号码</p>
            </div>
          </div>


          <div class="form-group">
            <label for="email" class="col-lg-2 control-label">电子邮箱</label>
            <div class="col-lg-6">
              <input class="form-control" name="email" type="email"
                value="${teacher.email}" />
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请输入电子邮箱</p>
            </div>
          </div>

          <div class="form-group">
            <label for="school-id" class="col-lg-2 control-label">学院</label>
            <div class="col-lg-6">
              <select name=school-id class="form-control">
                <c:forEach var='school' items="${schools}">
                  <option value="${school.id}"
                    <c:if test="${teacher.schoolId == school.id}"> selected</c:if>>${school.name}</option>
                </c:forEach>
              </select>
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请选择学院</p>
            </div>
          </div>

          <div class="form-group">
            <label for="description" class="col-lg-2 control-label">简介</label>
            <div class="col-lg-6">
              <textarea name="description" class="form-control" rows="3">${teacher.description}</textarea>
            </div>
            <div class="col-lg-4">
              <p class="text-danger">请输入简介</p>
            </div>
          </div>

          <div class="form-group">
            <div class="col-lg-offset-2 col-lg-6">
              <button type="submit" class="btn btn-primary pull-left">保存</button>
              <a href="<%=request.getContextPath()%>/teacher"
                class="btn btn-primary pull-right">返回</a>
            </div>
            <input name="_method" type="hidden" value="PUT" />
          </div>
        </form>

      </div>
    </div>
  </div>

</body>
</html>

