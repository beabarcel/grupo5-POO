package br.com.poo.bancoAmbl3.enums;

public enum Cargos {
	GERENTE("Gerente", 1),
	DIRETOR("Diretor", 2);
	
	private String tipo;
	private int id;
	
	Cargos(String tipo, int id){
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
