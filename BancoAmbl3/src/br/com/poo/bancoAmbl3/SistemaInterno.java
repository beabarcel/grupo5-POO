package br.com.poo.bancoAmbl3;

import java.io.IOException;
import java.util.Map;

import br.com.poo.bancoAmbl3.contas.Conta;
import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;
import br.com.poo.bancoAmbl3.pessoas.Cliente;
import br.com.poo.bancoAmbl3.pessoas.Diretor;
import br.com.poo.bancoAmbl3.pessoas.Gerente;
import br.com.poo.bancoAmbl3.pessoas.Presidente;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
	  Map<String, Cliente> clientes = new Cliente().buscarClientes();
	  Map<String, Gerente> gerentes = new Gerente().buscarGerente();
	  Map<String, Diretor> diretor = new Diretor().buscarDiretor();
	  Map<String, Presidente> presidente = new Presidente().buscarPresidente();
	}

}
