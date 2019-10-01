package problem_1;

import java.util.Scanner;

public class BinaryNumberTester {

	public static void main(String[] args) {
		//Create new scanner object to get users input
		Scanner scan = new Scanner(System.in);
		//This variable will be used to check to see if the user inputed a 0 and 1 binary number
		int checker = 1;
		//Variable to store users input
		String UI;
		
		//Do while loop to check to see if the user inputed a valid binary number
		do {
			System.out.print("Enter a binary number that is not 0: ");
			UI = scan.nextLine();
			
			//Gets the length to run the for loop
			int UILength = UI.length();
			//This variable will allow us to check to see if the user inputed a 0 binary number
			double zerochecker = Double.parseDouble(UI);
			//For loop to test if the input number is a correctly formatted binary number
			for(int i = 0; i < UILength; i++) {
				if(UI.charAt(i) != '0' && UI.charAt(i) != '1') {
					checker = 0;
					System.out.println("Invalid input.");
					break;
				}
				if(UI.charAt(i) == '0' || UI.charAt(i) == '1') {
					checker = 1;
				}
			}
			//Checks to see if the user inputed 0
			if(zerochecker == 0) {
				checker = 0;
				System.out.println("Invalid input.");
			}
			
		} while(checker == 0);
		
		//Creating new BinaryNumber object that accepts the users input as a parameter
		BinaryNumber myobj = new BinaryNumber(UI);
		
		//Prints out the object using the toString() method
		System.out.println("\nThe binary number you have entered is: " + myobj);
		
		//Assigning the conversions to variables so we can print them
		int d = myobj.Convert_to_Decimal();
		String o = myobj.Convert_to_Octal();
		String h = myobj.Convert_to_Hexadecimal();
		
		//Printing the conversions
		System.out.println("Decimal value: " + d);
		System.out.println("Octal value: " + o);
		System.out.println("Hexadecimal value: " + h + "\n");
		
		//Using the setter method to set the binary number to something else
		myobj.setBinary("1001001");
		//Using the getter method to get the binary number as a string
		String newbinary = myobj.getBinary();
		
		//Printing out the newbinary variable
		System.out.println("The new value of myobj is: " + newbinary);
		
		//Converting the new values with the conversions
		int d2 = myobj.Convert_to_Decimal();
		String o2 = myobj.Convert_to_Octal();
		String h2 = myobj.Convert_to_Hexadecimal();
		
		//Printing out the new conversions
		System.out.println("Decimal value: " + d2);
		System.out.println("Octal value: " + o2);
		System.out.println("Hexadecimal value: " + h2 + "\n");	
		
		//Closing the scanner
		scan.close();
	}
}
