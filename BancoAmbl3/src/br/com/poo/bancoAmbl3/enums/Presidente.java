package br.com.poo.bancoAmbl3.enums;

public enum Presidente {

	CADASTRAR_CLIENTE("Cadastrar Cliente", 1),
	CADASTRAR_FUNCIONARIO("Cadastrar Funcionário", 2),
	RELATORIO_DIRETORES("Relatório de Diretores", 3),
	RELATORIO_VALORES("Relatório de Valores", 4);
	
	private String tipo;
	private int id;
	
	Presidente(String tipo, int id){
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
