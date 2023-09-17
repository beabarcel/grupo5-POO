package br.com.poo.bancoAmbl3.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.poo.bancoAmbl3.enums.PresidenteEnum;
import br.com.poo.bancoAmbl3.pessoas.Presidente;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class JPresidente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DecimalFormat df = new DecimalFormat("#,###.00");
	public JPresidente() {
		setTitle("Acesso Presidencial - Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelAcessoExclusivo = new JLabel("Acesso exclusivo à Presidencia");
		labelAcessoExclusivo.setBackground(new Color(255, 255, 255));
		labelAcessoExclusivo.setForeground(new Color(0, 0, 0));
		labelAcessoExclusivo.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelAcessoExclusivo.setBounds(119, 0, 248, 45);
		contentPane.add(labelAcessoExclusivo);
		
		JLabel txtAmbl3 = new JLabel("AMBL3");
		txtAmbl3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtAmbl3.setBounds(440, 353, 45, 13);
		contentPane.add(txtAmbl3);
		
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JLogin jLogin = new JLogin();
				jLogin.setLocationRelativeTo(jLogin);
				jLogin.setVisible(true);
			}
		});
		botaoSair.setForeground(new Color(0, 0, 0));
		botaoSair.setBackground(new Color(255, 255, 255));
		botaoSair.setBounds(209, 328, 92, 22);
		contentPane.add(botaoSair);
		
		JLabel labelAcao = new JLabel("O que você deseja fazer?");
		labelAcao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelAcao.setHorizontalAlignment(SwingConstants.LEFT);
		labelAcao.setBounds(53, 79, 161, 14);
		contentPane.add(labelAcao);
		
		JComboBox<String> comboBox = new JComboBox<>();
		List<PresidenteEnum> funcoesP = Arrays.asList(PresidenteEnum.values());
		comboBox.addItem("Selecione uma das opções:");
		for(PresidenteEnum opcao : funcoesP) {
			comboBox.addItem(opcao.getTipo());
		}
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo = comboBox.getSelectedItem().toString();
				if(tipo.equalsIgnoreCase(PresidenteEnum.CADASTRAR_CLIENTE.getTipo())) {
					dispose();
					JCadastro jCadastro = new JCadastro();
					jCadastro.setLocationRelativeTo(jCadastro);
					jCadastro.setVisible(true);
				} else if(tipo.equalsIgnoreCase(PresidenteEnum.CADASTRAR_FUNCIONARIO.getTipo())) {
					dispose();
					JCadastroFuncionario jCadastroFuncionario = new JCadastroFuncionario();
					jCadastroFuncionario.setLocationRelativeTo(jCadastroFuncionario);
					jCadastroFuncionario.setVisible(true);
					//implementar relatorio diretores
				} else if(tipo.equalsIgnoreCase(PresidenteEnum.RELATORIO_DIRETORES.getTipo())) {
					dispose();
					Presidente presidente = new Presidente();
					try {
						presidente.relatorioDiretores();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
					
				} else if(tipo.equalsIgnoreCase(PresidenteEnum.RELATORIO_VALORES.getTipo())) {
					Presidente presidente = new Presidente();
					try {
						JOptionPane.showMessageDialog(null, "Capital Total R$"
								+ df.format(presidente.relatorioCapital()) , "Relatório",
										JOptionPane.DEFAULT_OPTION);
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		comboBox.setBounds(53, 104, 248, 22);
		contentPane.add(comboBox);
		

		contentPane.add(comboBox);
	}
}
