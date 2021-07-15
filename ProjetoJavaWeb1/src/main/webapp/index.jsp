<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="UsuarioController.do?acao=cadastrar"> Cadastrar Usuario</a>
<a href="UsuarioController.do?acao=listar"> Lista de Usuários</a>
<a href="AutenticadorController.do"> Sair</a>
<h1>Seja bem vindo ${sessionScope.usuarioAutenticado.nome}</h1>

<img src="imagens/442554.png"/>
</body>
</html>