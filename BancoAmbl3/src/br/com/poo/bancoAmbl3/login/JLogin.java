package br.com.poo.bancoAmbl3.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class JLogin extends JFrame {

	private JPanel contentPane;
	private JTextField Login;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
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
	public JLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 101, 164));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField = ,3new JTextField();
		textField.setText("Login");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Gayathri", Font.BOLD, 25));
		textField.setColumns(10);
		textField.setBackground(new Color(216, 216, 216));
		contentPane.add(textField);
		
		Login = new JTextField();
		Login.setBackground(new Color(216, 216, 216));
		Login.setHorizontalAlignment(SwingConstants.CENTER);
		Login.setFont(new Font("Gayathri", Font.BOLD, 25));
		Login.setForeground(new Color(0, 0, 0));
		Login.setText("Login");
		contentPane.add(Login);
		Login.setColumns(10);
	}

}