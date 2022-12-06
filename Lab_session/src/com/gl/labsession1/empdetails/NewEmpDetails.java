package com.gl.labsession1.empdetails;

public class NewEmpDetails {
	
	public String firstName;
	public String lastName;
	
	public NewEmpDetails(String firstname, String lastname) {
		this.firstName = firstname;
     	this.lastName = lastname;
	}

	public String getName()
	{    
		String emailID = firstName+lastName;
		System.out.println("Name is : "+emailID);
		return emailID.toLowerCase();
	}
	


}
