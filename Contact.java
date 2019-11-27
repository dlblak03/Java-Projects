package problem_1;

public class Contact {
	
	private String Name, Phone;
	//Constructor that uses setName and setPhone methods
	public Contact( String N, String P ) throws PhoneNumberException {
		setName( N );
		setPhone( P );
	}
	//Sets the name of the contact
	public void setName( String N ) {
		Name = N;
	}
	//Sets the phone number and throws an exception when the format does not match North American format
	public void setPhone( String P ) throws PhoneNumberException {
		Phone = P;
		PhoneNumberException message = new PhoneNumberException("Phone number does not satisfy the phone number format for North America.");

		//Checks Local Number
		if(P.length() == 8) {	
			if(P.charAt(0) < '2' || P.charAt(0) > '9') {
				throw message;
			}
		}
				
		//Checks Domestic Number
		else if(P.length() == 12) {
			if(P.charAt(4) < '2' || P.charAt(4) > '9') {
				throw message;
			}
		}
				
		//Checks International Number
		else if(P.length() == 15) {	
			if(P.charAt(0) != '+' || P.charAt(1) != '1' || P.charAt(7) < '2' || P.charAt(7) > '9') {
				throw message;
			}
		}
				
		else {
			System.out.println("Invalid number.");
			throw message;
		}
	}
	//Returns the phone number
	public String getPhone() {
		return Phone;
	}
	//toString method to print out the object
	public String toString() {
		return (Name + ": " + Phone);
	}
}
