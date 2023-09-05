package br.com.poo.bancoAmbl3.pessoas;

public class Gerente extends Funcionario{
	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}

	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
}
