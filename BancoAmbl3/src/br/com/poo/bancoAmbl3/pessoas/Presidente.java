package br.com.poo.bancoAmbl3.pessoas;

public class Presidente extends Funcionario{
	public Presidente() {
		super();
	}

	public Presidente(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}
	
	

	public double getSalario() {
		return super.getSalario();
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + getSalario();
	}
	
}
