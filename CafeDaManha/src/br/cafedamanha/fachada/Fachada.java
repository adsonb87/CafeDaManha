package br.cafedamanha.fachada;

import br.cafedamanha.funcionario.ControladorFuncionario;
import br.cafedamanha.opcao.ControladorOpcao;

public class Fachada {
	
	private ControladorFuncionario controladorFuncionario;
	private ControladorOpcao controladorOpcao;
	
	private static Fachada fachada;
	
	public Fachada() {
		controladorFuncionario = new ControladorFuncionario();
		controladorOpcao = new ControladorOpcao();
	}
	
	public static Fachada getInstance() {
		if(fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	}
}
