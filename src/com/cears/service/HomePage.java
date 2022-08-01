package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class HomePage extends JFrame {
	private JLabel lblNewLabel;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 980);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(141, 0, 616, 108);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Home Page");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel.setBounds(168, 24, 461, 60);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO HOME PAGE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(247, 145, 418, 54);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage2 v =new LoginPage2();
				v.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(347, 246, 175, 54);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Sign Up");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage s =new RegistrationPage();
			s.setVisible(true);
			setVisible(false);
				
			}
		});
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(30, 144, 255));
		btnCancel.setBounds(347, 363, 175, 54);
		contentPane.add(btnCancel);
	}
}
