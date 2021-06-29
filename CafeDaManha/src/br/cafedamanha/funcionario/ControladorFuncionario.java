package br.cafedamanha.funcionario;

import java.util.ArrayList;

public class ControladorFuncionario {
	
	private IRepositorioFuncionario repositorioFuncionario;
	
	public ControladorFuncionario() {
		repositorioFuncionario = new RepositorioFuncionarioArray();
	}
	
	public void cadastrar (Funcionario funcionario) {
		repositorioFuncionario.cadastrar(funcionario);
	}
	public void atualizar (Funcionario funcionario) {
		repositorioFuncionario.atualizar(funcionario);
	}
	public Funcionario procurar (Integer id) {
		return repositorioFuncionario.procurar(id);
	}
	public boolean remover (Integer id) {
		return repositorioFuncionario.remover(id);
	}
	public ArrayList<Funcionario> listar (){
		return repositorioFuncionario.listar();
	}
}
