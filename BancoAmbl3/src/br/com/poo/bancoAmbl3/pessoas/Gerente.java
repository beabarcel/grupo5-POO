package br.com.poo.bancoAmbl3.pessoas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}

	public String getCargo() {
		return super.getCargo() + 0.15;
	}

	public static void criarGerente(Gerente gerente) throws IOException {

		FileWriter arq = new FileWriter("/Documentos/liliane_residencia/POO/workspace/grupo5-POO.Gerente.txt");

		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf(gerente.toString());
		gravarArq.close();
	}

	@Override
	public String toString() {
		return "Gerente [Bonificacao =" + getBonificacao() + ", Salario =" + getSalario() + "\nCargo =" + getCargo()
				+ "\n Nome()=" + getNome() + "\n Cpf =" + getCpf() + "\n Email =" + getEmail() + ", getTelefone()="
				+ getTelefone() + "\nString=" + super.toString() + "\n Class=" + getClass();
	}

}