package studentdatabaseapp;

import java.util.Scanner;

public class StudentDababaseApp {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student First Name :");
		String firstName = scanner.nextLine();
		System.out.println("Enter Student Last Name :");
		String lastName = scanner.nextLine();
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter Student Class Level: ");
		int gradeYear = scanner.nextInt();
		Student student = new Student(firstName, lastName, gradeYear);	
		student.enroll();
		student.payTuition();
		System.out.println(student.displayInfo());
		
	}

}
