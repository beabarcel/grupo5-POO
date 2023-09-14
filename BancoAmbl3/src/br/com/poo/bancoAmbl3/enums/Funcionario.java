package br.com.poo.bancoAmbl3.enums;

public enum Funcionario {

	CADASTRAR_CLIENTE("Cadastrar Cliente", 1),
	CADASTRAR_GERENTE("Cadastrar Gerente", 2),
	CADASTRAR_DIRETOR("Cadastrar Diretor", 3),
	RELATORIO_DIRETORES("Relatório de Diretores", 4),
	RELATORIO_VALORES("Relatório de Valores", 5);
	
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
