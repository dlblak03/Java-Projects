package problem_1;

import java.util.Scanner;

public class ContactBuilder {

	public static void main(String[] args) {
		//Array with max 10 to hold contact objects
		Contact AllContacts[] = new Contact[10];
		
		//Scanners to get all the necessary variables
		Scanner namescanner = new Scanner(System.in);
		Scanner phonescanner = new Scanner(System.in);
		Scanner nocscanner = new Scanner(System.in);
		int numofcontacts;
		
		//Welcome menu for the program
		System.out.println("Welcome to the Contact program!");
		System.out.println("Please use the following guidelines to enter phone numbers: ");
		System.out.println("Local Number: Nxx-xxxx, where N is for digits 2 - 9");
		System.out.println("Domestic Number: NPA-Nxx-xxxx, where NPA is the 3-digit area code");
		System.out.println("Internation Number: +1-NPA-Nxx-xxxx\n");
		System.out.println("Enter the number of contacts you want to enter (Max 10): ");
		numofcontacts = nocscanner.nextInt();
		
		//For loop to create all the contacts
		for( int i = 0; i < numofcontacts; i++) {
			//Gets the info of the contacts
			System.out.println("Enter the name of the contact: ");
			String n = namescanner.nextLine();
			System.out.println("Enter the phone number(please include the dash marks with the number): ");
			String p = phonescanner.nextLine();
			
			//Boolean to see if a contact has been successfully created
			boolean created = true;
			
			//Tries to create new contact 
			try {
				AllContacts[i] = new Contact( n, p );
			}
			//Catches the message if an exception is throw
			catch ( PhoneNumberException Message ){
				//Displays the message
				System.out.println();
				System.out.println("The exception message is: " + Message.getMessage());
				System.out.println();
				//changes the boolean value to false so the success message will not be displayed
				created = false;
				AllContacts[i] = null;
			}
			//Success message if contact has been created
			if(created) {
				System.out.println("Contact was successfully created!");
			}
		}
		
		System.out.println("\n" + "Printing all contacts: " + "\n");
		
		//Prints out all the successfully made contacts
		for(Contact p : AllContacts) {
			if(p != null) {
				System.out.println(p);
			}
		}
		
		namescanner.close();
		phonescanner.close();
		nocscanner.close();
	}
}
