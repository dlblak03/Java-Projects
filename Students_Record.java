package problem_1;

import java.util.Scanner;

public class Students_Record {

	public static void main(String[] args) {
		
		//Scanners for all the variables to create a new student and set the college courses
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		Scanner scan6 = new Scanner(System.in);
		Scanner scan7 = new Scanner(System.in);
		Scanner scan8 = new Scanner(System.in);
		
		//Asks the advisor for how many students they want to enter
		System.out.print("How many students would you like to enter: ");
		int numofstudents = scan.nextInt();
		
		//Creates a new array of students with the amount the advisor wants to create
		Student[] students = new Student[numofstudents];
		
		//Creates an array of type double to keep track of the hours each student takes
		double[] hrs = new double[numofstudents];
		
		//Creates the students and classes
		for( int id2 = 0; id2 < numofstudents; id2++ ) {
			
			//Variable to use to check the ID number if it is valid
			int id;
			do {
				//This is where the advisor will enter a valid ID number
				System.out.println("Enter the ID number of the student: ");
				id = scan2.nextInt();
				if(id < 100000 || id > 999999)
					System.out.println("Invalid ID number, try again.");
			}while(id < 100000 || id > 999999);
			
			//Creates a new student at that array index with the ID the advisor entered
			students[id2] = new Student(id);
			
			//Asks the advisor how many courses the student has taken
			System.out.println("How many courses would you like to enter for the student: ");
			int numofcourses = scan3.nextInt();
			
			//For loop to create the amount of classes the advisor needs
			for(int i = 0; i < numofcourses; i++) {
				
				//Asks for the course title and course number
				System.out.println("What is the course title: ");
				String classname = scan4.nextLine();
				System.out.println("What is the course number: ");
				String coursenum = scan5.nextLine();
				
				//Verifies the credit hour is between 1 and 9
				Double credithr;
				do {
					System.out.println("How many credit hours is the class: ");
					credithr = scan6.nextDouble();
					if(credithr < 1 || credithr > 9)
						System.out.println("Invalid credit hours, try again.");
				}while(credithr < 1 || credithr > 9);
				
				//Creates a new course object with the parameters the advisor entered above
				CollegeCourse classes = new CollegeCourse(classname, coursenum, credithr);
				
				//Sets the course with the student 
				students[id2].setCollegeCourse(i, classes);
				
				//Where the advisor enters the grade the student received in the class, verifies it is an A, B, C, D, or F
				String grade;
				int compare;
				do {
					System.out.println("Enter the grade the student received in the class: ");
					grade = scan7.nextLine();
					compare = 0;
					if(grade.charAt(0) == 'A') 
						compare = 1;
					else if(grade.charAt(0) == 'B')
						compare = 1;
					else if(grade.charAt(0) == 'C') 
						compare = 1;
					else if(grade.charAt(0) == 'D') 
						compare = 1;
					else if(grade.charAt(0) == 'F') 
						compare = 1;
					else {
						compare = 0;
						System.out.println("Invalid grade, try again.");
					}
				}while(compare == 0);
				
				//Sets the letter grade of the students course object
				classes.setLetterGrade(grade.charAt(0));
				
				//Keeps track of the total hours the student has taken and assigns it to the array 
				hrs[id2] += classes.getCreditHours();
			}
		}
		
		//Prints out all the students info, ID, credit hours taken, and the student's GPA
		System.out.println("Students Information");
		for(int id3 = 0; id3 < numofstudents; id3++) {
			int identification = students[id3].getID_number();
			double semestergpa = students[id3].getSEM_GPA();
			System.out.println("ID number: " + identification + "   Credit Hours: " + hrs[id3] + "   Semester GPA: " + semestergpa);
		}
		
		//Prints out the students information by searching for the student's ID number
		System.out.println("Enter the student ID number you want to print: ");
		int search = scan8.nextInt();
		for(int id4 = 0; id4 < numofstudents; id4++) {
			int identification = students[id4].getID_number();
			double semestergpa = students[id4].getSEM_GPA();
			if(search == identification)
				System.out.println("ID number: " + identification + "   Credit Hours: " + hrs[id4] + "   Semester GPA: " + semestergpa);
		}
		
		scan.close();
		scan2.close();
		scan3.close();
		scan4.close();
		scan5.close();
		scan6.close();
		scan7.close();
		scan8.close();
	}
}
