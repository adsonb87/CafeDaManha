package br.cafedamanha.opcao;

public class Opcao {
	private Integer idOpcao;
	private String opcao;
		
	public Opcao (String opcao) {
		this.opcao = opcao;
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
	
	
	@Override
	public String toString() {
		return "Opcao [idOpcao: " +idOpcao+ ", Opcao: " +opcao+ "]";
	}
}
