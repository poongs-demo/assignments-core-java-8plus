package assignmentsjavabasics3;

public class MainAssignmentJavaBasics3 {

	public static void main(String[] args) {
		//Question 26: Write a Java code to display 'n' natural numbers.
		System.out.println("The natural numbers are : ");
		AssignmentJavaBasics3.naturalNumbers(5);
				
                 //Question 27: Write a Java code sum of 'n' natural Number.
	        //            1 + 2 + 3 + 4 + 5.......n
		 System.out.println("The sum of natural numbers is =  " +AssignmentJavaBasics3.sumofNaturalNumber(5));
		
		//Question 28: Write a Java code to Count Number of Digits in an Integer number.
		System.out.println("The Count the number of digits in a given number =  " +AssignmentJavaBasics3.countDigits(456));	
		
		//Question 29: Write a java code to find the value of one number raised to the power of another (Do not use Java built-in method).
		System.out.println("The Power of a given numbers =  " +AssignmentJavaBasics3.powerofNumber(2,5));
		
		//Question 30: Write a Java code to calculate highest common factor(HCF).
		System.out.println("The gcd value for the two given integer numbers are " +AssignmentJavaBasics3.hcf(5,10));
				
		//Question 31: Write a Java code and compute the sum of the digits of an integer number. 
		System.out.println("The sum of the digits of the number is : " +AssignmentJavaBasics3.sumofDigits(253));
				
		//Question 32:Write a Java code to display the cube of the number upto given an integer.
	       //                     1^3 + 2^3 + 3^3 + 4^3 + 5^3 + ................... + n^3 
		 System.out.println("The sum of cube series is :  " +AssignmentJavaBasics3.cubeSeries(4));
		 
	       //Question 33: Write a java code to calculate the sum of following series where n is input by user. 
	      //	                 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 
	       System.out.println("The Sum of the series : " +AssignmentJavaBasics3.series(3));
				
		//Question 34:Write a java code to calculate the following series where n is input by user. 
	       //                   	1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
		System.out.println("The Sum of the alternate sign series : " +AssignmentJavaBasics3.seriesNumber(4));
				
		//Question 35: Write a Java code to reverse a number
		System.out.println("The Reversed number is :  " + AssignmentJavaBasics3.reverseNumber(123456789));				
	}
}


