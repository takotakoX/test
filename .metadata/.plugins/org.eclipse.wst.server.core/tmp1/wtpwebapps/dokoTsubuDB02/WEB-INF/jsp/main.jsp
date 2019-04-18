<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>ありパンママ</title>
	</head>
	<body>
		<h1>ありパンママ</h1>
		<p>
			<c:out value="${loginUser.name}"/>さん、ログイン中<br>
			<a href="/dokoTsubuDB02/Logout">ログアウト</a>
		</p>
		<p>
			<a href="/dokoTsubuDB02/Main">更新</a>
		</p>
		<form action="/dokoTsubuDB02/Main" method="post">
			<input type="text" name="text">
			<input type="submit" value="つぶやく">
		</form>
		<c:if test="${not empty errorMsg}">
			<p>${errorMsg}</p>
		</c:if>
		<c:forEach var="mutter" items="${mutterList}">
			<p>
				<c:out value="${mutter.userName}"/>:
				<c:out value="${mutter.text}"/>
			</p>
		</c:forEach>
		<jsp:include page="/WEB-INF/jsp/footer.jsp"></jsp:include>
	</body>
</html>