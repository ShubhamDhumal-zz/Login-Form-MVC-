package com.learning.controllers;

import java.util.regex.*;

import com.learning.models.*;

public class Controller {
	
	public boolean registerUser(UserModel model) 
	{
		String receivedName= model.getUserName();
		String receivedMail= model.getUserEmail();
		String recceivedPwd= model.getUserPwd();
		String receivedCont= model.getUserCont();
		
		Pattern pattern= Pattern.compile("@");
		Matcher match= pattern.matcher(receivedMail);
		if(match.find())
		{
			return true;
		}
		
		return false;
	}
	
	public boolean loginUser(String usrName, String usrPwd, UserModel md) {
		
		String nmReceived= usrName;
		String pwdReceived= usrPwd;
		
		if (nmReceived.equals(md.getUserName()) && pwdReceived.equals(md.getUserPwd()) ) {
			return true; 
		}
		return false;
	}
}
