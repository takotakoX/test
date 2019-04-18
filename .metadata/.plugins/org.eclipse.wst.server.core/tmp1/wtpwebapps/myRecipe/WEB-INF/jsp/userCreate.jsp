<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>マイレシピ</title>
	</head>
	<body>
		<h1>新規登録</h1>
		<c:if test="${not empty requestScope.errorMsg}">
			<p>${requestScope.errorMsg}</p>
		</c:if>
		<form action="/myRecipe/UserCreateServlet" method="post">
			メールアドレス: <input type="text" name="mail"><br>
			パスワード: <input type="text" name="pass"><br>
			<input type="submit" value="登録">
		</form>
		<p>
			<a href="/myRecipe">戻る</a>
		</p>
	</body>
</html>