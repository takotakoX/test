<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>マイレシピ</title>
	</head>
	<body>
		<h3>マイレシピの一覧</h3>
		<p>
			ID: <c:out value="${mailId}"/> でログイン中
		</p>
		<c:if test="${not empty errorMsg}">
			<p>${errorMsg}</p>
		</c:if>
		<table border=1>
			<tr>
				<th>料理</th>
				<th>材料1</th>
				<th>材料2</th>
				<th>材料3</th>
				<th>材料4</th>
				<th>材料5</th>
				<th>材料6</th>
				<th>材料7</th>
				<th>材料8</th>
				<th>材料9</th>
				<th>材料10</th>
				<th>調理時間</th>
				<th>削除する</th>
			</tr>
			<c:forEach var="recipe" items="${recipeList}">
				<tr>
					<td><c:out value="${recipe.dish}"/></td>
					<td><c:out value="${recipe.ing01}"/></td>
					<td><c:out value="${recipe.ing02}"/></td>
					<td><c:out value="${recipe.ing03}"/></td>
					<td><c:out value="${recipe.ing04}"/></td>
					<td><c:out value="${recipe.ing05}"/></td>
					<td><c:out value="${recipe.ing06}"/></td>
					<td><c:out value="${recipe.ing07}"/></td>
					<td><c:out value="${recipe.ing08}"/></td>
					<td><c:out value="${recipe.ing09}"/></td>
					<td><c:out value="${recipe.ing10}"/></td>
					<td><c:out value="${recipe.cookingTime}"/>分</td>
					<td>
						<form action="RecipeDeleteServlet" method="get">
							<input type="hidden" name="dish" value="${recipe.dish}">
							<input type="hidden" name="mailId" value="${mailId}">
							<input type="submit" value="削除">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
		<p>
			<a href="/myRecipe/RecipeCreateServlet">レシピ登録</a>
		</p>
		<p>
			<a href="/myRecipe/LogoutServlet">ログアウト</a><br>
		</p>
	</body>
</html>