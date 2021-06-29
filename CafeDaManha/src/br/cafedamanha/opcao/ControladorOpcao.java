package br.cafedamanha.opcao;

import java.util.ArrayList;

public class ControladorOpcao {
	private IRepositorioOpcao repositorioOpcao;
	
	public ControladorOpcao () {
		repositorioOpcao = new RepositorioOpcaoArray();
	}

	public void cadastrar (Opcao opcao) {
		repositorioOpcao.cadastrar(opcao);
	}
	public void atualizar (Opcao opcao) {
		repositorioOpcao.atualizar(opcao);
	}
	public Opcao procurar (Integer id) {
		return repositorioOpcao.procurar(id);
	}
	public boolean remover (Integer id) {
		return repositorioOpcao.remover(id);
	}
	public ArrayList<Opcao> listar (){
		return repositorioOpcao.listar();
	}
	
	
}
