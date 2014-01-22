<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>


<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="首页">
<title>首页</title>

<link href="<%=request.getContextPath()%>/css/bootstrap.min.css"
  rel="stylesheet" />
<script type="text/javascript"
  src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script type="text/javascript"
  src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>

</head>

<body>
  <%@ include file="header.jsp"%>
  <div class="container">
    <div class="row">
      <div id="carousel-slide" class="carousel slide"
        data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#carousel-slide" data-slide-to="0"
            class="active"></li>
          <li data-target="#carousel-slide" data-slide-to="1"></li>
          <li data-target="#carousel-slide" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
          <div class="item active">
            <img src="<%=request.getContextPath()%>/img/mass_01_06.jpg">
            <div class="carousel-caption"></div>
          </div>
          <div class="item">
            <img src="<%=request.getContextPath()%>/img/mass_01_07.jpg">
            <div class="carousel-caption"></div>
          </div>
          <div class="item">
            <img src="<%=request.getContextPath()%>/img/mass_01_17.jpg">
            <div class="carousel-caption"></div>
          </div>
          <div class="item">
            <img src="<%=request.getContextPath()%>/img/mass_01_26.jpg">
            <div class="carousel-caption"></div>
          </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-slide"
          data-slide="prev"> <span
          class="glyphicon glyphicon-chevron-left"></span>
        </a> <a class="right carousel-control" href="#carousel-slide"
          data-slide="next"> <span
          class="glyphicon glyphicon-chevron-right"></span>
        </a>
      </div>
      
    </div>
    <div class="row text-center">
     <a href="<%=request.getContextPath()%>/teacher" class="btn btn-primary">开始体验</a>
     </div>
        
  </div>
</body>
</html>