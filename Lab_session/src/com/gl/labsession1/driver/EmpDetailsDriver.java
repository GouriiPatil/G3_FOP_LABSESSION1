package com.gl.labsession1.driver;

import com.gl.labsession1.credservice.CredentialService;

public class EmpDetailsDriver{
	public static void main(String args[]) {
		  
		CredentialService obj2 = new CredentialService();
		
	    	 obj2.generateEmailAddress();
	    	 obj2.determineDepartment();
	     	 obj2.generatePassword();
	 	 obj2.showCredentials();

	}

}
