<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
<!--WRAP-->
<section id="wrap">
	<!--HGROUP-->
	<div class="hgroup"><h1>마이페이지</h1></div>
	<!--/HGROUP-->
	<table class="list_table">
	<caption class="skip">마이페이지</caption>	
		<col style="width:100px"><col style="width:80px">
		<col style="width:80px"><col>
		<col><col style="width:150px">
	<thead>
	<tr><th scope="col">아이디</th><th scope="col">이름</th>	
		<th scope="col">이메일</th><th scope="col">프로필 사진</th></tr>
	</thead>
	<tbody>
	<tr><td>${member.Id }</td><td>${member.Name }</td>	
		<td>${member.email}</td><td>${member.photo}</td>
		<td><input type="button" value="수정하기" onclick="location.href='update.jsp?Id=${member.Id}'">
			<input type="button" value="탈퇴하기" onclick="location.href='memberDelete.jsp?Id=${member.Id}'">
		</td>
	</tr>
	</tbody>
	</table>		
</section>	
</body>
</html>