package assignmentsjavabasics1;

public class MainAssignmentJavaBasics1 {

	public static void main(String[] args) {
		
		// Question 1: Write a Java code to print "Welcome to The India" on the console and then print your name on a separate line.
		AssignmentJavaBasics1.displayMessage();
		
		// Question 2:Write a Java code to print a face. 
		AssignmentJavaBasics1.printFace();
		
		//Question 3: Write a Java code to check whether Java is installed on your computer. 
		AssignmentJavaBasics1.checkJavaInstalled();
		
		//Question 4: Write a Java code to Multiply Two Floating-Point Numbers
		float number1 = AssignmentJavaBasics1.multiplyFloatingNumbers(2.0f, 5.0f);
		System.out.println("The multiplication of two floating-point numbers are:" + number1);
		
		//Question 5: Write a Java code to calculate simple interest.
		System.out.println("Simple interest : " +AssignmentJavaBasics1.simpleInterest(10000, 5, 5));
		
		//Question 6: Write a Java code to print the result of the following operations. 
		int number2 = AssignmentJavaBasics1.expression();
		System.out.println("The result of the following expression is 5 + 15 / 3 * 2 - 8 % 3 = " + number2);
		
		//Question 7: Write a Java code to print the area of a circle. 	
		double  number3 = AssignmentJavaBasics1.areaCircle(7.5);
		System.out.println("The Area of the Circle = " + number3);
		
		//Question 8: Write a Java code to convert temperature from Fahrenheit to Celsius degree.
		number3=AssignmentJavaBasics1.fahrenheittoCelsius(212);
		System.out.println("212.0 degree Fahrenheit is equal to " + number3 +" in Celsius "); 
		
		//Question 9: Write a Java code that reads a number in inches, converts it to meters.
		number3=AssignmentJavaBasics1.convertInchtoMeter(1000);
		System.out.println("1000.0 inches = "+ number3 +" meters ");  
		
		//Question 10: A pen costs 50$ and it is been sold at a discount of 12%, what is the discount price of the pen?
		System.out.println("Price of the pen : " +AssignmentJavaBasics1.penDiscount(50, 12));
		
		//Question 11: Write a Java code to Compute Quotient of a number.
		  System.out.println("The Quotient Value : " +AssignmentJavaBasics1.quotientValue(20,10));
		  
		//Question 12: Write a Java code to Find ASCII Value of a character.
		  System.out.println("The ASCII value to the corresponding character is " +AssignmentJavaBasics1.asciiValue('a'));
		  
		//Question 13: Write a java code to assign a value of 100.235 to a double variable and then convert it to int.
		  System.out.println("The converted double value into an integer is : " +AssignmentJavaBasics1.conversion(100.235));

		//Question 14: Write a java code to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		  System.out.println("The addition of 3 and ASCII character 'd' is : " +AssignmentJavaBasics1.addNumberAndCharacter(3, 'd'));
		  
		//Question 15: Write a Java code that takes three numbers as input to calculate and print the average of the numbers.
		  System.out.println("The average of three numbers is : " +AssignmentJavaBasics1.average(4, 5, 2)); 
	}

}

