package br.com.javaweb.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public void alterarUsuario (Usuario usuario) {
		//SQL 
		String sql = "UPDATE USUARIO SET nome = ?, login = ?, senha = ? WHERE ID = ?";
		
		//Constroi prStm com o SQL
		try {
			PreparedStatement prStm = con.prepareStatement(sql);
			
			//Adiciona os valores nas variaveis da SQL
			prStm.setString(1, usuario.getNome());
			prStm.setString(2, usuario.getLogin());
			prStm.setString(3, usuario.getSenha());
			prStm.setInt(4, usuario.getId());
			
			prStm.execute();
			prStm.close();
			
			System.out.println("Alterado com sucesso");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void excluirUsuario (Usuario usuario) {
		//SQL 
		String sql = "DELETE FROM USUARIO WHERE ID = ?";
		
		//Constroi prStm com o SQL
		try {
			PreparedStatement prStm = con.prepareStatement(sql);
			
			//Adiciona os valores nas variaveis da SQL
			prStm.setInt(1, usuario.getId());
			
			prStm.execute();
			prStm.close();
			
			System.out.println("Excluído com sucesso");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public ArrayList<Usuario> listarUsuario () {
		//SQL 
		String sql = "SELECT * FROM USUARIO";
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		
		//Constroi prStm com o SQL
		try {
			PreparedStatement prStm = con.prepareStatement(sql);
			
			//ResultSet recebe a query retornada da pesquisa do banco
			ResultSet rs = prStm.executeQuery();
			
			while(rs.next()) {
				
				Usuario usuario = new Usuario();
				
				usuario.setId(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setLogin(rs.getString(3));
				usuario.setSenha(rs.getString(4));
				
				listaUsuarios.add(usuario);
				
			}
			
			rs.close();
			prStm.close();
			
			System.out.println("Listado com sucesso");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return listaUsuarios;
	}
	
	public Usuario buscarPorIdUsuario (Integer id) {
		//SQL 
		String sql = "SELECT * FROM USUARIO WHERE ID = ?";	

		Usuario usuario = null;
		
		//Constroi prStm com o SQL
		try {
			PreparedStatement prStm = con.prepareStatement(sql);
			
			prStm.setInt(1, id);
				
			//ResultSet recebe a query retornada da pesquisa do banco
			ResultSet rs = prStm.executeQuery();
			
			if(rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setLogin(rs.getString(3));
				usuario.setSenha(rs.getString(4));
			}
			
			rs.close();
			prStm.close();
					
			System.out.println("Localizado com sucesso");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
				
			return usuario;
	}
	
}
