package br.com.poo.bancoAmbl3.pessoas;

public class Funcionario extends Cliente{
	private double salario = 1300;//temporario

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}
	
	public double getSalario() {
		return salario;
	}
}