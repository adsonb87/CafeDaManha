package br.com.javaweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.javaweb.entidades.Usuario;
import br.com.javaweb.jdbc.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UsuarioController
 */
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando doGet");
		
		String nome = request.getParameter("nome");
		
		//System.out.println("nome:" + nome);
		
		String empresa = request.getParameter("empresa");
		
		//System.out.println("Empresa: " + empresa);
				
		PrintWriter saida = response.getWriter();
		
		saida.println("nome:" + nome + " Empresa: " + empresa);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando doPost");
		//doGet(request, response);
		
		String nome = request.getParameter("txtnome");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = new Usuario();
		
		usuario.setNome(nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
				
		usuarioDAO.cadastrarUsuario(usuario);
		
		PrintWriter saida = response.getWriter();
		saida.println("Cadastrado");
		
	}

}
