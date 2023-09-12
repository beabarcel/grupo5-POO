package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class JLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCpf;
	private JPasswordField txtSenha;

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
		setTitle("Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 392);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtLogin = new JLabel("Login");
		txtLogin.setForeground(new Color(255, 255, 255));
		txtLogin.setBounds(216, 28, 110, 37);
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(txtLogin);
		
		
		JLabel labelCpf = new JLabel("CPF");
		labelCpf.setBackground(new Color(0, 0, 0));
		labelCpf.setForeground(new Color(0, 0, 0));
		labelCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelCpf.setBounds(123, 100, 45, 13);
		contentPane.add(labelCpf);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBackground(new Color(0, 0, 0));
		labelSenha.setForeground(new Color(0, 0, 0));
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelSenha.setBounds(123, 179, 45, 13);
		contentPane.add(labelSenha);
		
		JLabel txtAmbl3 = new JLabel("AMBL3");
		txtAmbl3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtAmbl3.setBounds(461, 332, 45, 13);
		contentPane.add(txtAmbl3);
		
		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.setBackground(new Color(64, 128, 128));
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = txtCpf.getText();
				String senha = new String(txtSenha.getPassword());
				if(cpf != null && senha != null && !cpf.isEmpty() && !senha.isEmpty()) {
					JOptionPane.showMessageDialog(botaoEntrar, "Bem vindo(a), " + cpf);	
				}else {
					JOptionPane.showMessageDialog(botaoEntrar, "Erro! Preencha todos os campos.", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		botaoEntrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botaoEntrar.setBounds(204, 253, 97, 26);
		contentPane.add(botaoEntrar);
		
		txtCpf = new JTextField();
		txtCpf.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtCpf.setColumns(10);
		txtCpf.setBounds(123, 124, 253, 26);
		contentPane.add(txtCpf);
		
		
		txtSenha = new JPasswordField();
		txtSenha.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtSenha.setBounds(123, 197, 253, 26);
		contentPane.add(txtSenha);
		
		JButton botaoCadastro = new JButton("Novo por aqui? Cadastre-se.");
		botaoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        JCadastroCliente jCadastroLogin = new JCadastroCliente();
				jCadastroLogin.setVisible(true);
		    }
		});
		getContentPane().add(botaoCadastro);
			
	
		botaoCadastro.setMnemonic(KeyEvent.VK_JAPANESE_KATAKANA);
		botaoCadastro.setVerticalAlignment(SwingConstants.TOP);
		botaoCadastro.setForeground(new Color(0, 0, 0));
		botaoCadastro.setBackground(new Color(64, 128, 128));
		botaoCadastro.setBounds(160, 307, 186, 21);
		contentPane.add(botaoCadastro);
	}
}
