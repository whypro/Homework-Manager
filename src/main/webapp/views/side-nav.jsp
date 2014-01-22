<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<li<c:if test="${teacherPage}"> class="active"</c:if>><a href="<%=request.getContextPath()%>/teacher">教师管理</a></li>
<li<c:if test="${coursePage}"> class="active"</c:if>><a href="<%=request.getContextPath()%>/course">课程管理</a></li>
<li<c:if test="${schoolPage}"> class="active"</c:if>><a href="<%=request.getContextPath()%>/school">学院管理</a></li>