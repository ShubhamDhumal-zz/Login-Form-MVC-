package com.learning.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.learning.controllers.*;
import com.learning.models.*;

public class RegistrationFrame extends JFrame{
		
	JLabel registerForm, lblName, lblEmail, lblPwd, lblContact;
	JTextField name, email, pwd, contact;
	JButton register, cancel;
	
	UserModel user;
	Controller controller;
	
	public RegistrationFrame()
	{
		registerForm=new JLabel("RegistrationForm");
		registerForm.setBounds(90, 20, 100, 20);
		
		lblName=new JLabel("Enter your name");
		lblName.setBounds(20, 40, 100, 20);
		
		name=new JTextField();
		name.setBounds(130, 40, 100, 20);
		
		lblEmail=new JLabel("Enter E-mail");
		lblEmail.setBounds(20, 70, 100, 20);
		
		email=new JTextField();
		email.setBounds(130, 70, 100, 20);
		
		lblPwd=new JLabel("Enter Password");
		lblPwd.setBounds(20, 100, 100, 20);
		
		pwd=new JTextField();
		pwd.setBounds(130, 100, 100, 20);
		
		lblContact=new JLabel("Enter Contact No.");
		lblContact.setBounds(20, 130, 100, 20);
		
		contact=new JTextField();
		contact.setBounds(130, 130, 100, 20);

		register=new JButton("Register");
		register.setBounds(25, 160, 100, 20);
		
		cancel=new JButton("Cancel");
		cancel.setBounds(175, 160, 100, 20);
		
		add(registerForm);
		add(lblName);
		add(name);
		add(lblEmail);
		add(email);
		add(lblPwd);
		add(pwd);
		add(lblContact);
		add(contact);
		add(register);
		add(cancel);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setTitle("Registration Frame");
		
		controller = new Controller();
		
		register.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				String usrName= name.getText();
				String usrMail= email.getText();
				String usrPwd= pwd.getText();
				String usrCont= contact.getText();
				
				user = new UserModel(usrName, usrMail, usrPwd, usrCont);
				
				boolean valid = controller.registerUser(user);
				
				if(valid)
				{
					LoginFrame loginFrame = new LoginFrame(user);
					setVisible(false);
					loginFrame.setVisible(true);
				}
				else
				{
					email.setText("Invalid Email !!!");
				}
			}
		});

		cancel.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				email.setText("");
				pwd.setText("");
				contact.setText("");
			}
		});
	}

	public static void main(String[] args) {
		RegistrationFrame rframe=new RegistrationFrame();
	}

}
