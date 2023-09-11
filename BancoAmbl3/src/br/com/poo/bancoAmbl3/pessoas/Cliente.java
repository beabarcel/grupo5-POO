package br.com.poo.bancoAmbl3.pessoas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	
	public Cliente(){
	}
	
	public Cliente(String nome,String cpf,String email, String telefone){
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

	public static void criarCliente(Cliente cliente) throws IOException {

		FileWriter arq = new FileWriter("/Documentos/liliane_residencia/POO/workspace/grupo5-POO.Gerente.txt");

		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf(cliente.toString());
		gravarArq.close();
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	
}