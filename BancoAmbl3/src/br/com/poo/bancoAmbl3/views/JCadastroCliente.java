package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class JCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtNovaSenha;
	private JTextField txtNovoCpf;
	private JTextField txtNovoNome;
	private JPasswordField txtConfSenha;
	private JTextField txtNovoTelefone;
	private JTextField txtNovoEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadastroCliente frame = new JCadastroCliente();
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
	public JCadastroCliente() {
		setTitle("Cadastro - Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelCadastro = new JLabel("Cadastrar Novo Cliente");
		labelCadastro.setForeground(new Color(255, 255, 255));
		labelCadastro.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelCadastro.setBounds(102, 10, 306, 45);
		contentPane.add(labelCadastro);
		
		JLabel labelNovoCpf = new JLabel("CPF *");
		labelNovoCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNovoCpf.setBounds(102, 109, 45, 13);
		contentPane.add(labelNovoCpf);
		
		txtNovaSenha = new JPasswordField();
		txtNovaSenha.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNovaSenha.setBounds(102, 285, 248, 21);
		contentPane.add(txtNovaSenha);
		
		JLabel labelNovaSenha = new JLabel("Senha *");
		labelNovaSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNovaSenha.setBounds(103, 262, 60, 13);
		contentPane.add(labelNovaSenha);
		
		txtNovoCpf = new JTextField();
		txtNovoCpf.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNovoCpf.setBounds(102, 132, 248, 21);
		contentPane.add(txtNovoCpf);
		txtNovoCpf.setColumns(10);
		
		JLabel txtAmbl3 = new JLabel("");
		txtAmbl3.setIcon(new ImageIcon(JCadastroCliente.class.getResource("/br/com/poo/imagens/Logo.png")));
		txtAmbl3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtAmbl3.setBounds(-83, 136, 501, 195);
		contentPane.add(txtAmbl3);
		
		JButton botaoSalvarCadastro = new JButton("Cadastrar");
		botaoSalvarCadastro.setBackground(new Color(64, 128, 128));
		botaoSalvarCadastro.setBounds(184, 383, 94, 21);
		contentPane.add(botaoSalvarCadastro);
		
		txtNovoNome = new JTextField();
		txtNovoNome.setColumns(10);
		txtNovoNome.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNovoNome.setBounds(102, 78, 248, 21);
		contentPane.add(txtNovoNome);
		
		txtConfSenha = new JPasswordField();
		txtConfSenha.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtConfSenha.setBounds(102, 342, 248, 21);
		contentPane.add(txtConfSenha);
		
		JLabel labelConfSenha = new JLabel("Confirme sua senha *");
		labelConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelConfSenha.setBounds(102, 316, 132, 16);
		contentPane.add(labelConfSenha);
		
		JLabel labelNovoNome = new JLabel("Nome *");
		labelNovoNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNovoNome.setBounds(102, 55, 45, 13);
		contentPane.add(labelNovoNome);
		
		JLabel labelCamposAster = new JLabel("Os campos com \"*\" são obrigatórios.");
		labelCamposAster.setBounds(159, 414, 178, 13);
		contentPane.add(labelCamposAster);
		
		txtNovoTelefone = new JTextField();
		txtNovoTelefone.setColumns(10);
		txtNovoTelefone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNovoTelefone.setBounds(102, 182, 248, 21);
		contentPane.add(txtNovoTelefone);
		
		JLabel labelNovoTelefone = new JLabel("Telefone *");
		labelNovoTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNovoTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		labelNovoTelefone.setBounds(102, 159, 85, 13);
		contentPane.add(labelNovoTelefone);
		
		txtNovoEmail = new JTextField();
		txtNovoEmail.setColumns(10);
		txtNovoEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNovoEmail.setBounds(102, 232, 248, 21);
		contentPane.add(txtNovoEmail);
		
		JLabel labelNovoEmail = new JLabel("Email *");
		labelNovoEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNovoEmail.setBounds(102, 209, 45, 13);
		contentPane.add(labelNovoEmail);
	}
}
