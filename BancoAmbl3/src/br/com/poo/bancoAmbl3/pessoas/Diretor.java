package br.com.poo.bancoAmbl3.pessoas;

public class Diretor extends Funcionario{

	public Diretor(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}

		public double getSalario() {
		return super.getSalario();
	}
}
