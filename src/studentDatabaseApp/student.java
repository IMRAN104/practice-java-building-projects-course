package studentDatabaseApp;

import java.util.Scanner;

public class student { 
	private String firstName;
	private String lastName;
	private int classYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCouse = 600;
	private static int id = 1000;
	
	
	// Constructor: prompt user to enter student name and year
	public student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("STUDENT LEVEL:\n1 for Freshmen\n2 for Sophmore\n3 for Junior\n4 for Senior");
		System.out.print("Enter student class level: ");
		this.classYear = in.nextInt();
		
		/*System.out.println("STUDENT INFO\n" + "Name: " + this.firstName + " " + this.lastName + "\n" + "Class level: " + this.classYear);*/
		/*System.out.println("student ID: " + this.id);*/
		
		setStudentId();
		/*System.out.println("Student ID: " + this.studentID);*/
		
	}
	
	// Generate an ID
	private void setStudentId(){
		//grade level + static id
		id++;
		this.studentID = classYear + "" + id;
	}
	
	// Enroll in a courses
	public void enroll() {
		//get inside a loop
		
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCouse;
			}
			else {
				break;
			}	
		} while (1!=0);
	
		/*System.out.println("Enroll in: " + courses);
		System.out.println("Tuituion balance: " + tuitionBalance);*/
	}
	
	// View balance and pay tuition
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance + "€");
	}
	
	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter payment value: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment!");
		viewBalance();

	}
	// status of the student
	
	public String showInfo() {
		return "Student name: " + firstName + " " + lastName +
				"\nGrade Level: " + classYear + 
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: " +  tuitionBalance + "€" + "\n";
				
	
	
		
	}

}
