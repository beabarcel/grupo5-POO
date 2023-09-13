package br.com.poo.bancoAmbl3.pessoas;

import java.util.Arrays;

public class Diretor extends Funcionario implements FolhaDePagamento{

	int[] agencias;

	public Diretor(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);

	}

	public Diretor() {
		super();
	}
	
	public void relatorio() {
		
	}

	public int[] getAgencias() {
		return agencias;
	}

	public void setAgencias(int[] agencias) {
		this.agencias = agencias;
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
		return this.getSalario()*0.20;
	}

	@Override
	public String toString() {
		return "Diretor [agencias=" + Arrays.toString(agencias) + ", getNome()=" + getNome() 
				+ ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail()
				+ ", getTelefone()=" + getTelefone() + ", getCargo()=" + getCargo() + "]";
	}
	
	
	
}
