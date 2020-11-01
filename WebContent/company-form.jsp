<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de edição</title>
</head>
<body>

<form action="${formAction}" method="post">
	<input type="hidden" name="id" value="${company.getId()}" />

	<label for="name">Nome: </label>
	<input type="text" id="name" name="name" value="${company.getName()}" />
	
	<input type="submit" value="Salvar" />
</form>
</body>
</html>