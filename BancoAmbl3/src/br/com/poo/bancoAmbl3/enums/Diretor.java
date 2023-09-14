package br.com.poo.bancoAmbl3.enums;

public enum Diretor {
	//modificar
	CADASTRAR_CONTA("Cadastrar Conta", 1),
	RELATORIO_COMPLETO("Relatório completo", 2);
	
	
	private String tipo;
	private int id;
	
	Diretor(String tipo, int id){
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
