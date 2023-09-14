package br.com.poo.bancoAmbl3.contas;

public class ContaCorrente extends Conta {
	private boolean status;
	private double chequeEspecial;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(double saldo, String titular) {
		super(saldo, titular);
	}

	public boolean getStatus() {
		return status;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

	@Override
	public boolean depositar(double valor) {
		if (valor <= 0.10) {
			return false;
		} else {
			setSaldo(getSaldo() + valor - 0.10);
			return true;

		}
	}
	
	@Override
	public boolean sacar(double valor) {
		if (valor > getSaldo() || valor <= 0) {
			return false;
		} else {
			setSaldo(getSaldo() - valor - 0.10);
			return true;
		}
	}

	public boolean sacarEspecial(double valor) {
		if (status && valor <= chequeEspecial) {
			setSaldo(getSaldo() - valor);
			setChequeEspecial(getChequeEspecial() - valor);
			return true;
		} else {
			setStatus(false);
			return false;
		}
	}

	public boolean pagarCheque(double valor) {
		if (this.getSaldo() < 0) {
			setSaldo(this.getSaldo() + valor);
			setChequeEspecial(getChequeEspecial() + valor);
			setStatus(true);
			return true;
		} else {
			return false;
		}
	}
	
	public void relatorioTributacao() {
		
	}
}
