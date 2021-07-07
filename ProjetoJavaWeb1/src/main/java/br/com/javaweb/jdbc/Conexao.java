package br.com.javaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection() {
	
		Connection con = null;
		
		try {
			Class.forName("org.postresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProjetoJavaWeb1","postgres","admin");
			System.out.println("Conectado com sucesso");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Driver nao encontrado! " + e.getMessage());
		}
		
		return con;
	}
}
