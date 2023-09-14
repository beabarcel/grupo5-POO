package br.com.poo.bancoAmbl3.enums;

public enum Funcionario {

	CADASTRAR_CONTA("Cadastrar Conta", 1),
	RELATORIO_DIRETORES("Relatório de Diretores", 2),
	RELATORIO_VALORES("Relatório de Valores", 3);
	
	private String tipo;
	private int id;
	
	Funcionario(String tipo, int id){
		this.tipo = tipo;
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getId() {
		return id;
	}
}
