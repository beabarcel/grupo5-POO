package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class JContaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JContaPoupanca frame = new JContaPoupanca();
					frame.setLocationRelativeTo(frame);
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
	public JContaPoupanca() {
		setTitle("Conta Poupança - Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOlPessoa = new JLabel("Olá Nome!");
		lblOlPessoa.setBounds(10, 27, 121, 25);
		panel.add(lblOlPessoa);
		lblOlPessoa.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblOlPessoa.setForeground(new Color(0, 128, 128));
		lblOlPessoa.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel = new JLabel("Saldo");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 74, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R$00,00");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 102, 107, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Imprimir extrato");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(0, 51, 51));
		btnNewButton.setBounds(289, 106, 129, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Relatório de Rendimento");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 232, 203, 23);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 142, 408, 2);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setBounds(311, 264, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 266, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblPrazomeses = new JLabel("Prazo (meses)");
		lblPrazomeses.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrazomeses.setForeground(Color.WHITE);
		lblPrazomeses.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPrazomeses.setBounds(10, 270, 107, 14);
		contentPane.add(lblPrazomeses);
		
		JButton btnNewButton_1 = new JButton("Sacar");
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(0, 51, 51));
		btnNewButton_1.setBounds(40, 169, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Transferir");
		btnNewButton_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1.setForeground(new Color(0, 51, 51));
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(169, 169, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Depositar");
		btnNewButton_1_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1_1.setForeground(new Color(0, 51, 51));
		btnNewButton_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1_1_1.setBounds(298, 169, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setHorizontalAlignment(SwingConstants.LEFT);
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblValor.setBounds(271, 270, 86, 14);
		contentPane.add(lblValor);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 219, 408, 2);
		contentPane.add(panel_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Fazer Relatório");
		btnNewButton_1_1_2.setForeground(new Color(0, 51, 51));
		btnNewButton_1_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1_1_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1_2.setBounds(10, 312, 119, 23);
		contentPane.add(btnNewButton_1_1_2);
	}
}
