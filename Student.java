package studentedatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1- Freshman \n2- Shophomore\n3- Junior \n4- Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
	}
	// Generate ID
	private void setStudentID () {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (0 to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance += costOfCourse;
			}
			else {
				break;
			}
		} while (1 != 0);
	}


	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance +"$");
	}
	
	//  Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance-= payment;
		System.out.println("Thank you for your payment of " + payment +"$");
		viewBalance();
	}
	
	// Show info
	public String showInfo() {
		return "Name: " + firstName + lastName +
				"\nGrade level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses enrolled: " + courses +
				"\nbalance: " + tuitionBalance;
	}

	
}