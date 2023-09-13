package br.com.poo.bancoAmbl3.LigacaoViews;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Autenticacao {
	
	public static boolean autenticar(String cpf, String senha) {
		try {
			FileReader fileReader = new FileReader("grupo5-POO/BancoAmbl3/temp/banco.txt");
			try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				String linha;
				while ((linha = bufferedReader.readLine()) != null) {
					String[] partes = linha.split(",");
					String txtCpf = partes[3];
					String txtSenha = partes[4];
					
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

}
