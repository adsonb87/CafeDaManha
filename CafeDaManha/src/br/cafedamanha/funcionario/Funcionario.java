package br.cafedamanha.funcionario;


import java.util.ArrayList;

import br.cafedamanha.opcao.Opcao;


public class Funcionario {
	private Integer idFuncionario;
	private String nome;
	private String cpf;
	private ArrayList<Opcao> listaOpcoes;
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		listaOpcoes = new ArrayList<Opcao>();
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Opcao> getListaOpcoes() {
		return listaOpcoes;
	}

	public void setListaOpcoes(ArrayList<Opcao> listaOpcoes) {
		this.listaOpcoes = listaOpcoes;
	}
	
	@Override
	public String toString() {
		return "Funcionario [IdFuncionario: " +idFuncionario+ ", Nome: " +nome+ ", Cpf: " +cpf+"]";
	}
	
}
