<%@page import="br.com.javaweb.entidades.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nome</th>
      <th scope="col">Login</th>
      <th scope="col">Senha</th>
    </tr>
  </thead>
  
  <%
	ArrayList<Usuario> lista = (ArrayList<Usuario>)  request.getAttribute("lista");
	for(Usuario u : lista){
	%>
  
  <tbody>
    <tr>
      <th scope="row"><%= u.getId() %></th>
      <td><%= u.getNome() %></td>
      <td><%= u.getLogin() %></td>
      <td><%= u.getSenha() %></td>
    </tr>
  </tbody>
  
  <%}%>
</table>
</body>
</html>