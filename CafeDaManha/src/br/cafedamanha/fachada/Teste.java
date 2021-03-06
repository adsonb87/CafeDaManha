package br.cafedamanha.fachada;

import java.util.ArrayList;

import br.cafedamanha.funcionario.Funcionario;
import br.cafedamanha.opcao.Opcao;

public class Teste {

	public static void main(String[] args) {
		Fachada fachada = Fachada.getInstance();
		
		Funcionario funcionario = new Funcionario("Adson Barbosa de Souza", "071.149.914-44");
		funcionario.setIdFuncionario(1);
		Opcao opcao = new Opcao("Salgadinho", funcionario);
		Opcao opcao2 = new Opcao("Caf?", funcionario);
		Opcao opcao3 = new Opcao("P?o", funcionario);
		
		fachada.cadastrarOpcao(opcao);
		fachada.cadastrarOpcao(opcao2);
		fachada.cadastrarOpcao(opcao3);
				
		fachada.cadastrarFuncionario(funcionario);
		
		System.out.println(fachada.listarPorFuncionarioOpcao(1).toString());

	}

}
