<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	String nomeEmpresa = (String) request.getAttribute("nomeEmpresa");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Nova empresa "<%= nomeEmpresa %>" cadastrada com sucesso!;
</body>
</html>