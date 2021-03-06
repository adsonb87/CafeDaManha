package br.cafedamanha.opcao;

import java.util.ArrayList;

public class RepositorioOpcaoArray implements IRepositorioOpcao{
	
	public ArrayList<Opcao> listaOpcao;
	
	public RepositorioOpcaoArray() {
		listaOpcao = new ArrayList<Opcao>();
	}
	
	@Override
	public void cadastrar(Opcao opcao) {
		if(!existe(opcao.getIdOpcao())) {
			listaOpcao.add(opcao);
		}
	}

	@Override
	public void atualizar(Opcao opcao) {
		if(existe(opcao.getIdOpcao())) {
			for(int i=0; i<listaOpcao.size(); i++) {
				if(listaOpcao.get(i).getIdOpcao() == opcao.getIdOpcao()) {
					listaOpcao.set(i, opcao);
				}
			}
		}
		
	}

	@Override
	public Opcao procurar(Integer id) {
		for(int i=0; i<listaOpcao.size(); i++) {
			if(listaOpcao.get(i).getIdOpcao() == id) {
				return listaOpcao.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean remover(Integer id) {
		if(existe(id)){
			Opcao opcao = procurar(id);
			listaOpcao.remove(opcao);
		}
		return false;
	}

	@Override
	public boolean existe(Integer id) {
		if(id == null) {
			return false;
		}else {
			for(int i = 0; i<listaOpcao.size(); i++) {
				if(listaOpcao.get(i).getIdOpcao() == id) {
					return true;
				}
			}
			return false;
		}
	}
	
	@Override
	public ArrayList<Opcao> listar() {
		return listaOpcao;
	}

	@Override
	public ArrayList<Opcao> listarPorFuncionario(Integer idFuncionario) {
		ArrayList<Opcao> listaPorFuncionario = new ArrayList<Opcao>();
		for(int i=0; i<listaOpcao.size();i++) {
			if(idFuncionario==null) {
				return null;
			}
			else if(listaOpcao.get(i).getFuncionario().getIdFuncionario() == idFuncionario) {
				listaPorFuncionario.add(listaOpcao.get(i));
			}
		}
		return listaPorFuncionario;
	}
	
	
	

}
