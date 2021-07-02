package br.com.javaweb.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.javaweb.entidades.Usuario;

public class UsuarioDAO {
	
	private Connection con = Conexao.getConnection();
	
	public void cadastrarUsuario (Usuario usuario) {
		//SQL 
		String sql = "INSERT INTO USUARIO (nome, login, senha) values (?,?,?)";
		
		//Constroi prStm com o SQL
		try {
			PreparedStatement prStm = con.prepareStatement(sql);
			
			//Adiciona os valores nas variaveis da SQL
			prStm.setString(1, usuario.getNome());
			prStm.setString(2, usuario.getLogin());
			prStm.setString(3, usuario.getSenha());
			
			prStm.execute();
			prStm.close();
			
			System.out.println("Inserido com sucesso");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
