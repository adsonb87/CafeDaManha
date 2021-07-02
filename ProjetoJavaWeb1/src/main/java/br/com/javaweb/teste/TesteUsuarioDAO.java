package br.com.javaweb.teste;

import br.com.javaweb.entidades.Usuario;
import br.com.javaweb.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Adson Souza", "Asouza", "123");
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		usuarioDao.cadastrarUsuario(usuario);

	}

}
