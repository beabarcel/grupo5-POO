package br.com.poo.bancoAmbl3.pessoas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;

public class Presidente extends Funcionario implements FolhaDePagamento {

	public Presidente(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);
	}

	public Presidente() {

	}

	public void relatorioCapital() {

	}

	public void relatorioDiretores() {

	}

	public Map<String, Presidente> buscarPresidente() throws IOException {
		Map<String, String> registros = LeituraEscrita.leitor(TipoRegistro.PRESIDENTE);
		Map<String, Presidente> presidente = new HashMap<>();
		for (String registro : registros.keySet()) {
			String linha = registros.get(registro);
			presidente.put(linha.split(",")[2], new Presidente(linha.split(",")[1], linha.split(",")[2],
					linha.split(",")[3], linha.split(",")[4], linha.split(",")[5]));
		}
		return presidente;

	}

	@Override
	public double getSalario() {
		return getSalario();
	}

	@Override
	public double folhaDePagamento() {
		return this.getSalario() + this.bonificacao();
	}

	@Override
	public double bonificacao() {
		return this.getSalario() * 0.25;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
