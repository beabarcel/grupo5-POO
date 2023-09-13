package br.com.poo.bancoAmbl3.pessoas;

public class Diretor extends Funcionario {

	int[] agencias;

	public Diretor(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);

	}

	public Diretor() {
		super();
	}
	
	public void relatorio() {
		
	}

	public int[] getAgencias() {
		return agencias;
	}

	public void setAgencias(int[] agencias) {
		this.agencias = agencias;
	}
	
}
