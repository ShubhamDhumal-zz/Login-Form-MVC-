package com.learning.views;

import javax.swing.*;

import com.learning.models.*;

public class HomeFrame extends JFrame {
	JLabel homeFrame, loginSucess;
	
	public HomeFrame(UserModel model)
	{
		homeFrame=new JLabel("HOME PAGE");
		homeFrame.setBounds(90, 20, 100, 20);
		
		loginSucess=new JLabel("WELCOME "+model.getUserName());
		loginSucess.setBounds(90, 20, 100, 20);

		add(homeFrame);
		add(loginSucess);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

}
