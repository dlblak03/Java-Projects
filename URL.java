package problem_1;

import java.util.Scanner;

public class URL {

	public static void main(String[] args) {
		//Variable declarations
		String url, DisplayName;
		
		//Creating new scanner object
		Scanner scan = new Scanner(System.in);
		
		//Printing out the command for the user
		System.out.print("Enter the URL: ");
		
		//Scans the url the user as entered
		url = scan.nextLine();
		
		//Gets the length of the user entered url
		int Length = url.length();
		
		//Displays the name using the substring method
		DisplayName = url.substring(4, Length - 4);
		
		//Prints out the website name
		System.out.print("Website name: " + DisplayName);
	}

}
