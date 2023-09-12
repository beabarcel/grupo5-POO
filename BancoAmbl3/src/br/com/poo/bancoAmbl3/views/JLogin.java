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

import javax.swing.ImageIcon;
<<<<<<< HEAD

=======
>>>>>>> 1c331695694db603fca315aa40be3342d47acc09

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
		txtLogin.setForeground(new Color(0, 0, 0));
		txtLogin.setBounds(228, 56, 55, 37);
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
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
		botaoEntrar.setBackground(new Color(255, 255, 255));
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = txtCpf.getText();
				String senha = new String(txtSenha.getPassword());
				if(cpf != null && senha != null && !cpf.isEmpty() && !senha.isEmpty()) {
					JOptionPane.showMessageDialog(botaoEntrar, "Bem vindo(a), " + cpf);	
				}else {
					JOptionPane.showMessageDialog(botaoEntrar, "Erro! Preencha todos os campos.", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
				botaoEntrar.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        String cpf = txtCpf.getText();
				        String senha = new String(txtSenha.getPassword());
				        String tipoUsuario = autenticarUsuario(cpf, senha);

				        if (tipoUsuario != null) {
				            switch (tipoUsuario) {
				                
				            	case "Cliente":
				                    JCliente cliente = new JCliente();
				                    cliente.setVisible(true);
				                    break;
				               
				                case "Gerente":
				                    JGerente gerente = new JGerente();
				                    gerente.setVisible(true);
				                    break;
				                    
				                case "Diretor":
				                    JDiretor diretor = new JDiretor();
				                    diretor.setVisible(true);
				                    break;
				                    
				                case "Presidente":
				                    JPresidente presidente = new JPresidente();
				                    presidente.setVisible(true);
				                    break;
				            }
				            dispose();
				        } else {
				            JOptionPane.showMessageDialog(botaoEntrar, "Credenciais inválidas. Tente novamente.");
				        }
				    }

					private String autenticarUsuario(String cpf, String senha) {
						// TODO Auto-generated method stub
						return null;
					}
				});

			}
		});
		botaoEntrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botaoEntrar.setBounds(206, 266, 94, 21);
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
		
<<<<<<< HEAD
		JLabel labelIntro = new JLabel("Olá, seja bem-vindo(a) à plataforma digital do AMBL3!");
		labelIntro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelIntro.setBounds(102, 24, 334, 21);
		contentPane.add(labelIntro);

=======
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

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./imagens/Screenshot_2023-09-11_at_16.31.57.png"));
		lblNewLabel.setBounds(0, 216, 605, 350);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(69, 28, 70, 15);
		contentPane.add(lblNewLabel_1);
>>>>>>> 1c331695694db603fca315aa40be3342d47acc09
	}
}
