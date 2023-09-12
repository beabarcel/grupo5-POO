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
import javax.swing.JSlider;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class JPresidente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPresidente frame = new JPresidente();
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
		botaoSair.setForeground(new Color(0, 0, 0));
		botaoSair.setBackground(new Color(255, 255, 255));
		botaoSair.setBounds(209, 328, 92, 22);
		contentPane.add(botaoSair);
		
		JLabel labelAcao = new JLabel("O que você deseja fazer?");
		labelAcao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelAcao.setHorizontalAlignment(SwingConstants.LEFT);
		labelAcao.setBounds(53, 79, 161, 14);
		contentPane.add(labelAcao);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(53, 104, 137, 22);
		contentPane.add(comboBox);
		comboBox.addItem("Cadastrar Cliente");
		comboBox.addItem("Cadastrar Gerente");
		comboBox.addItem("Cadastrar Diretor");
		comboBox.addItem("Relatório de Diretores");
		comboBox.addItem("Relatório Valores");

		contentPane.add(comboBox);
	}
}
