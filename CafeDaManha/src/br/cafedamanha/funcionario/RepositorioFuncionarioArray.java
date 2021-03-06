package br.cafedamanha.funcionario;

import java.util.ArrayList;

public class RepositorioFuncionarioArray implements IRepositorioFuncionario {
	public ArrayList<Funcionario> listaFuncionario;
	
	public RepositorioFuncionarioArray () {
		listaFuncionario = new ArrayList<Funcionario>();
	}
	
	@Override
	public void cadastrar(Funcionario funcionario) {
		if(!existe(funcionario.getIdFuncionario())) {
			listaFuncionario.add(funcionario);
		}
		
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		if(existe(funcionario.getIdFuncionario())){
			for(int i=0; i<listaFuncionario.size(); i++) {
				if(listaFuncionario.get(i).getIdFuncionario() == funcionario.getIdFuncionario()) {
					listaFuncionario.set(i, funcionario);
				}
			}
		}
		
	}

	@Override
	public Funcionario procurar(Integer id) {
		for(int i=0; i<listaFuncionario.size(); i++) {
			if(listaFuncionario.get(i).getIdFuncionario() == id) {
				return listaFuncionario.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean remover(Integer id) {
		if(existe(id)) {
			Funcionario funcaionario = procurar(id);
			listaFuncionario.remove(funcaionario);
			return true;
		}
		return false;
	}

	@Override
	public boolean existe(Integer id) {
		if(id == null) {
			return false;
		}else {
			for(int i = 0; i<listaFuncionario.size(); i++) {
				if(listaFuncionario.get(i).getIdFuncionario()== id) {
					return true;
				}
			}
			return false;
		}
	}

	@Override
	public ArrayList<Funcionario> listar() {
		return listaFuncionario;
	}

}
