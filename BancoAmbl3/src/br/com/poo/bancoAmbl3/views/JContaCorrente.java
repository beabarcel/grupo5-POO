package br.com.poo.bancoAmbl3.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.contas.ContaPoupanca;
import br.com.poo.bancoAmbl3.pessoas.Cliente;

public class JContaCorrente extends JFrame {

	private JPanel contentPane;
	private DecimalFormat df = new DecimalFormat("#,###.00");

	public JContaCorrente(String contaAtual, boolean corrente, boolean poupanca, Cliente usuarioLogado, ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
		setTitle("Conta Corrente - Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		ContaCorrente contaCorrente = null;
//		try {
//			contaCorrente = new ContaCorrente().buscarContaCorrentePorCpf(usuarioLogado.getCpf());
//		} catch (IOException e) {			
//			e.printStackTrace();
//		}
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(64, 128, 128));
		contentPane_1.setBounds(0, 0, 428, 441);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(347, 11, 71, 30);
		contentPane_1.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(JContaCorrente.class.getResource("/br/com/poo/imagens/Logo-p.png")));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 434, 63);
		contentPane_1.add(panel);
		
		JLabel lblOlPessoa = new JLabel("Olá " + contaCorrente.getTitular());
		lblOlPessoa.setHorizontalAlignment(SwingConstants.LEFT);
		lblOlPessoa.setForeground(new Color(0, 128, 128));
		lblOlPessoa.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblOlPessoa.setBounds(10, 12, 286, 40);
		panel.add(lblOlPessoa);
		
		JLabel lblNewLabel = new JLabel("Saldo");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 74, 46, 14);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R$" + df.format(contaCorrente.getSaldo()));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 102, 248, 30);
		contentPane_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Imprimir extrato");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(0, 51, 51));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setBounds(289, 106, 129, 23);
		contentPane_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Relatório de Tributação");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 232, 203, 23);
		contentPane_1.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 142, 408, 2);
		contentPane_1.add(panel_1);
		
		JButton btnNewButton_1 = new JButton("Sacar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JSaque jSaque = new JSaque(contaAtual, corrente, poupanca, usuarioLogado, contaCorrente, contaPoupanca);
				jSaque.setLocationRelativeTo(jSaque);
				jSaque.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(0, 51, 51));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setBounds(35, 169, 96, 23);
//		contentPane_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Transferir");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JTransferencia jTransferencia = new JTransferencia(contaAtual, corrente, poupanca, usuarioLogado, contaCorrente, contaPoupanca);
				jTransferencia.setLocationRelativeTo(jTransferencia);
				jTransferencia.setVisible(true);
			}
		});
		btnNewButton_1_1.setForeground(new Color(0, 51, 51));
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1.setBounds(159, 169, 107, 23);
		contentPane_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Depositar");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JDeposito jDeposito = new JDeposito(contaAtual, corrente, poupanca, usuarioLogado, contaCorrente, contaPoupanca);
				jDeposito.setLocationRelativeTo(jDeposito);
				jDeposito.setVisible(true);
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(0, 51, 51));
		btnNewButton_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1_1.setBounds(301, 169, 96, 23);
		contentPane_1.add(btnNewButton_1_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 219, 408, 2);
		contentPane_1.add(panel_1_1);
		
		JLabel lblValoresCobradosPor = new JLabel("Valores cobrados por operação:");
		lblValoresCobradosPor.setForeground(new Color(0, 0, 0));
		lblValoresCobradosPor.setFont(new Font("Dialog", Font.BOLD, 12));
		lblValoresCobradosPor.setBounds(10, 307, 203, 14);
		contentPane_1.add(lblValoresCobradosPor);
		
		JLabel lblSaqueRdez = new JLabel("Saque: R$0,10 (dez centavos)");
		lblSaqueRdez.setForeground(new Color(0, 0, 0));
		lblSaqueRdez.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblSaqueRdez.setBounds(10, 332, 217, 14);
		contentPane_1.add(lblSaqueRdez);
		
		JLabel lblDepsitoRdez = new JLabel("Depósito: R$0,10 (dez centavos)");
		lblDepsitoRdez.setForeground(new Color(0, 0, 0));
		lblDepsitoRdez.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblDepsitoRdez.setBounds(10, 359, 217, 14);
		contentPane_1.add(lblDepsitoRdez);
		
		JLabel lblTransfernciaRvinte = new JLabel("Transferência: R$0,20 (vinte centavos)");
		lblTransfernciaRvinte.setForeground(new Color(0, 0, 0));
		lblTransfernciaRvinte.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblTransfernciaRvinte.setBounds(10, 384, 217, 14);
		contentPane_1.add(lblTransfernciaRvinte);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setFont(new Font("Dialog", Font.BOLD, 12));
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JCliente jCliente = new JCliente(corrente, poupanca, usuarioLogado, contaCorrente, contaPoupanca);
				jCliente.setLocationRelativeTo(jCliente);
				jCliente.setVisible(true);
			}
		});
		botaoVoltar.setBounds(329, 407, 89, 23);
		contentPane_1.add(botaoVoltar);
		
		JButton botaoRelatorio = new JButton("Gerar Relatório");
		botaoRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tributação Total R$ "
						+ df.format(contaCorrente.getTotalTributacao()) , "Relatório",
								JOptionPane.DEFAULT_OPTION);
			}
		});
		botaoRelatorio.setBounds(20, 266, 144, 23);
		contentPane_1.add(botaoRelatorio);
		
		JButton botaoSacar = new JButton("Sacar");
		botaoSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					JSaque jSaque = new JSaque(contaAtual, corrente, poupanca, usuarioLogado, contaCorrente, contaPoupanca);
					jSaque.setLocationRelativeTo(jSaque);
					jSaque.setVisible(true);
			}
		});
		botaoSacar.setFont(new Font("Dialog", Font.BOLD, 12));
		botaoSacar.setBounds(37, 170, 96, 23);
		contentPane_1.add(botaoSacar);
	}
}
