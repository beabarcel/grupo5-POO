package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.contas.ContaPoupanca;
import br.com.poo.bancoAmbl3.pessoas.Cliente;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDeposito extends JFrame {

	private JPanel contentPane;
	private JTextField textValorDeposito;
	private JButton btnVoltar;

	public JDeposito(boolean cc, boolean cp, Cliente usuarioLogado, ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 218);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textValorDeposito = new JTextField();
		textValorDeposito.setHorizontalAlignment(SwingConstants.CENTER);
		textValorDeposito.setBounds(174, 74, 86, 20);
		contentPane.add(textValorDeposito);
		textValorDeposito.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insira o valor do depósito");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(110, 26, 214, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double valor = Double.parseDouble(textValorDeposito.getText());
				contaCorrente.depositar(valor);
				dispose();
				JContaCorrente jContaCorrente = new JContaCorrente(cc, cp, usuarioLogado, contaCorrente, contaPoupanca);
				jContaCorrente.setLocationRelativeTo(jContaCorrente);
				jContaCorrente.setVisible(true);
				}
		});
		btnNewButton.setBounds(174, 133, 89, 23);
		contentPane.add(btnNewButton);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setBounds(335, 133, 89, 23);
		contentPane.add(btnVoltar);
	}
}
