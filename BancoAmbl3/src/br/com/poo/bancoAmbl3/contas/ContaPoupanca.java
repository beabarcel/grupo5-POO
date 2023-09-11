package br.com.poo.bancoAmbl3.contas;

public class ContaPoupanca extends Conta{
	private double rendimento;
	private final double taxa = 0.15;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(double saldo, String titular) {
		super(saldo, titular);
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getTaxa() {
		return taxa;
	}
	
	
	
	
}
