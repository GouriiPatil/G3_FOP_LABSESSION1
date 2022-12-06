package com.gl.labsession1.credservice;

import com.gl.labsession1.interfaces.CredGenerationInterface;
import com.gl.labsession1.empdetails.NewEmpDetails;
import java.util.Scanner;

public class CredentialService implements CredGenerationInterface {
			
		public String EmailSuffix = ".com";
		public String department ="";
		public String emailID = "";
		public  char[] password =new char[8]; 
		public String prefix = "";
		
		String fName,lName,cName="";
		
		Scanner userinput = new Scanner(System.in);
		
		public void generateEmailAddress()
		{
			
			System.out.println("Enter Firstname");   
		    this.fName = userinput.nextLine();
			
			System.out.println("Enter Lastname");
		    this.lName = userinput.nextLine();
			
			System.out.println("Enter Company Name");
			cName = userinput.nextLine();
			
			NewEmpDetails obj1 = new NewEmpDetails(fName,lName);	
			
			prefix = obj1.getName();
			
		}
		
		
		public void generatePassword()
		{
			String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			
			for(int i=0;i<8;i++) 
			{
				int rand=(int)(Math.random()*passwordSet.length());
				password[i]=passwordSet.charAt(rand);
			}
			
			System.out.println(password);
		}
		
		public void determineDepartment()
		
		{
			
			System.out.println("Please Enter Department from the following .........");   
			System.out.println("\n 1. Technical \n 2. Admin \n 3. HumanResource  \n 4. Legal ");
			
			int input = userinput.nextInt();
		
			if(input==1)
			{
				department = "Technical";
			}
			
			else if(input==2)
			{
				department = "Admin";
		    }
			else if(input==3)
			{
			department = "HumanResource";
		    }
			else if(input==4)
			{
				department = "Legal";
			}
			else 
			{
				System.out.println("Wrong Input");
			}
			
		}
			
		public void showCredentials()
		
		{
			emailID = prefix + "@" + department + "." +cName +".com";
			
			System.out.println("Dear "+fName+" your generated credentials are as follows ...\n");
			System.out.println("--------------------------------------------");
			System.out.println ("Email ID : "+emailID);
			System.out.print("Password Is : ");
			System.out.println(password);	
			System.out.println("--------------------------------------------");
			
		}
		
		

	}


