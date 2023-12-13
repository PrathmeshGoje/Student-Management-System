package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		System.out.print("Enter number of students to Enroll: ");
		Scanner sc = new Scanner(System.in);
		int numofstudents = sc.nextInt();
		Student[] student = new Student[numofstudents];
		
		for(int n = 0; n < numofstudents; n++) {
			student[n] = new Student();
			student[n].enroll();
			student[n].payTution();
		} 
		
		for(int n = 0; n < numofstudents; n++) {
			System.out.println("\nDetails of Student no. " + (n+1));
			student[n].showInfo();
		}
	}

}
