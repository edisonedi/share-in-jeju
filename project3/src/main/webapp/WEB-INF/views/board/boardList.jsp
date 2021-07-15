<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 게시글 리스트 -->
<title>Insert title here</title>
</head>
<body>

	<!-- 1. 전체 목록확인 -->
	<!-- 2. 글쓰기 -->
	<!-- 3. 내용 검색 -->
	<!-- 4. 작성자 검색 -->
<div class="container" align="center">
	<h2 class="text-primary">게시글 목록</h2>
<table class="table table-striped">
	<tr>
	<td>작성자번호</td>
	<td>작성자</td>
	<td>제목</td>
	<td>내용</td>
	<td>등록일</td>
	<td>좋아요</td>
	<td>수정</td>
	</tr>
	<c:if test="${empty boardList }">
		<tr><th colspan="5">부서정보가 없습니다</th></tr>
	</c:if>
	<c:if test="${not empty boardList }">
		<c:forEach var="board" items="${boardList}">
			<tr>
			<td>${board.bid }</td>
			<td>${board.writer }</td>
			<td>${board.title }</td>
			<td>${board.content }</td>
			<td>${board.regdate }</td>
			<td>${board.hit }</td>
			<td><a class="btn btn-warning btn-sm" 
				href="updateBoardForm.do?bid=${board.bid }">수정</a></td>
			<%-- <td><a class="btn btn-danger btn-sm" 
				onclick="del(${board.bid})">삭제</a></td>
			 --%>
			</tr> 
		</c:forEach>
	</c:if>
</table> 

</div>
<div align="center">
<a class="btn btn-info" href="boardInsertForm.do" >게시글 입력</a>
<a class="btn btn-default" href="">전 게시글목록</a>
</div>	
		
		

</body>
</html>