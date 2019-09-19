package problem_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		
		//Declaring variables to assign my users input to
		int v1x, v1y, v2x, v2y, v3x, v3y;
		double area1, perimeter1;
		
		//Decimal format to 2 decimal places
		DecimalFormat two = new DecimalFormat("0.00");
		
		//Scanner object to get user input
		Scanner scan = new Scanner(System.in);
		
		//Menu and commands to get the users vertices input
		System.out.println("Welcome to the Triangle Program");
		System.out.print("Enter the x coordinate for vertice 1: ");
		v1x = scan.nextInt();
		System.out.print("Enter the y coordinate for vertice 1: ");
		v1y = scan.nextInt();
		System.out.print("Enter the x coordinate for vertice 2: ");
		v2x = scan.nextInt();
		System.out.print("Enter the y coordinate for vertice 2: ");
		v2y = scan.nextInt();
		System.out.print("Enter the x coordinate for vertice 3: ");
		v3x = scan.nextInt();
		System.out.print("Enter the y coordinate for vertice 3: ");
		v3y = scan.nextInt();
		
		//Creating new Triangle object
		Triangle Triangle1;
		
		//Inserting the users input values into the new Triangle object
		Triangle1 = new Triangle(v1x, v1y, v2x, v2y, v3x, v3y);
		
		//Gets the values of the side lengths and stores it in an instance variable of that object
		Triangle1.getLengths();
		
		//Assigning perimeter1 to the getPerimeter method that will return perimeter
		perimeter1 = Triangle1.getPerimeter();
		
		//Assigning area1 to the getArea method that will return area
		area1 = Triangle1.getArea();
		
		//Prints out the Triangle object using the toString method
		System.out.println("\n" + Triangle1);
		
		//Prints out area1 and perimeter1 to display the working methods
		System.out.println("\nUsing the getArea method: Area = " + two.format(area1) + " units^2");
		System.out.println("\nUsing the getPerimeter method: Perimeter = " + two.format(perimeter1));
		
		//Closing my scanner
		scan.close();
	}
}
