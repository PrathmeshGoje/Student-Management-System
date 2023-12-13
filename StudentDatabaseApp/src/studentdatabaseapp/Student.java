package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private int tuitionBalance = 0;
	public int numofCourses;
	private static int costofCourse = 100000;
	private static int id = 100;
	public String Courses[];
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nEnter Student First name: ");
		this.firstName = sc.nextLine();
		
		System.out.printf("Enter Student Last name: ");
		this.lastName = sc.nextLine();
		
		System.out.println("\n 1 - Frist Year\n 2 - Second Year\n 3 - Third Year\n 4 - Final Year");
		
		System.out.printf("Enter Student Class Year: ");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
		
	}
	
	private void setStudentID() {
		id = id + 1;
		this.studentID = gradeYear + "" + id;
	}
	
	public void enroll() {
			System.out.print("\nEnter number of Courses to Enroll: ");
			Scanner sc = new Scanner(System.in);
			
			numofCourses = sc.nextInt();
			Courses = new String[numofCourses];
			
			for(int n = 0; n < numofCourses; n++) {
				System.out.printf("Enter Course " + (n+1) + ": ");
				Scanner in = new Scanner(System.in);
				Courses[n] = in.nextLine();
				tuitionBalance = tuitionBalance + costofCourse;
			}
	}
	
	public void viewBalance() {
		System.out.println("\nYour balance is: $" + tuitionBalance);
	}
	
	public void payTution() {
		viewBalance();
		System.out.print("\nEnter your payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Payment Successfull of $" + payment);
		viewBalance();
	}
	
	public void showInfo() {
		System.out.println("Name: "+ firstName + " " + lastName + "\nStudent ID: " + studentID);
		System.out.println("Courses Enrolled: "); 
		if (Courses != null) {
			for(int n = 0; n < numofCourses; n++) {
				System.out.println((n+1) + "." + Courses[n]);
			}
		} else {
			System.out.println("No courses enrolled yet.");
		}
		System.out.println("Balance: $ " + tuitionBalance);
	}
}