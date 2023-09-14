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

public class JCadastro extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtNovaSenha;
	private JTextField txtNovoCpf;
	private JTextField txtNovoNome;
	private JPasswordField txtConfSenha;
	private JTextField txtNovoTelefone;
	private JTextField txtNovoEmail;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCliente frame = new JCliente();
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
	public JCadastro() {
		setTitle("Cadastro - Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 474);
		setBounds(100, 100, 444, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelCadastro = new JLabel("Cadastro Geral");
		labelCadastro.setBounds(162, 0, 154, 45);
		labelCadastro.setForeground(new Color(0, 0, 0));
		labelCadastro.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(labelCadastro);
		
		JLabel labelNovoCpf = new JLabel("CPF *");
		labelNovoCpf.setBounds(102, 109, 45, 13);
		labelNovoCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(labelNovoCpf);
		
		txtNovaSenha = new JPasswordField();
		txtNovaSenha.setBounds(102, 285, 248, 21);
		txtNovaSenha.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(txtNovaSenha);
		
		JLabel labelNovaSenha = new JLabel("Senha *");
		labelNovaSenha.setBounds(103, 262, 60, 13);
		labelNovaSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(labelNovaSenha);
		
		txtNovoCpf = new JTextField();
		txtNovoCpf.setBounds(102, 132, 248, 21);
		txtNovoCpf.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(txtNovoCpf);

		txtNovoCpf.setColumns(10);
		txtNovoCpf.setColumns(10);		

		JLabel txtAmbl3 = new JLabel("AMBL3");
		txtAmbl3.setBounds(449, 414, 45, 13);
		txtAmbl3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botaoSalvarCadastro = new JButton("Cadastrar");
		botaoSalvarCadastro.setBounds(184, 383, 94, 21);
		botaoSalvarCadastro.setBackground(new Color(255, 255, 255));
		contentPane.add(botaoSalvarCadastro);
		
		txtNovoNome = new JTextField();
		txtNovoNome.setBounds(102, 78, 248, 21);
		txtNovoNome.setColumns(10);
		txtNovoNome.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(txtNovoNome);
		
		txtConfSenha = new JPasswordField();
		txtConfSenha.setBounds(102, 342, 248, 21);
		txtConfSenha.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(txtConfSenha);
		
		JLabel labelConfSenha = new JLabel("Confirme sua senha *");
		labelConfSenha.setBounds(102, 316, 132, 16);
		labelConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(labelConfSenha);
		
		JLabel labelNovoNome = new JLabel("Nome *");
		labelNovoNome.setBounds(102, 55, 45, 13);
		labelNovoNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(labelNovoNome);
		
		JLabel labelCamposAster = new JLabel("Os campos com \"*\" são obrigatórios.");
		labelCamposAster.setFont(new Font("Tahoma", Font.PLAIN, 9));
		labelCamposAster.setBounds(151, 414, 212, 13);
		contentPane.add(labelCamposAster);
		
		txtNovoTelefone = new JTextField();
		txtNovoTelefone.setBounds(102, 182, 248, 21);
		txtNovoTelefone.setColumns(10);
		txtNovoTelefone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(txtNovoTelefone);
		
		JLabel labelNovoTelefone = new JLabel("Telefone *");
		labelNovoTelefone.setBounds(102, 159, 85, 13);
		labelNovoTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNovoTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(labelNovoTelefone);
		
		txtNovoEmail = new JTextField();
		txtNovoEmail.setBounds(102, 232, 248, 21);
		txtNovoEmail.setColumns(10);
		txtNovoEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(txtNovoEmail);
		
		JLabel labelNovoEmail = new JLabel("Email *");
		labelNovoEmail.setBounds(102, 209, 45, 13);
		labelNovoEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(labelNovoEmail);
		
	}
}
