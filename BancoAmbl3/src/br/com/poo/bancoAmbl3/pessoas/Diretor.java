package br.com.poo.bancoAmbl3.pessoas;

public class Diretor extends Funcionario{
	private String cargo;
	
	public Diretor() {
		super();
	}

	public Diretor(String nome, String cpf, String email, String telefone, String cargo) {
		super(nome, cpf, email, telefone);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = "Diretor";
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
	
	@Override
	public String toString() {
		return "Diretor [cargo=" + cargo + ", getSalario()=" + getSalario() + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
