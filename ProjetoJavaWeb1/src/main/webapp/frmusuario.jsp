<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro EL</title>
</head>
<body>

<a href="index.jsp"> Menu Principal</a>
<a href="UsuarioController.do?acao=cadastrar"> Cadastrar Usuario</a>
<a href="UsuarioController.do?acao=listar"> Lista de Usuários</a>
<a href="AutenticadorController.do"> Sair</a>

	<form action="UsuarioController.do" method="post">
		
		<label> ID: </label>
		<input type="text" readonly="readonly" name="txtid" value="${requestScope.usuario.id}" size="20"/><br/>
		
		<label> Nome: </label>
		<input type="text" name="txtnome" value="${requestScope.usuario.nome}" size="20"/><br/>
		
		<label> Login: </label>
		<input type="text" name="txtlogin" value="${requestScope.usuario.login}" size="20"/><br/>
				
		<label> Senha: </label>
		<input type="password" name="txtsenha" value="${requestScope.usuario.senha}" size="20"/><br/>
		
		
		<input type="submit" value="Salvar"/>
	
	
	</form>
	
</body>
</html>