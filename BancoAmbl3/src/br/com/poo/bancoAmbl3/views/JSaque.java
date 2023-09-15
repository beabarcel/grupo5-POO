package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.bancoAmbl3.contas.Conta;
import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.pessoas.Cliente;

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
	
	public JSaque(Cliente usuario) {
		
		Conta conta = null;
		try {
			conta = new ContaCorrente().buscarContaCorrentePorCpf(usuario.getCpf());
		} catch (IOException e) {			
			e.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 218);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(174, 74, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insira o valor do saque");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(110, 26, 214, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double valor = Double.parseDouble(textField.getText());
				
				}
		});
		btnNewButton.setBounds(174, 133, 89, 23);
		contentPane.add(btnNewButton);
	}
}
