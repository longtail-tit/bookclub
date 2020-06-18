<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>       
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
	    <c:forEach  items="${list}" var="vo" varStatus="index">
	      <tr>
	        <td>${index.count}</td>
	        <td><a href="./noticeOne?no=${vo.no}">${vo.title}</a></td>
	        <td>${vo.content}</td>
	        <td>${vo.writer}</td>
	        <td><fmt:formatDate value="${vo.regDate}" pattern="yyyy-MM-dd"/></td>
	        <td>${vo.hit}</td>
	      </tr>
	    </c:forEach>
    </tbody>
  </table>
  <a href="./noticeWrite" class="btn btn-danger">Write</a>
</div>

</body>
</html>