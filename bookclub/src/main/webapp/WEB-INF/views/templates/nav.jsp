<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="${pageContext.request.contextPath}/notice/board">공지사항  </a></li>
      <li><a href="#">이인증방</a></li>
      <li><a href="#">추천방</a> </li>
    </ul>
  </div>
</nav>