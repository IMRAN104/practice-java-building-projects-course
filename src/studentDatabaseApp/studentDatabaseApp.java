package studentDatabaseApp;
import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {
		// ask how many students we want to add
		// create n number of students
		
		/*student st1 = new student();
		st1.enroll();
		st1.payTuition();
		System.out.println("\n****** Student Information ******");
		System.out.println(st1.showInfo());*/
		
		System.out.print("Enter the number of new students to add: ");
		Scanner in = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		student[] students = new student[numberOfStudents];
		
		for (int i=0; i<numberOfStudents; i++) {
			students[i] = new student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println("\nPassing to the next student\n");

		}
		
		for (int i =0; i < numberOfStudents; i++) {
			System.out.println("\n****** Student Information ******");
			System.out.println(students[i].showInfo());
		}
				
		
	}

}
