package br.com.javaweb.controller;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet Filter implementation class FiltroAutenticacao
 */
public class FiltroAutenticacao implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroAutenticacao() {
        
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//Casting o HttpServlet Request
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		String url = httpServletRequest.getRequestURI();
				
		//Capturar a sessão
		HttpSession sessao = httpServletRequest.getSession();
		
		//Está logado
		if(sessao.getAttribute("usuarioAutenticado")!= null || url.lastIndexOf("login.html")>-1 || url.lastIndexOf("AutenticadorController.do")>-1  ) {
			chain.doFilter(request, response); //Permite o fluxo da requisicao
		}else {
			//Redireciona para o login
			((HttpServletResponse) response).sendRedirect("login.html");
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
