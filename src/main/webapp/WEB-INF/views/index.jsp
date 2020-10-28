<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
	Date nowTime = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Insert title here</title>
	<!-- link style sheet -->
	<link rel="stylesheet" href="/helloweb/resources/styles/style.css">
</head>
<body>
	<h1>Spring Index Page</h1>
	<h3>현재 날짜와 시간은 <%= nowTime %> 입니다.
	<br>-------------------------------------------------------------------<br>
	현재 날짜와 시간은 <%= sf.format(nowTime) %> 입니다.</h3>
	<img alt="스프링 이미지" src="/helloweb/resources/images/spring.png">
</body>
</html>