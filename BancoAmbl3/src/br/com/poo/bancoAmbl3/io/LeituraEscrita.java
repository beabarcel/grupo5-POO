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

import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.pessoas.Funcionario;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String NOME = "banco";
	static final String EXTENSAO = ".txt";

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

	public static Map<String, String> escritor(String path) throws IOException {
		String banco;
		Scanner sc = new Scanner(System.in);
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + NOME + EXTENSAO, true));

		System.out.println("Escreva algo: ");
		banco = sc.nextLine();
		buffWriter.append(banco + "\n");
		sc.close();
		buffWriter.close();
		return null;
	}

}