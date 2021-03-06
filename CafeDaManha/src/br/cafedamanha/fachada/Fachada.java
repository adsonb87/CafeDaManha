package br.cafedamanha.fachada;

import java.util.ArrayList;

import br.cafedamanha.funcionario.ControladorFuncionario;
import br.cafedamanha.funcionario.Funcionario;
import br.cafedamanha.opcao.ControladorOpcao;
import br.cafedamanha.opcao.Opcao;

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
	
	//Funcionario
	public void cadastrarFuncionario (Funcionario funcionario) {
		controladorFuncionario.cadastrar(funcionario);
	}
	public void atualizarFuncionario (Funcionario funcionario) {
		controladorFuncionario.atualizar(funcionario);
	}
	public Funcionario procurarFuncionario (Integer id) {
		return controladorFuncionario.procurar(id);
	}
	public boolean removerFuncionario (Integer id) {
		return controladorFuncionario.remover(id);
	}
	public ArrayList<Funcionario> listarFuncionario (){
		return controladorFuncionario.listar();
	}
	
	//Opcao
	public void cadastrarOpcao (Opcao opcao) {
		controladorOpcao.cadastrar(opcao);
	}
	public void atualizarOpcao (Opcao opcao) {
		controladorOpcao.atualizar(opcao);
	}
	public Opcao procurarOpcao (Integer id) {
		return controladorOpcao.procurar(id);
	}
	public boolean removerOpcao (Integer id) {
		return controladorOpcao.remover(id);
	}
	public ArrayList<Opcao> listarOpcao (){
		return controladorOpcao.listar();
	}
	
	public ArrayList<Opcao> listarPorFuncionarioOpcao (Integer idFuncionario){
		return controladorOpcao.listarPorFuncionario(idFuncionario);
	}
	
	
}
