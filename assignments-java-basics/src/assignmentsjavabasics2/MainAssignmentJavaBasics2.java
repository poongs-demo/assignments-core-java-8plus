package assignmentsjavabasics2;

public class MainAssignmentJavaBasics2 {

	public static void main(String[] args) {
		
		//Question 16: Write a java code to calculate the monthly telephone bills
		  System.out.println("The telephone Bill : " +AssignmentJavaBasics2.telephoneBill(130));
		
		//Question 17: Write a Java code to Find Largest Among 3 integer Numbers
		  int number2 = AssignmentJavaBasics2.largestNumber(50, 40, 30);
		  System.out.println("The largest number among three integer numbers is:" + number2);
			
		//Question 18: Write a Java code to check whether an year (integer number) is a leap year or not.
		System.out.println("The Give year is a leap year ( true / false) : " +AssignmentJavaBasics2.isLeapYear(2010));
			
		//Question 19: Write a Java code to generate random integer in a specific range.
		System.out.println("The Random number between 10 and 20 is : " +AssignmentJavaBasics2.randomNumber(10,  20));
			
		//Question 20: Write a Java code for factorial of a number.
		System.out.println("The Factorial of a given number is : " +AssignmentJavaBasics2.factorial(5));
			
		//Question 21: Write a Java code that takes an integer number between 1 and 7 and displays the name of the weekday.
		System.out.println("The day name coressponding to the day value : " +AssignmentJavaBasics2.getDayName(3));
			
		//Question 22:Write a java code to calculate the monthly current bills.
        	System.out.println("The Current Bill :  " +AssignmentJavaBasics2.currentBill(256));
	
		//Question 23: A school has following rules for grading system:
	 	 System.out.println("The grade value corresponding to the marks : " +AssignmentJavaBasics2.grade(68));
			
		//Question 24: Write a Java code to Check Whether a Number is Even or not
		System.out.println("If the given number is Even means return true, otherwise return false : " +AssignmentJavaBasics2.checkEven(21));
					
		//Question 25: Write a Java code to Check Whether a Number is Positive or Negative or Zero
		System.out.println("The given is positive / negative / zero : " +AssignmentJavaBasics2.positiveOrNegative(0));
	}

}
