package br.com.poo.bancoAmbl3.pessoas;

public class Funcionario extends Cliente{
	private double salario = 1300;//temporario
	private double bonificacao = 0.1;
	private String cargo;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}
	
	public double getBonificacao() {
		return salario *= bonificacao;
	}
	
	public double getSalario() {
		return salario;
	}
	
}