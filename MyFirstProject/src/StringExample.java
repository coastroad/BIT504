import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String firstName, middleName, lastName;
		
		System.out.println("Enter your first name: ");
		firstName = scanner.next();  //get the first name from the user
		
		System.out.println("Enter your middle name: ");
		middleName = scanner.next();  //get middle name
		
		System.out.println("Enter your last name");
		lastName = scanner.next(); //get last name
		
		System.out.println("Full name is: " + firstName + " " + middleName + " " + lastName); //display full name
	}

}
