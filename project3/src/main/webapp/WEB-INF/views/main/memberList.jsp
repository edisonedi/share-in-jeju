<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
<a href="admin_main">관리자 메인으로</a>
<form action="memberList.jsp">
<table>
<tr>
<th>이름</th>
<th>아이디</th>
<th>이메일</th>
<th>가입일</th>
<th>탈퇴여부</th>
<th>프로필 사진</th>
</tr>

<c:if test="${empty list }">
			<tr>
				<td colspan="7">검색결과가 없습니다</td>
			</tr>
		</c:if>
		<c:if test="${not empty list }">
			<c:forEach var="Member" items="${list}">
<tr>
<td>${Member.name }</td>
 <td>${Member.id}</td>
 <td>${Member.memberPhoto}</td>
 <td>${Member.reg_date}</td>
 <td>${Member.delete}</td>
	<td><input type = "button" value = "회원정보" onclick= "location.href = 'MemberList.jsp?id=${Member.id}&pageNum=${pagenum }'"></td>
	<td><input type = "button" value = "강제탈퇴" onclick= "location.href = 'memberDelete.jsp?id=${Member.id}'"></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

</form>
</body>
</html>
</body>
</html>