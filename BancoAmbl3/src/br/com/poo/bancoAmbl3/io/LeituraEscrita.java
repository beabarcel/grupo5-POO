package br.com.poo.bancoAmbl3.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	
	public static void leitor(String path) throws IOException{
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO)); 
			
		String linha = "";
		while(true){
			linha = buffRead.readLine();
			if(linha != null) {
				String[] dados = linha.split(";");
			}else {
				break;
			}
			}
		buffRead.close();
		}
	
	public static void escritor(String path) throws IOException {
		String dados;
		Scanner sc = new Scanner(System.in);
		 
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true)); 
		
		System.out.println("Escreva algo: ");
		dados = sc.nextLine();
		buffWriter.append(dados + "\n");
		sc.close();
		buffWriter.close();
	}
	
}

