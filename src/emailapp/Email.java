package emailapp;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class Email {

	private String firstName;
	private String lastName;
	private String email;
	private String department;
	private String password;
	private String alternateMail;
	private int mailboxCapacity = 500;
	private static final int PASSWORDLENGTH = 10;
	private static final String COMPANYSUFFIX = "xxx.com";
	private static final String PASSWORDSET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
	private static final Random RANDOM = new SecureRandom();
	private static final String NEWLINE = System.getProperty("line.separator");

	public Email(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randomPassword();
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department.toLowerCase() + "."
				+ COMPANYSUFFIX;

	}

	private String setDepartment() 
	{
		System.out.println(
				"Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\n Enter Department Code:");

		Scanner scanner = new Scanner(System.in);
     	int departmentChoise = scanner.nextInt();
		scanner.close();
		switch (departmentChoise) 
		{
			case 1:
				return new Sales().departmentType();
			case 2:
				return new Development().departmentType();
			case 3:
				return new Account().departmentType();
			default:
				return "";
		}
	}

	private String randomPassword() 
	{
		StringBuilder strongPassword = new StringBuilder(PASSWORDLENGTH);

		for (int i = 0; i < PASSWORDLENGTH; i++) {
			strongPassword.append(PASSWORDSET.charAt(RANDOM.nextInt(PASSWORDSET.length())));
		}
		return new String(strongPassword);

	}

	public int getMailboxcapacity() 
	{
		return mailboxCapacity;
	}

	public void setMailboxcapacity(int capacity) 
	{
		this.mailboxCapacity = capacity;
	}

	public String getAlternateEmail() 
	{
		return alternateMail;
	}

	public void setAlternateEmail(String alternateEmail) 
	{
		this.alternateMail = alternateEmail;
	}

	public void changePassword(String password) 
	{
		this.password = password;
	}

	public String displayInfo() 
	{
		StringJoiner joiner = new StringJoiner(NEWLINE); 
		
		joiner.add(this.firstName);	
		joiner.add(this.lastName) ;
		joiner.add(this.department);
		joiner.add(this.email) ;		
		joiner.add(this.password);		
		joiner.add(this.alternateMail) ;		
		
		return joiner.toString();


	}

}
