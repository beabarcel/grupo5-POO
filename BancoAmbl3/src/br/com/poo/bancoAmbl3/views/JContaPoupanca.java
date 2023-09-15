package br.com.poo.bancoAmbl3.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.poo.bancoAmbl3.LigacaoViews.Autenticacao;
import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.contas.ContaPoupanca;
import br.com.poo.bancoAmbl3.pessoas.Cliente;

public class JContaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField textValor;
	private JTextField textDias;
	DecimalFormat df = new DecimalFormat("#,###.00");

	public JContaPoupanca(String contaAtual, boolean corrente, boolean poupanca, Cliente usuarioLogado, ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
		setTitle("Conta Poupança - Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		ContaPoupanca contaPoupanca = null;
//		try {
//			contaPoupanca = new ContaPoupanca().buscarContaPoupancaPorCpf(usuarioLogado.getCpf());
//		} catch (IOException e) {			
//			e.printStackTrace();
//		}
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Autenticacao a = new Autenticacao();
		JLabel lblOlPessoa = new JLabel("Olá " + contaPoupanca.getTitular() + "!" );
		lblOlPessoa.setBounds(10, 27, 217, 25);
		panel.add(lblOlPessoa);
		lblOlPessoa.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblOlPessoa.setForeground(new Color(0, 128, 128));
		lblOlPessoa.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel = new JLabel("Saldo");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 74, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel textSaldo = new JLabel("R$" + contaPoupanca.getSaldo());
		textSaldo.setFont(new Font("Dialog", Font.BOLD, 25));
		textSaldo.setForeground(new Color(255, 255, 255));
		textSaldo.setBounds(10, 102, 269, 30);
		contentPane.add(textSaldo);
		
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
		
		textValor = new JTextField();
		textValor.setBounds(311, 264, 86, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		textDias = new JTextField();
		textDias.setColumns(10);
		textDias.setBounds(101, 266, 86, 20);
		contentPane.add(textDias);
		
		JLabel lblPrazomeses = new JLabel("Prazo (dias)");
		lblPrazomeses.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrazomeses.setForeground(Color.WHITE);
		lblPrazomeses.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPrazomeses.setBounds(10, 270, 107, 14);
		contentPane.add(lblPrazomeses);
		
		JButton btnNewButton_1 = new JButton("Sacar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					JSaque jSaque = new JSaque(contaAtual, corrente, poupanca, usuarioLogado, contaCorrente, contaPoupanca);
					jSaque.setLocationRelativeTo(jSaque);
					jSaque.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(0, 51, 51));
		btnNewButton_1.setBounds(40, 169, 89, 23);
		contentPane.add(btnNewButton_1);
	
		JButton btnNewButton_1_1_1 = new JButton("Depositar");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JDeposito jDeposito = new JDeposito(contaAtual, corrente, poupanca, usuarioLogado, contaCorrente, contaPoupanca);
				jDeposito.setLocationRelativeTo(jDeposito);
				jDeposito.setVisible(true);
			}
		});
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
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer dias = Integer.parseInt(textDias.getText());
				Double valor = Double.parseDouble(textValor.getText());
				ContaPoupanca contap = new ContaPoupanca();
				JOptionPane.showMessageDialog(null, "Rendimendo total R$"
				+ df.format(contap.relatorioRendimento(dias, valor)) , "Relatório",
						JOptionPane.DEFAULT_OPTION);
			}
		});
		btnNewButton_1_1_2.setForeground(new Color(0, 51, 51));
		btnNewButton_1_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1_1_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1_2.setBounds(10, 312, 119, 23);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Voltar");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                dispose();
                JCliente jCliente = new JCliente(corrente, poupanca, usuarioLogado, contaCorrente, contaPoupanca);
                jCliente.setLocationRelativeTo(jCliente);
                jCliente.setVisible(true);
            }
		});
		btnNewButton_1_1_1_1.setForeground(new Color(0, 51, 51));
		btnNewButton_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1_1_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1_1_1.setBounds(329, 407, 89, 23);
		contentPane.add(btnNewButton_1_1_1_1);
	}
}
