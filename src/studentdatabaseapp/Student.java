package studentdatabaseapp;

import java.util.Scanner;
import java.util.StringJoiner;

public class Student {

	private String firstName;
	private String lastName;
	private String studentId;
	private StringBuilder courses;
	private int gradeYear;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int prefixId = 1000;
	private static final String NEWLINE = System.getProperty("line.separator");

	public Student(String firstName, String lastName, int gradeYear) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeYear = gradeYear;
		setStudentId();
		
	}

	private void setStudentId() 
	{
		prefixId++;
		this.studentId = this.gradeYear + "" + prefixId;
	}

	public void enroll() 
	{
		courses = new StringBuilder(NEWLINE);
		
		do {
			System.out.println("Enter course to enroll (Q to quit):");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();

			if (!course.equals("Q")) {
				courses.append(course);
				courses.append(NEWLINE);
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {
				System.out.println("BREAK!");
				break;
			}

		} while (true);

		System.out.println("Enrolled in:" + courses);
		System.out.println("Tuition Balance :" + tuitionBalance);

	}

	public void viewBalance() 
	{
		System.out.println("Your Balance  :" + tuitionBalance);
	}

	public void payTuition() 
	{
		viewBalance();
		System.out.println("Enter your payment :");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		tuitionBalance = tuitionBalance - payment;
		viewBalance();
	}
	

	public String displayInfo() 
	{
		StringJoiner joiner = new StringJoiner(NEWLINE); 
		
		joiner.add("Student Full Name :" +this.firstName +" "+ this.lastName);	
		joiner.add("Student Id :" + this.studentId) ;		
		joiner.add("Courses :" + this.courses.toString());		
		
		return joiner.toString();

	}

}
