package br.cafedamanha.opcao;

import br.cafedamanha.funcionario.Funcionario;

public class Opcao {
	private Integer idOpcao;
	private Funcionario funcionario;
	private String opcao;
		
	public Opcao (String opcao, Funcionario funcionario) {
		this.opcao = opcao;
		this.funcionario = funcionario;
	}
	
	public Opcao (Integer idOpcao, String opcao) {
		this.idOpcao = idOpcao;
		this.opcao = opcao;
	}
	
	public void setIdOpcao (Integer idOpcao) {
		this.idOpcao = idOpcao;
	}
	
	public Integer getIdOpcao () {
		return idOpcao;
	}
	
	public void setOpcao (String opcao) {
		this.opcao = opcao;
	}
	
	public String getOpcao() {
		return opcao;
	}
	
	public void setFuncionario (Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	@Override
	public String toString() {
		return "Opcao [idOpcao: " +idOpcao+ ", Opcao: " +opcao+ ", Funcionario: "+funcionario.getNome()+"]";
	}
}
