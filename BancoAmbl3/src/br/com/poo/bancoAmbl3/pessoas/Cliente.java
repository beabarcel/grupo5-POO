package br.com.poo.bancoAmbl3.pessoas;

public class Cliente {
	private String cpf;
	private String senha;
	private String nome;
	private String email;
	private String telefone;

	public Cliente() {
	}

	public Cliente(String nome, String cpf, String email, String telefone, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", senha=" + senha + ", nome=" + nome + ", email=" + email + ", telefone="
				+ telefone + "]";
	}

	

}