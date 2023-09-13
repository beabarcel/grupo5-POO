package br.com.poo.bancoAmbl3.pessoas;

public class Presidente extends Funcionario implements FolhaDePagamento {

	public Presidente(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);
	}

	public void relatorioCapital() {

	}

	public void relatorioDiretores() {

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
		return this.getSalario()*0.25;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
