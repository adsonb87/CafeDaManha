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
		this.cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
	}

	public ArrayList<Opcao> getListaOpcoes() {
		return listaOpcoes;
	}

	public void setListaOpcoes(ArrayList<Opcao> listaOpcoes) {
		this.listaOpcoes = listaOpcoes;
	}
	
	public String formatarCpf() {
		return cpf.substring(0, 3) + '.' + cpf.substring(3, 6) + '.' + 
			   cpf.substring(6, 9)+ '-' + cpf.substring(9, 11)
				;
	}
	
	@Override
	public String toString() {
		return "Funcionario [IdFuncionario: " +idFuncionario+ ", Nome: " +nome+ ", Cpf: " +cpf+"]";
	}
	
}
