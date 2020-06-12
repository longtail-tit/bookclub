<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="templates/boot.jsp" />
</head>
<body>
<c:import url="templates/header/header.jsp"/>

<div class="container">
  <h1>Notice</h1>
  <p>책 안읽어서 책 읽으려고 만나는 모임 공지사항 ~ </p>      
  <br/>      
  <br/>      
  <table class="table">
    <thead>
      <tr>
        <th>NO</th>
        <th>TITLE</th>
        <th>CONTENT</th>
        <th>WRITER</th>
        <th>DATE</th>
        <th>HIT</th>
      </tr>
    </thead>
    <tbody>
	    <c:forEach  items="${list}" var="vo">
	      <tr>
	        <td>${vo.no}</td>
	        <td>${vo.title}</td>
	        <td>${vo.content}</td>
	        <td>${vo.writer}</td>
	        <td>${vo.regDate}</td>
	        <td>${vo.hit}</td>
	      </tr>
	    </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>