package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class JGerente extends JFrame {

	private JPanel entrar;
	private JTextField usuario;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField senhaG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JGerente frame = new JGerente();
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
	public JGerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 443);
		entrar = new JPanel();
		entrar.setBackground(new Color(63, 191, 162));
		entrar.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(entrar);
		entrar.setLayout(null);
		
		JLabel acessoGerente = new JLabel("Acesso Gerente");
		acessoGerente.setFont(new Font("Dialog", Font.BOLD, 22));
		acessoGerente.setBounds(194, 42, 202, 27);
		entrar.add(acessoGerente);
		
		usuario = new JTextField();
		usuario.setBounds(172, 141, 256, 34);
		entrar.add(usuario);
		usuario.setColumns(10);
		
		JLabel usuarioGerente = new JLabel("Usuario:");
		usuarioGerente.setBounds(172, 125, 70, 15);
		entrar.add(usuarioGerente);
		
		JLabel senhaGerente = new JLabel("Senha:");
		senhaGerente.setBounds(172, 221, 70, 15);
		entrar.add(senhaGerente);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(343, 267, -118, 19);
		entrar.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(new Color(255, 255, 255));
		passwordField_1.setBounds(442, 288, -199, 19);
		entrar.add(passwordField_1);
		
		senhaG = new JPasswordField();
		senhaG.setForeground(new Color(243, 243, 243));
		senhaG.setBounds(172, 235, 256, 34);
		entrar.add(senhaG);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(234, 299, 117, 25);
		entrar.add(btnEntrar);
	}
}
