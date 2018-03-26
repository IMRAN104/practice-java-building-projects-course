package emailApplication;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLenght = 8;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	// Constructor to receive first and last name
	public email (String firstName, String lastName, int passwordLenght) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		// call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Selected department: " + this.department);
		
		this.defaultPasswordLenght = passwordLenght;
		
		this.password = randomPassword(this.defaultPasswordLenght);
		System.out.println("Your password is: " + this.password);
	}
	// ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 none\nEnter the department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales";}
		else if (depChoice == 2 ) {return "dev";}
		else if (depChoice == 3 ) {return "acct";}
		else {return "";}
	}
	// generate random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKMLNOPQRSTUVXZ0123456789!@#$";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	// set mail box capacity
	
	// set alternate email
	
	// change passwaord
	
	
	
}
