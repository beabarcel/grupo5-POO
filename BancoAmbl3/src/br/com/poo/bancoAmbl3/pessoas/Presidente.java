package br.com.poo.bancoAmbl3.pessoas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Presidente extends Funcionario{

	public Presidente(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}
	
	

	public double getSalario() {
		return super.getSalario();
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + getSalario();
	}
	
	public static void criarPresidente(Presidente presidente) throws IOException {
		//salvar no arquivo.
		
		FileWriter arq = new FileWriter("C:\\dev\\POO\\WorkSpace\\grupo5-POO.Presidente.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
	    gravarArq.printf(presidente.toString());
	    gravarArq.close();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
