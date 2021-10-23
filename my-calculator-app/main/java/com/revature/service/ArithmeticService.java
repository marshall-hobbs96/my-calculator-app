package com.revature.service;

// The service layer is responsible for the processing of data. We would perform business logic inside of the service layer.
// Ex. imagine you are developing the backend for facebook. The service layer of Facebook's backend would contain business logic related to providing friend
// recommendations, ad recommendations, etc. for a particular Facebook user.
// All sorts of complex algorithms could be developed, and those would ultimately be part of this "service" layer.
// Sometimes, the service layer will be pretty simple (especially for CRUD applications)
// CRUD = Create, Read, Update, Delete
// CRUD applications are applications that are primarily designed to keep records of data
public class ArithmeticService {

	public int checkEmpty(String number1String, String number2String) { // function for checking if either field is
																			// empty. 0 = fine, 1 = first operand, 2 = second operand, 3 = both operands

		int result = 0;

		if ((number1String == "") & (number2String == "")) {

			result = 3;	//both operands field empty
			
		}

		else if (number1String == "") {

			result = 1;	//first operand field empty 


		}

		else if (number2String == "") {

			result = 2;	//second operand field empty

		}
		
		return result; 

	}

	public String doAddition(String number1String, String number2String) {

		String result = "";

		int error = checkEmpty(number1String, number2String);
		
		switch(error) {
		
		case 0: // A OK!

			break;

		case 1: // first operand missing
			result = "Missing first operand. Please input first number to add.";
			break;
			
			
		case 2: //second operand missing
			result = "Missing second operand. Please input second number to add.";
			break;
			
			
		case 3: //both operands missing 
			result = "Missing both operands. Please input two numbers to add.";
			break;
	
		
		
		}
		
		if(error != 0) {
			
			return result;
			
		}

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double sum = number1 + number2;

		// String result = "The result of adding " + number1 + " and " + number2 + " is
		// " + sum; // Convert from double representation of a number to a String
		// representation
		result += sum;
		return result;
	}

	public String doSubtraction(String number1String, String number2String) { // service level method for subtraction
		
		String result = "";
		int error = checkEmpty(number1String, number2String);
		switch (error) {
		
			case 0: //A OK!
				break;
			case 1: // first operand missing
				result = "Missing first operand. Please input first number to subtract from.";
				break;
			case 2: // second operand missing 
				result = "Missing second operand. Please input second number to subtract with.";
				break;
			case 3: // both operands missing 
				result = "Missing both operands. Please input first and second numbers.";
				break;
			
		}
		
		if (error != 0) {
			
			return result;
			
		}
		// need to determine which number is fire operand and which is second, i.e.,
		// num1 - num2 or num/2 - num1?

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double diff = number1 - number2;

		// String result = "The result of subtracting " + number2 + " from " + number1 +
		// " is " + diff;
		result += diff;
		return result;

	}

	public String doMultiplication(String number1String, String number2String) {
		
		String result = "";
		int error = checkEmpty(number1String, number2String);
		
		switch(error) {
		
		case 0: //A OK!
			break;
		case 1: //first operand missing
			result = "Missing first operand. Please input first number to multiply by.";
			break;
		case 2: //second operand missing
			result = "Missing second operand. Please input second number to multiply by.";
			break;
		case 3: //both operands missing
			result = "Missing both operands. Please input two numbers to multiply by.";
			break;
		}
		
		if(error != 0) {
			
			return result;
			
		}

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double product = number1 * number2;

		// String result = "The result of multiplying " + number1 + " by " + number2 + "
		// is " + product;
		result += product; 
		return result;

	}

	public String doDivision(String number1String, String number2String) {

		String result = "";
		
		int error = checkEmpty(number1String, number2String);
		
		switch(error) {
		
		case 0: // A OK!
			break;
		case 1: // missing first operand
			result = "Missing first operand. Please input first number to be dividend.";
			break;
		case 2: //missing second operand
			result = "Missing second operand. Please input second number to be divisor."; 
			break;
		case 3: //missing both operands
			result = "Missing both operands. Please input dividend and divisor.";
			break;
		
		}
		
		if(error != 0) {
			
			return result;
			
		}
		
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double quotient = number1 / number2;

		// String result = "The result of dividing " + number1 + " by " + number2 + " is
		// "+ quotient;
		result += quotient; 
		return result;

	}

}