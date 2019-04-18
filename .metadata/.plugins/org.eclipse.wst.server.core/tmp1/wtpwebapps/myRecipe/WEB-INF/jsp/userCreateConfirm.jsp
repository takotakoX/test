<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>マイレシピ</title>
	</head>
	<body>
		<h3>以下の内容でよろしいですか？</h3>
		メールアドレス: ${tempUser.mail}<br>
		パスワード: ${tempUser.pass}<br>
		<form action="/myRecipe/UserCreateCompleteServlet" method="get">
			<input type="submit" value="完了">
		</form>
		<p>
			<a href="/myRecipe/UserCreateServlet">戻る</a>
		</p>
	</body>
</html>