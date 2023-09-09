package br.com.poo.bancoAmbl3.pessoas;

public class Funcionario {
	private double salario = 0;
	
	private double bonificacao = 0;

	private String nome;
	private String cpf;
	private String email;
	private String telefone;

	public Funcionario(String nome, String cpf, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.bonificacao;
	}
	
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
}