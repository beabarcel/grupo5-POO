package br.com.poo.bancoAmbl3.views;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class JCliente extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCliente frame = new JCliente();
					frame.setLocationRelativeTo(frame);
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
	public JCliente() {
		setTitle("Área do Cliente - Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 366);
		setBounds(100, 100, 444, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelCliente = new JLabel("Área do Cliente");
		labelCliente.setBounds(163, 44, 127, 45);
		labelCliente.setForeground(new Color(0, 0, 0));
		labelCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(labelCliente);

		JLabel txtAmbl3 = new JLabel("AMBL3");
		txtAmbl3.setBounds(449, 414, 45, 13);
		txtAmbl3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JLabel labelAcesso = new JLabel("Clique aqui para acessar sua conta e ver as opções disponíveis.");
		labelAcesso.setBounds(46, 215, 374, 13);
		labelAcesso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(labelAcesso);
		
		JButton botaoAcesso = new JButton("Acessar Conta");
		botaoAcesso.setBounds(163, 264, 127, 21);
		contentPane.add(botaoAcesso);

		botaoAcesso.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        JContaCorrente jContaCorrente = new JContaCorrente();
		        jContaCorrente.setVisible(true);
		    }
		});

		
		JLabel labelBemVindo = new JLabel("Olá! Seja bem-vindo(a) à área do cliente, ");
		labelBemVindo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelBemVindo.setBounds(110, 108, 222, 48);
		contentPane.add(labelBemVindo);
		
		JLabel labelBemVindo2 = new JLabel("aqui você pode acessar sua conta e realizar as operações desejadas!");
		labelBemVindo2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelBemVindo2.setBounds(46, 143, 343, 13);
		contentPane.add(labelBemVindo2);
	}
}
