package problem_1;
@SuppressWarnings("serial")
public class PhoneNumberException extends Exception {
	//Exception class that accepts a string parameter for a message
	PhoneNumberException( String message ){
		super( message );
	}
}
