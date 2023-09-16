package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.bancoAmbl3.contas.Conta;
import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.contas.ContaPoupanca;
import br.com.poo.bancoAmbl3.pessoas.Cliente;
import br.com.poo.bancoAmbl3.pessoas.Presidente;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JSaque extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public JSaque(String contaAtual, boolean cc, boolean cp, Cliente usuarioLogado, ContaCorrente contaCorrente,
			ContaPoupanca contaPoupanca) {
		setTitle("Saque - Sistema Bancário");

//		Conta conta = null;
//		try {
//			conta = new ContaCorrente().buscarContaCorrentePorCpf(usuario.getCpf());
//		} catch (IOException e) {			
//			e.printStackTrace();
//		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 218);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(174, 74, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Insira o valor do saque que você deseja realizar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(28, 35, 363, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Presidente presidente = new Presidente();
				Double valor = Double.parseDouble(textField.getText());
				presidente.setTotalCapital(presidente.getTotalCapital() + valor);

				dispose();
				if (contaAtual == "corrente") {
					contaCorrente.sacar(valor);
					JContaCorrente jContaCorrente = new JContaCorrente(contaAtual, cc, cp, usuarioLogado, contaCorrente,
							contaPoupanca);
					jContaCorrente.setLocationRelativeTo(jContaCorrente);
					jContaCorrente.setVisible(true);
				} else if(contaAtual == "poupança"){
					contaPoupanca.sacar(valor);
					JContaPoupanca jContaPoupanca = new JContaPoupanca(contaAtual, cc, cp, usuarioLogado, contaCorrente,
							contaPoupanca);
					jContaPoupanca.setLocationRelativeTo(jContaPoupanca);
					jContaPoupanca.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(174, 133, 99, 23);
		contentPane.add(btnNewButton);

		JLabel label$ = new JLabel("R$");
		label$.setFont(new Font("Tahoma", Font.BOLD, 12));
		label$.setBounds(146, 76, 25, 14);
		contentPane.add(label$);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contaAtual == "corrente") {
					//contaCorrente.depositar(valor);
					JContaCorrente jContaCorrente = new JContaCorrente(contaAtual, cc, cp, usuarioLogado, contaCorrente,
							contaPoupanca);
					jContaCorrente.setLocationRelativeTo(jContaCorrente);
					jContaCorrente.setVisible(true);
				} else if(contaAtual == "poupança"){
					//contaPoupanca.depositar(valor);
					JContaPoupanca jContaPoupanca = new JContaPoupanca(contaAtual, cc, cp, usuarioLogado, contaCorrente,
							contaPoupanca);
					jContaPoupanca.setLocationRelativeTo(jContaPoupanca);
					jContaPoupanca.setVisible(true);
				}
			}
		});
		botaoVoltar.setBounds(323, 133, 89, 23);
		contentPane.add(botaoVoltar);
	}
}
