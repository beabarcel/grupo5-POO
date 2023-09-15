package br.com.poo.bancoAmbl3.enums;

public enum Agencias {
	A("1", 1),
	B("2", 2),
	C("3", 3),
	D("4", 4);
	
	private String tipo;
	private int id;
	
	Agencias(String tipo, int id){
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
