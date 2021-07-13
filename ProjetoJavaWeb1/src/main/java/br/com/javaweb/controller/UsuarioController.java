package br.com.javaweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import br.com.javaweb.entidades.Usuario;
import br.com.javaweb.jdbc.UsuarioDAO;
import jakarta.servlet.RequestDispatcher;
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
		
		String acao = request.getParameter("acao");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		if(acao != null && acao.equals("excluir")) {
			
			Usuario usuario = new Usuario();
			
			String id = request.getParameter("id");
				
			usuario.setId(Integer.parseInt(id));
			
			usuarioDAO.excluirUsuario(usuario);
			
		}
		
		if(acao != null && acao.equals("alterar")) {
			
			String id = request.getParameter("id");
			Usuario usuario = usuarioDAO.buscarPorIdUsuario(Integer.parseInt(id));
			
			request.setAttribute("usuario", usuario);
			
			RequestDispatcher saida = request.getRequestDispatcher("frmusuario.jsp");
			saida.forward(request, response);
			
		} 
		
		
		if(acao != null && acao.equals("cadastrar")) {
			
			Usuario usuario = new Usuario("", "", "");
			usuario.setId(0);
			
			request.setAttribute("usuario", usuario);
			
			RequestDispatcher saida = request.getRequestDispatcher("frmusuario.jsp");
			saida.forward(request, response);
			
		} 
		
		if(acao != null && acao.equals("listar")) {
			//Obtem a lista
			ArrayList<Usuario> listaUsuarios = usuarioDAO.listarUsuario();
			
			//Chamada JSP
			//Encapsular a lista
			request.setAttribute("lista", listaUsuarios);
			
			//Encaminhar ao JSP		
			RequestDispatcher saida = request.getRequestDispatcher("listausuarios.jsp");
			saida.forward(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando doPost");
		//doGet(request, response);
		
		String id = request.getParameter("txtid");
		String nome = request.getParameter("txtnome");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
				
		Usuario usuario = new Usuario();
		
		if(id!=null && id!="" && id!="0") {
			usuario.setId(Integer.parseInt(id));
		}
		
		usuario.setNome(nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvarUsuario(usuario);
		
		PrintWriter saida = response.getWriter();
		saida.println("Cadastrado");
		
	}

}
