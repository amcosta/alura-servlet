<%@page import="java.util.List"%>
<%@page import="dev.amcosta.servlet.Company"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de empresas</title>
</head>
<body>

	<h1>Lista de empresas cadastradas:</h1>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${companies}" var="company">
				<tr>
					<td>${company.getId()}</td>
					<td>${company.getName()}</td>
					<td>
						<a href="/gerenciador/editar-empresa?id=${company.getId()}">Editar</a>
						<a href="/gerenciador/deletar-empresa?id=${company.getId()}">Excluir</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>