package br.com.poo.bancoAmbl3.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.poo.bancoAmbl3.contas.Conta;
import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.contas.ContaPoupanca;
import br.com.poo.bancoAmbl3.pessoas.Cliente;

public class JTransferencia extends JFrame {

	private JPanel contentPane;
	private JTextField textValorTransferencia;
	private JLabel lblInsiraODestino;
	private JTextField textNumeroConta;
	private JLabel lblNewLabel;
	private JButton botaoVoltar;

	public JTransferencia(String contaAtual, boolean cc, boolean cp, Cliente usuarioLogado, ContaCorrente contaCorrente,
			ContaPoupanca contaPoupanca) {
		setTitle("Transferência - Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 218);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textValorTransferencia = new JTextField();
		textValorTransferencia.setHorizontalAlignment(SwingConstants.CENTER);
		textValorTransferencia.setBounds(36, 44, 86, 20);
		contentPane.add(textValorTransferencia);
		textValorTransferencia.setColumns(10);

		JLabel lblTransferencia = new JLabel("Insira o valor da transferência");
		lblTransferencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransferencia.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTransferencia.setBounds(-16, 11, 235, 14);
		contentPane.add(lblTransferencia);

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double valor = Double.parseDouble(textValorTransferencia.getText());
				Integer numConta = Integer.parseInt(textNumeroConta.getText());
				try {
					Map<String, ContaCorrente> CC = new ContaCorrente().buscarCC();
					Map<String, ContaPoupanca> CP = new ContaPoupanca().buscarCP();
					Conta conta = null;
					
					for (Conta cc : CC.values()) {
						if (numConta == cc.getNumeroConta()) {
							conta = cc;
						}
					}
					for (Conta cp : CP.values()) {
						if (numConta == cp.getNumeroConta()) {
							conta = cp;
						}
					}

					contaCorrente.transferir(conta, valor);
					dispose();
					JContaCorrente jContaCorrente = new JContaCorrente(contaAtual, cc, cp, usuarioLogado, contaCorrente,
							contaPoupanca);
					jContaCorrente.setLocationRelativeTo(jContaCorrente);
					jContaCorrente.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(165, 133, 112, 23);
		contentPane.add(btnNewButton);

		lblInsiraODestino = new JLabel("Insira o número da conta de destino");
		lblInsiraODestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsiraODestino.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInsiraODestino.setBounds(-26, 86, 293, 14);
		contentPane.add(lblInsiraODestino);

		textNumeroConta = new JTextField();
		textNumeroConta.setHorizontalAlignment(SwingConstants.CENTER);
		textNumeroConta.setColumns(10);
		textNumeroConta.setBounds(36, 111, 86, 20);
		contentPane.add(textNumeroConta);
		
		lblNewLabel = new JLabel("R$");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 46, 24, 14);
		contentPane.add(lblNewLabel);
		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contaAtual == "corrente") {
					JContaCorrente jContaCorrente = new JContaCorrente(contaAtual, cc, cp, usuarioLogado, contaCorrente,
							contaPoupanca);
					jContaCorrente.setLocationRelativeTo(jContaCorrente);
					jContaCorrente.setVisible(true);
				} else if(contaAtual == "poupança"){
					JContaPoupanca jContaPoupanca = new JContaPoupanca(contaAtual, cc, cp, usuarioLogado, contaCorrente,
							contaPoupanca);
					jContaPoupanca.setLocationRelativeTo(jContaPoupanca);
					jContaPoupanca.setVisible(true);
				}
			}
		});
		botaoVoltar.setBounds(325, 133, 81, 23);
		contentPane.add(botaoVoltar);
	}
}
