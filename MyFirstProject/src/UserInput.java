import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		//declares a string 
		String courseCode = "BIT504";
			
		//output of string functions
		System.out.println("The course code is " + courseCode);
		System.out.println("The length is " + courseCode.length());
		System.out.println("The character in the second index is " + courseCode.charAt(2));
		
		//create a scanner object
		Scanner scanner = new Scanner(System.in);
		
		//declare and initialize variable
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();  //obtains integer
		System.out.println("Enter a decimal number: ");
		double decimalNum = scanner.nextDouble();  //obtains double
		System.out.println("Enter a floating number: ");
		float floatNum = scanner.nextFloat();  //obtains float
		System.out.println("Enter your last name: ");
		String text = scanner.next();  //obtains string
		System.out.println("Enter a boolean, true or false: ");
		Boolean b = scanner.nextBoolean();  //obtains Boolean
		
		System.out.println("Num is: " + num);
		System.out.println("DecimalNum is: " + decimalNum);
		System.out.println("Floating number is: " + floatNum);
		System.out.println("Text is: " + text);
		System.out.println("Boolean is: " + b);
		
		//using tabs in strings
		String tabs = "Name\t\tSurname\t\tAge\tHeight";
		System.out.println(tabs);
		
		
		//using a new line in strings
		String hello = "Hello\nworld!";
		System.out.println(hello);
		
		
	}
	
	
	
	
	

}
