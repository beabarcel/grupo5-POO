package br.com.poo.bancoAmbl3.pessoas;

public class Diretor extends Funcionario{
	
	public Diretor() {
		super();
	}

	public Diretor(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}

	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
}
