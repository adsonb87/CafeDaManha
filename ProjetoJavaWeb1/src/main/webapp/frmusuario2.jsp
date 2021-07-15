<%@page import="br.com.javaweb.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<%
			Usuario usuario = (Usuario) request.getAttribute("usuario");
		%>
		
		<form action="UsuarioController.do" method="post">
		
		<label> ID: </label>
		<input type="text" readonly="readonly" name="txtid" value="<%=usuario.getId()%>" size="20"/><br/>
		
		<label> Nome: </label>
		<input type="text" name="txtnome" value="<%=usuario.getNome()%>" size="20"/><br/>
		
		<label> Login: </label>
		<input type="text" name="txtlogin" value="<%=usuario.getLogin()%>" size="20"/><br/>
				
		<label> Senha: </label>
		<input type="password" name="txtsenha" value="<%=usuario.getSenha()%>" size="20"/><br/>
		
		
		<input type="submit" value="Salvar"/>
	
	
	</form>
	
</body>
</html>