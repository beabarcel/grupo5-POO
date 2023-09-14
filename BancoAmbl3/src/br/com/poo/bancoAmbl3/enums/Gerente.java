package br.com.poo.bancoAmbl3.enums;

public enum Gerente {
	CADASTRAR_CONTA("Cadastrar Conta", 1),
	RELATORIO_CONTAS_AGENCIA("Relatório total de contas por agencia", 2),
	RELATORIO_CONTAS("Relatório das contas", 3);
	
	private String tipo;
	private int id;
	
	Gerente(String tipo, int id){
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
