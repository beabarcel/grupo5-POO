package br.com.poo.bancoAmbl3.pessoas;

public class Gerente extends Funcionario implements FolhaDePagamento {

	int agencia;

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);
	}

	public void relatorioTotalContas() {

	}

	public void relatorioContas() {

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	@Override
	public double getSalario() {
		return getSalario();
	}

	@Override
	public double folhaDePagamento() {
		return this.getSalario() + this.bonificacao();
	}

	@Override
	public double bonificacao() {
		return this.getSalario()*0.15;
	}

	@Override
	public String toString() {
		return "Gerente [agencia=" + agencia + "]";
	}

}