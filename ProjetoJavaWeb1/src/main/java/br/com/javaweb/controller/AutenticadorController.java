package br.com.javaweb.controller;


import java.io.IOException;

import org.apache.catalina.connector.Response;

import br.com.javaweb.entidades.Usuario;
import br.com.javaweb.jdbc.UsuarioDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AutenticadorController
 */
public class AutenticadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutenticadorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession(false);
		
		if(sessao!=null){
			sessao.invalidate();
		}
		
		response.sendRedirect("login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando post autenticacao");
		
		//Recebe os parametros do login
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		//Cria o objeto
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		//Busca no banco
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuarioAutenticado = usuarioDAO.autenticarUsuario(usuario);
		
		if(usuarioAutenticado != null) {
			//Inicia a sessão
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioAutenticado", usuarioAutenticado);
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		} else {
			response.sendRedirect("login.html");
		}
	}

}
