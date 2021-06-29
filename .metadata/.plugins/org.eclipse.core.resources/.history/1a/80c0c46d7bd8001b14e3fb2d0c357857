package br.cafedamanha.funcionario;

import java.util.ArrayList;

public class RepositorioFuncionarioArray implements IRepositorioFuncionario {
	public ArrayList<Funcionario> listaFuncionario;
	
	public RepositorioFuncionarioArray () {
		listaFuncionario = new ArrayList<Funcionario>();
	}
	
	@Override
	public void cadastrar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionario procurar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remover(Integer id) {
		// TODO Auto-generated method stub
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
