package emailAdministrationApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int defaultPasswordLenght = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companyName = "company.com";
	
	// Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		
		// Call a method that return the password
		this.password = randomPassword(defaultPasswordLenght);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
	}
	
	// Ask for the department
	private String setDepartment () {
		System.out.println("Enter the department code: ");
		try (Scanner in = new Scanner(System.in)) {
			int depChoice = in.nextInt();
			switch (depChoice) {
			case 1: {
				return "salaes";
			}
			case 2: {
				return "dev";
			}
			case 3: {
				return "acct";
			}
			default:
				throw new IllegalArgumentException("Enter a number between 1 and 3 " + depChoice);
			}
			}
		}
	
	// Generate a random password
	private String randomPassword (int lenght) {
		String passwordSet = "ABCDEFJKLMNOPQRSTUVWXYZ0123456789!@#$%¨&*";	
		char[] password = new char[lenght];
		for (int i = 0; i < lenght; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Get mailbox capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	// Get alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	// Get password
	public String getPassword() {
		return password;
	}
	
	// Get info
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
