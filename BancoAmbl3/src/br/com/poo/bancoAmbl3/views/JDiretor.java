package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Dimension;

public class JDiretor extends JFrame {

	private JPanel contentPane;
	private JTextField usuarioD;
	private JPasswordField senhaD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDiretor frame = new JDiretor();
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
	public JDiretor() {
		setTitle("Aba de acesso Diretor ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(63, 191, 162));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel usuarioDiretor = new JLabel("Usuario:");
		usuarioDiretor.setBounds(68, 129, 70, 15);
		contentPane.add(usuarioDiretor);
		
		JLabel acessoDiretor = new JLabel("Acesso Diretor");
		acessoDiretor.setBounds(90, 46, 202, 27);
		acessoDiretor.setFont(new Font("Dialog", Font.BOLD, 22));
		contentPane.add(acessoDiretor);
		
		usuarioD = new JTextField();
		usuarioD.setBounds(68, 145, 256, 34);
		contentPane.add(usuarioD);
		usuarioD.setColumns(10);
		
		JLabel senhaDiretor = new JLabel("Senha:");
		senhaDiretor.setBounds(68, 225, 70, 15);
		contentPane.add(senhaDiretor);
		
		senhaD = new JPasswordField();
		senhaD.setMaximumSize(new Dimension(50, 50));
		senhaD.setBounds(68, 239, 256, 34);
		contentPane.add(senhaD);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(130, 303, 117, 25);
		contentPane.add(btnEntrar);
	}
}
