package br.com.poo.bancoAmbl3.pessoas;

public class Gerente extends Funcionario{

	public Gerente(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}
	
	public double getSalario() {
		return super.getSalario();
	}	
}
