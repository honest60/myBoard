<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/myBoard.css"/>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="resources/script/myBoard.js"></script>
<title>myBoard</title>
</head>
<body>
	<header class="header" onclick="home()">My Board</header>
	
	<div class="nav">
		<div class="nav_left">메뉴1</div>
		<div class="nav_left">메뉴2</div>
		<div class="nav_left">메뉴3</div>
		<div class="nav_right">검색</div>
	</div>
	
	<div class="contents">
		<div class="main">
			<div class="main_title">타이틀</div>
			<div class="main_contents">내용</div>
		</div>
		<div class="sub">
			<div class="sub_category">
				카테고리
			</div>
			<div class="sub_new">
				최신글
			</div>
		</div>
	</div>
	
	<footer class="footer">아래입니다</footer>
	<c:forEach items="${list}" var="list">
		file_num = ${list.file_num}<br>
		file_name = ${list.file_name}<br>
	</c:forEach>
	
</body>
</html>