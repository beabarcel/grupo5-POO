package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTransferencia extends JFrame {

	private JPanel contentPane;
	private JTextField textValorTransferencia;
	private JLabel lblInsiraODestino;
	private JTextField textNumeroConta;

	public JTransferencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 218);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textValorTransferencia = new JTextField();
		textValorTransferencia.setHorizontalAlignment(SwingConstants.CENTER);
		textValorTransferencia.setBounds(10, 44, 86, 20);
		contentPane.add(textValorTransferencia);
		textValorTransferencia.setColumns(10);
		
		JLabel lblTransferencia = new JLabel("Insira o valor da transferência");
		lblTransferencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransferencia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTransferencia.setBounds(10, 11, 235, 14);
		contentPane.add(lblTransferencia);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double valor = Double.parseDouble(textValorTransferencia.getText());
				Integer numConta = Integer.parseInt(textNumeroConta.getText());
				
				}
		});
		btnNewButton.setBounds(174, 133, 89, 23);
		contentPane.add(btnNewButton);
		
		lblInsiraODestino = new JLabel("Insira o número da conta de destino");
		lblInsiraODestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsiraODestino.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInsiraODestino.setBounds(10, 83, 293, 14);
		contentPane.add(lblInsiraODestino);
		
		textNumeroConta = new JTextField();
		textNumeroConta.setHorizontalAlignment(SwingConstants.CENTER);
		textNumeroConta.setColumns(10);
		textNumeroConta.setBounds(10, 108, 86, 20);
		contentPane.add(textNumeroConta);
	}
}
