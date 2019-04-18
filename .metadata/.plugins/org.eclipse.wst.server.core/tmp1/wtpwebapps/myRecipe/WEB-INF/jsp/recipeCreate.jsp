<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>マイレシピ</title>
	</head>
	<body>
	<script type="text/javascript" src="script.js"></script>
		<h3>レシピ登録</h3>
		<c:if test="${not empty errorMsg}">
			<p>${errorMsg}</p>
		</c:if>
		<form action="/myRecipe/RecipeCreateServlet" method="post">
			料理名: <input type="text" name="dish"><br>
			材料1: <input type="text" name="ing01"><br>
			材料2: <input type="text" name="ing02"><br>
			材料3: <input type="text" name="ing03"><br>
			材料4: <input type="text" name="ing04"><br>
			材料5: <input type="text" name="ing05"><br>
			材料6: <input type="text" name="ing06"><br>
			材料7: <input type="text" name="ing07"><br>
			材料8: <input type="text" name="ing08"><br>
			材料9: <input type="text" name="ing09"><br>
			材料10: <input type="text" name="ing10"><br>
			調理時間:
			<script>
				document.write("<select name='cookingTime'>");
				for(var i=5;i<=60;i+=5){
					document.write("<option>");
					document.write(i);
					document.write("</option>");
				}
				document.write("</select>");
			</script>
			分<br>
			<input type="submit" value="登録">
			<p>
				<a href="/myRecipe/LoginServlet">戻る</a>
			</p>
		</form>
	</body>
</html>