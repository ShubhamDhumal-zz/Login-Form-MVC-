package com.learning.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.learning.controllers.*;
import com.learning.models.*;

public class LoginFrame extends JFrame {
	JLabel loginForm, lbluname, lblpwd,error;
	JTextField urname, lpwd;
	JButton login, clear;
	
	Controller controller;
	
	public LoginFrame(UserModel model)
	{
		loginForm=new JLabel("Login Form");
		loginForm.setBounds(90, 20, 100, 20);
		
		lbluname=new JLabel("Username");
		lbluname.setBounds(20, 50, 100, 20);
		
		urname=new JTextField();
		urname.setBounds(130, 50, 100, 20);
		
		lblpwd=new JLabel("Password");
		lblpwd.setBounds(20, 80, 100, 20);
		
		lpwd=new JTextField();
		lpwd.setBounds(130, 80, 100, 20);

		error=new JLabel();
		error.setBounds(75, 140, 150, 20);
		
		login=new JButton("Login");
		login.setBounds(25, 110, 100, 20);
		
		clear=new JButton("Clear");
		clear.setBounds(175, 110, 100, 20);

		add(loginForm);
		add(lbluname);
		add(urname);
		add(lblpwd);
		add(lpwd);
		add(login);
		add(clear);
		add(error);
		
		controller = new Controller();

		
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String usrName=urname.getText();
				String usrPwd=lpwd.getText();
				
				boolean valid= controller.loginUser(usrName, usrPwd, model);
				
				if(valid)
				{
					HomeFrame homeFrame = new HomeFrame(model);
					setVisible(false);
					homeFrame.setVisible(true);
				}
				else
				{
					Failure fail= new Failure();
					setVisible(false);
					fail.setVisible(true);
				}
			}
		});
		
		clear.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				urname.setText("");
				lpwd.setText("");
			}
		});
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
        setTitle("Login Frame");
	}
	
}
