package br.com.poo.bancoAmbl3;

import java.io.IOException;
import java.util.Map;

import br.com.poo.bancoAmbl3.contas.Conta;
import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.contas.ContaPoupanca;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;
import br.com.poo.bancoAmbl3.pessoas.Cliente;
import br.com.poo.bancoAmbl3.pessoas.Diretor;
import br.com.poo.bancoAmbl3.pessoas.Gerente;
import br.com.poo.bancoAmbl3.pessoas.Presidente;
import br.com.poo.bancoAmbl3.views.JLogin;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		
		JLogin jl = new JLogin();
		jl.setLocationRelativeTo(jl);
		jl.setVisible(true);

		Map<String, Cliente> clientes = new Cliente().buscarClientes();
		Map<String, Gerente> gerentes = new Gerente().buscarGerente();
		Map<String, Diretor> diretor = new Diretor().buscarDiretor();
		Map<String, Presidente> presidente = new Presidente().buscarPresidente();
		Map<String, ContaCorrente> CC = new ContaCorrente().buscarCC();
		Map<String, ContaPoupanca> CP = new ContaPoupanca().buscarCP();

		//System.out.println(LeituraEscrita.PATH_BASICO + "\n");
//		System.out.println(gerentes + "\n");
//		System.out.println(diretor + "\n");
		System.out.println(CP);
//		System.out.println(CC);

	}
}
