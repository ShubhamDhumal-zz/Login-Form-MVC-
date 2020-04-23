package com.learning.views;

import javax.swing.*;

public class Failure extends JFrame {
	public Failure()
	{
		JLabel lblError=new JLabel("Error!!!");
		lblError.setBounds(90, 20, 100, 20);
		
		add(lblError);
	
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

}
