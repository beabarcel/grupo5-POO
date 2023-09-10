package br.com.poo.bancoAmbl3.pessoas;

public class Gerente extends Funcionario{	
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
	}

	public String getCargo() {
		return super.getCargo() + 0.15;
	}	
	
	@Override
	public String toString() {
		return "Gerente [Bonificacao =" + getBonificacao() + ", Salario =" + getSalario() + "\nCargo ="
				+ getCargo() + "\n Nome()=" + getNome() + "\n Cpf =" + getCpf() + "\n Email =" + getEmail()
				+ ", getTelefone()=" + getTelefone() + "\nString=" + super.toString() + "\n Class=" + getClass()
				;
	}
	
}