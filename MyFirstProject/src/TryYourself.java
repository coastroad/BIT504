import java.util.Scanner;
public class TryYourself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//get first name
		System.out.println("Enter your first name: ");
		String firstName = scanner.next();
		
		//get last name
		System.out.println("Enter your last name: ");
		String lastName = scanner.next();
		
		
		//get age
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
		//get favourite number
		System.out.println("Enter your favourite number");
		int favNumber = scanner.nextInt();
		
		//output the user inputs
		System.out.println("Hello, " + firstName + " " + lastName + "." + "\nYou are " + age + " years old." + "\nYour favourite number is " + favNumber +".");
;		
		
		
	}

}
