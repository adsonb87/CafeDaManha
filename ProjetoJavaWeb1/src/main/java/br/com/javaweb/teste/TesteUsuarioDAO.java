package br.com.javaweb.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.javaweb.entidades.Usuario;
import br.com.javaweb.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		
		testeExiste();

	}

	private static void testeCadastrar() {
		Usuario usuario = new Usuario("Adson Souza", "Asouza", "123");
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		usuarioDao.cadastrarUsuario(usuario);
	}
	
	private static void testeAlterar() {
		Usuario usuario = new Usuario("Pedro Henrique", "PedroH", "PH123");
		usuario.setId(9);
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		usuarioDao.alterarUsuario(usuario);
		
	}
	
	private static void testeExcluir() {
		Usuario usuario = new Usuario();
		usuario.setId(9);
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		usuarioDao.excluirUsuario(usuario);
	}
	
	private static void testeListar() {
		ArrayList<Usuario> listaUsuarios;
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		listaUsuarios = usuarioDAO.listarUsuario();
		
		for(Usuario u: listaUsuarios) {
			System.out.println(u.getId() + " " + u.getNome() + " " + u.getLogin() + " " + u.getSenha());
		}
		
	}
	
	private static void testeBuscarPorId () {
		
		Integer id = 1;
		
		Usuario usuario = new Usuario();
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		usuario = usuarioDAO.buscarPorIdUsuario(id);
		
		System.out.println("ID: " + usuario.getId() + " Nome: " + usuario.getNome() 
							+ " Login: " + usuario.getLogin() + " Senha: " + usuario.getSenha());
		
	}
	
	private static void testeBuscarPorNome () {
		
		String nome = "Juca da Silva";
		
		Usuario usuario = new Usuario();
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		usuario = usuarioDAO.buscarPorNomeUsuario(nome);
		
		System.out.println("ID: " + usuario.getId() + " Nome: " + usuario.getNome() 
							+ " Login: " + usuario.getLogin() + " Senha: " + usuario.getSenha());
		
	}
	
	private static void testeAutenticar() {
		
		Usuario user = new Usuario();
		user.setLogin("Asouza");
		user.setSenha("123");
		
		Usuario usuario = new Usuario();
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		usuario = usuarioDAO.autenticarUsuario(user);
		
		System.out.println("ID: " + usuario.getId() + " Nome: " + usuario.getNome() 
		+ " Login: " + usuario.getLogin() + " Senha: " + usuario.getSenha());
		
	}
	
private static void testeExiste() {
		
		Usuario user = new Usuario();
		user.setLogin("Jpedro");
		user.setSenha("d9b1d7db4cd6e70935368a1efb10e377");
						
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		if(usuarioDAO.existeUsuario(user)) {
			System.out.println("Usuario existe");
		}else {
			System.out.println("Usuario não existe");
		}
						
	}
}
