package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class JContaCorrente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JContaCorrente frame = new JContaCorrente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JContaCorrente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 102));
		panel.setBounds(0, 102, 415, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel saldo = new JLabel("Saldo");
		saldo.setFont(new Font("Dialog", Font.ITALIC, 15));
		saldo.setBounds(177, 194, 58, 21);
		saldo.setForeground(new Color(238, 238, 236));
		panel.add(saldo);
		
		JButton extratoCC = new JButton("Extrato");
		extratoCC.setBounds(142, 227, 117, 25);
		panel.add(extratoCC);
		
		JButton btnNewButton_1 = new JButton("Saldo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(4, 227, 117, 25);
		panel.add(btnNewButton_1);
		
		JLabel lblConsultasaldo = new JLabel("Movimentacao");
		lblConsultasaldo.setFont(new Font("Dialog", Font.ITALIC, 15));
		lblConsultasaldo.setForeground(new Color(255, 255, 255));
		lblConsultasaldo.setBounds(142, 12, 125, 20);
		panel.add(lblConsultasaldo);
		
		JButton btnNewButton = new JButton("Trasnferir");
		btnNewButton.setBounds(150, 81, 117, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Saque");
		btnNewButton_2.setBounds(4, 81, 117, 25);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Deposito");
		btnNewButton_3.setBounds(286, 81, 117, 25);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("ContaCorrente");
		lblNewLabel.setForeground(new Color(63, 191, 162));
		lblNewLabel.setFont(new Font("Dialog", Font.ITALIC, 25));
		lblNewLabel.setBounds(93, 28, 198, 24);
		contentPane.add(lblNewLabel);
	}
}
