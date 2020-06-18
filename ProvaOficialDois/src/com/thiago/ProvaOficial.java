package com.thiago;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;

public class ProvaOficial extends JFrame {

	private JPanel contentPane;
	private JTextField Entrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProvaOficial frame = new ProvaOficial();
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
	public ProvaOficial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peso na Terra(kg):");
		lblNewLabel.setBounds(156, 11, 156, 14);
		contentPane.add(lblNewLabel);
		
		Entrada = new JTextField();
		Entrada.setBounds(156, 36, 86, 20);
		contentPane.add(Entrada);
		Entrada.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entrada.setText(null);
				// colocar para limpar o dado
			}
		});
		btnLimpar.setBounds(287, 35, 89, 23);
		contentPane.add(btnLimpar);
	
		
		
		JButton btnMercurio = new JButton("Merc\u00FArio");
		btnMercurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				double pesoPlaneta = 0.37;
				double pesoPessoa = Double.parseDouble(Entrada.getText());
				
				double resultado = pesoPessoa*pesoPlaneta;
			
				JOptionPane.showMessageDialog(null, "O peso dessa pessoa no planeta Mercúrio é: "+resultado+" KG");
			} catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro, por favor, siga os critérios abaixo:"+ "\n" + "Insira apenas números;"+ "\n" + "Em caso de número fracionado os separe por '.' e não ',';"+ "\n" + "Sempre insira um valor válido."+ "\n" + "Nome do erro: "+erro);
		 }
			}
		});
		btnMercurio.setBounds(39, 133, 89, 23);
		contentPane.add(btnMercurio);
	
		
		
		JButton btnMarte = new JButton("Marte");
		btnMarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				double pesoPlaneta = 0.38;
				double pesoPessoa = Double.parseDouble(Entrada.getText());
				
				double resultado = pesoPessoa*pesoPlaneta;
			
				JOptionPane.showMessageDialog(null, "O peso dessa pessoa no planeta Marte é: "+resultado+" KG");
			} catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro, por favor, siga os critérios abaixo:"+ "\n" + "Insira apenas números;"+ "\n" + "Em caso de número fracionado os separe por '.' e não ',';"+ "\n" + "Sempre insira um valor válido."+ "\n" + "Nome do erro: "+erro);
		 }
			}
		});
		btnMarte.setBounds(183, 133, 89, 23);
		contentPane.add(btnMarte);
	
		
		
		
		
		JButton btnSaturno = new JButton("Saturno");
		btnSaturno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			try {
				double pesoPlaneta = 1.15;
				double pesoPessoa = Double.parseDouble(Entrada.getText());
				
				double resultado = pesoPessoa*pesoPlaneta;
			
				JOptionPane.showMessageDialog(null, "O peso dessa pessoa no planeta Saturno é: "+resultado+" KG");
			} catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro, por favor, siga os critérios abaixo:"+ "\n" + "Insira apenas números;"+ "\n" + "Em caso de número fracionado os separe por '.' e não ',';"+ "\n" + "Sempre insira um valor válido."+ "\n" + "Nome do erro: "+erro);
		 }
			}
		});
		btnSaturno.setBounds(317, 133, 89, 23);
		contentPane.add(btnSaturno);


		
		JButton btnVenus = new JButton("V\u00EAnus");
		btnVenus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				double pesoPlaneta = 0.88;
				double pesoPessoa = Double.parseDouble(Entrada.getText());
				
				double resultado = pesoPessoa*pesoPlaneta;
			
				JOptionPane.showMessageDialog(null, "O peso dessa pessoa no planeta Vênus é: "+resultado+" KG");
			} catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro, por favor, siga os critérios abaixo:"+ "\n" + "Insira apenas números;"+ "\n" + "Em caso de número fracionado os separe por '.' e não ',';"+ "\n" + "Sempre insira um valor válido."+ "\n" + "Nome do erro: "+erro);
		 }
			}
		});
		btnVenus.setBounds(39, 187, 89, 23);
		contentPane.add(btnVenus);
	
		
		
		JButton btnJupiter = new JButton("J\u00FApiter");
		btnJupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				double pesoPlaneta = 2.64;
				double pesoPessoa = Double.parseDouble(Entrada.getText());
				
				double resultado = pesoPessoa*pesoPlaneta;
			
				JOptionPane.showMessageDialog(null, "O peso dessa pessoa no planeta Júpiter é: "+resultado+" KG");
			} catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro, por favor, siga os critérios abaixo:"+ "\n" + "Insira apenas números;"+ "\n" + "Em caso de número fracionado os separe por '.' e não ',';"+ "\n" + "Sempre insira um valor válido."+ "\n" + "Nome do erro: "+erro);
		 }
			}
		});
		btnJupiter.setBounds(183, 187, 89, 23);
		contentPane.add(btnJupiter);
	
		
		
		JButton btnUrano = new JButton("Urano");
		btnUrano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				double pesoPlaneta = 1.17;
				double pesoPessoa = Double.parseDouble(Entrada.getText());
				
				double resultado = pesoPessoa*pesoPlaneta;
				JOptionPane.showMessageDialog(null, "O peso dessa pessoa no planeta Urano é: "+resultado+" KG");	
			 } catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro, por favor, siga os critérios abaixo:"+ "\n" + "Insira apenas números;"+ "\n" + "Em caso de número fracionado os separe por '.' e não ',';"+ "\n" + "Sempre insira um valor válido."+ "\n" + "Nome do erro: "+erro);
			 }
			}
		});
		btnUrano.setBounds(317, 187, 89, 23);
		contentPane.add(btnUrano);
	
		
		
		JLabel lblTeste = new JLabel("Selecione o Planeta:");
		lblTeste.setBounds(183, 88, 129, 14);
		contentPane.add(lblTeste);

		double pesoPlaneta;
		double pesoPessoa;
		double resultado;
	
	}
}
