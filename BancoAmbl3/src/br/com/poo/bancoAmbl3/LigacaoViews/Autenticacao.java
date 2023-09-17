package br.com.poo.bancoAmbl3.LigacaoViews;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Autenticacao {

	private String tipoPessoa = null;
	private Double saldoConta;
				
	public String getTipoPessoa(){
		return tipoPessoa;
	}	
	
	public Double getSaldo(){
		return saldoConta;
	}
	public boolean autenticar(String cpf, String senha) {
		try {
			FileReader fileReader = new FileReader("temp\\banco.txt");
			try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				String linha;
				while ((linha = bufferedReader.readLine()) != null) {
					String[] partes = linha.split(",");
					String txtCpf = partes[2];
					String txtSenha = partes[5];

					this.tipoPessoa = partes[0];
					if (cpf.equals(txtCpf) && senha.equals(txtSenha)){
						return true;
						
					}
				}
				
				bufferedReader.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String nome() {
		try {
			FileReader fileReader = new FileReader("temp\\banco.txt");
			try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				String linha;
				while ((linha = bufferedReader.readLine()) != null) {
					String[] partes = linha.split(",");
					String txtNome= partes[1];
					return txtNome;
				}
				bufferedReader.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return "a";
	} 
	
	public double saldo() {
		try {
			FileReader fileReader = new FileReader("temp\\banco.txt");
			try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				String linha;
				while ((linha = bufferedReader.readLine()) != null) {
					String[] partes = linha.split(",");
					return Double.parseDouble(partes[4]);
				}
				bufferedReader.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return 0.0;
	}
	
	
	
	

}
