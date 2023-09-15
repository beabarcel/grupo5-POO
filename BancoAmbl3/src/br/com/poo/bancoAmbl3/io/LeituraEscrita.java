package br.com.poo.bancoAmbl3.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.pessoas.Funcionario;

public class LeituraEscrita {

	public static final String PATH_BASICO = "./temp/";
	static final String NOME = "banco";
	public static final String EXTENSAO = ".txt";

	public static Map<String, String> leitor(TipoRegistro tipoRegistro) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + NOME + EXTENSAO));

		String linha = "";

		Map<String, String> registros = new HashMap<>();

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				if (linha.split(",")[0].equals(tipoRegistro.toString())) {
					registros.put(linha.split(",")[1], linha);
				}
			} else {
				break;
			}
		}
		buffRead.close();
		return registros;
	}

	public static Map<String, String> inserirRegistro(String conteudo){
		
		String linha = "";
	
		try {
			BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + NOME + EXTENSAO, true));
			buffWriter.append(conteudo);
			buffWriter.close();
		} catch (IOException e) {
			JOptionPane.showInputDialog(null,"Erro ao salvar o cadastro");
			e.printStackTrace();
		}
		return null;
		
	}
}