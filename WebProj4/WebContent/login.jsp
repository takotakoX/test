<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>LOGIN</title>
</head>
<body>

<s:property value="loginDTOList.get(0).username"/>さん、ようこそ！

<br>
<table>
<tbody>
<tr>
	<th>USER NAME</th>
	<th>PASSWORD</th>
</tr>
<tr>
<s:iterator value="LoginDTOList">
	<td><s:property value="username"/></td>
	<td><s:property value="password"/></td>
</s:iterator>
</tr>
</tbody>
</table>

</body>
</html>