package br.com.poo.bancoAmbl3.pessoas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;

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

	public Map<String, Cliente> buscarClientes() throws IOException {
		Map<String, String> registros = LeituraEscrita.leitor(TipoRegistro.CLIENTE);
		Map<String, Cliente> clientes = new HashMap<>();
		for (String registro : registros.keySet()) {
			String linha = registros.get(registro);
			clientes.put(linha.split(",")[1], new Cliente(linha.split(",")[1], linha.split(",")[2], linha.split(",")[3],
					linha.split(",")[4], linha.split(",")[5]));
		}
		
		return clientes;

	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", senha=" + senha + ", nome=" + nome + ", email=" + email + ", telefone="
				+ telefone + "]";
	}

}