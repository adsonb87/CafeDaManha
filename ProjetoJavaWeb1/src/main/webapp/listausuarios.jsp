<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Lista EL</title>

<script type="text/javascript">

function confirmaExclusao(id){
	
	if(window.confirm("Confirma Exclusao")){
		location.href = "UsuarioController.do?acao=excluir&id="+id;
	}
	
}

</script>

</head>
<body>

<a href="index.jsp"> Menu Principal</a>
<a href="UsuarioController.do?acao=cadastrar"> Cadastrar Usuario</a>
<a href="UsuarioController.do?acao=listar"> Lista de Usuários</a>
<a href="AutenticadorController.do"> Sair</a>
	
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">Nome</th>
	      <th scope="col">Login</th>
	      <th scope="col">Senha</th>
	      <th scope="col">Acao</th>
	    </tr>
	  </thead>
	  
	  <c:forEach items="${requestScope.lista}" var="u">
		  <tbody>
		    <tr>
		      <th scope="row">${u.id}</th>
		      <td>${u.nome}</td>
		      <td>${u.login}</td>
		      <td>${u.senha}</td>
		      <td> 
		      	<a href="javascript:confirmaExclusao(${u.id})"> Excluir </a> 
		      	|
		      	<a href="UsuarioController.do?acao=alterar&id=${u.id}"> Alterar </a> 
		      </td>
		    </tr>
		  </tbody>
	    </c:forEach>
	</table>

</body>
</html>