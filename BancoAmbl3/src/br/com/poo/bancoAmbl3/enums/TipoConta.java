package br.com.poo.bancoAmbl3.enums;

public enum TipoConta {
	CONTA_CORRENTE("Conta Corrente", 1),
	CONTA_POUPANCA("Conta Poupança", 2),
	GERENTE("Gerente", 3),
	DIRETOR("Diretor", 4);
	
	private String tipo;
	private int id;
	
	TipoConta(String tipo, int id){
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
