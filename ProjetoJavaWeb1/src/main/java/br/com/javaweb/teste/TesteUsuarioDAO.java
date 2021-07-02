package br.com.javaweb.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.javaweb.entidades.Usuario;
import br.com.javaweb.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		
		testeBuscarPorId();

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
}
