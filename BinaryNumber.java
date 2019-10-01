package problem_1;

public class BinaryNumber {
	//String instance variable to store the users inputed string
	private String binary;
	
	//Constructor that accepts a string of characters that contain 0s and 1s
	BinaryNumber( String userinput ) {
		binary = userinput;
	}
	
	//Setter method to set the binary string 
	public void setBinary( String inp ) {
		binary = inp;
	}
	
	//Getter method to get the value of the string instance variable
	public String getBinary() {
		return binary;
	}
	
	//Method to convert the binary string to the decimal value
	public int Convert_to_Decimal() {
		//Gets the length to run the for loop
		double binaryLength = binary.length() - 1;
		int Decimal = 0;
		
		for(int i = 0; i <= binaryLength; i++) {
			//If the character is a 1, it will multiple it by 2 to the power of the index and then add it to the integer Decimal
			if(binary.charAt(i) == '1') {
				double toDecimal = 1*Math.pow(2, (binaryLength - i));
				Decimal += toDecimal;
			}
			//If the character is a 0, it will just add zero to the integer Decimal
			else if(binary.charAt(i) == '0') {
				Decimal += 0;
			}
		}
		
		//Returns an integer value called Decimal
		return Decimal;
	}
	
	//Method to convert the binary string to the octal value
	public String Convert_to_Octal() {
		//Converts the string to decimal
		int binaryDecimal = Convert_to_Decimal();
		//Use this value to run the while loop and to calculate the values below
		int decimaltoOctal = binaryDecimal;
		//Octal will act as a temporary string so I can add it to the OctalFinal string
		String Octal;
		String OctalFinal = "";
		
		//While loop to see if the number is still divisible by 8 and is greater than 1
		while((decimaltoOctal / 8) >= 1) {
			//Gets the remainder, this will be one of the bits
			int octalTemp = decimaltoOctal % 8;
			//Divides the number by 8 to go through the next run
			decimaltoOctal = decimaltoOctal / 8;
			//Converts the remained to a string
			Octal = Integer.toString(octalTemp);
			//Adds the remainder to the OctalFinal string
			OctalFinal = Octal + OctalFinal;	
		}
		//Calculates the last of the remainder to get the last bit
		int octalTemp = decimaltoOctal % 8;
		Octal = Integer.toString(octalTemp);
		OctalFinal = Octal + OctalFinal;
		
		//Returns a string value representing the Octal value
		return OctalFinal;
	}
	
	//Method to convert the binary string to the hexadecimal value
	public String Convert_to_Hexadecimal() {
		//Does the same process as octal but this time divided by 16
		int binaryDecimal = Convert_to_Decimal();
		int decimaltoHexa = binaryDecimal;
		String Hexa;
		String HexaFinal = "";
		while((decimaltoHexa / 16) >= 1) {
			int hexaTemp = decimaltoHexa % 16;
			decimaltoHexa = decimaltoHexa / 16;
			Hexa = Integer.toString(hexaTemp);
			//Checks to see if the value can be converted to a letter since we are converting to hexadecimal
			if(hexaTemp == 10) {
				Hexa = "A";
			}
			else if(hexaTemp == 11) {
				Hexa = "B";
			}
			else if(hexaTemp == 12) {
				Hexa = "C";
			}
			else if(hexaTemp == 13) {
				Hexa = "D";
			}
			else if(hexaTemp == 14) {
				Hexa = "E";
			}
			else if(hexaTemp == 15) {
				Hexa = "F";
			}
			HexaFinal = Hexa + HexaFinal;	
		}
		//Calculates the last of the remainder to get the last bit
		int hexaTemp = decimaltoHexa % 16;
		Hexa = Integer.toString(hexaTemp);
		if(hexaTemp == 10) {
			Hexa = "A";
		}
		else if(hexaTemp == 11) {
			Hexa = "B";
		}
		else if(hexaTemp == 12) {
			Hexa = "C";
		}
		else if(hexaTemp == 13) {
			Hexa = "D";
		}
		else if(hexaTemp == 14) {
			Hexa = "E";
		}
		else if(hexaTemp == 15) {
			Hexa = "F";
		}
		HexaFinal = Hexa + HexaFinal;
		
		//Returns the string value of Hexadecimal
		return HexaFinal;
	}
	
	//Method to print the object. This method will allow us to automatically call our object and it will print the instance variable
	public String toString() {
		String result = getBinary();
		
		return result;
	}
}
