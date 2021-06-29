package br.cafedamanha.funcionario;

import java.util.ArrayList;

public interface IRepositorioFuncionario {
	public void cadastrar (Funcionario funcionario);
	public void atualizar (Funcionario funcionario);
	public Funcionario procurar (Integer id);
	public boolean remover (Integer id);
	public boolean existe (Integer id);
	public ArrayList<Funcionario> listar ();
}
