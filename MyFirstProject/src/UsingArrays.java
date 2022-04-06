import java.util.Scanner;

public class UsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creates a scanner
		Scanner scanner = new Scanner(System.in);
		
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println(days[5]);
		
		days[4] = "Woohoo!";
		
		System.out.println(days[4]);
		
		//creates the animals array with 5 indexes
		String[] animals = new String[5];
		
		System.out.println("Please enter the names of five different animals.");
		animals[0] = scanner.next();
		animals[1] = scanner.next();
		animals[2] = scanner.next();
		animals[3] = scanner.next();
		animals[4] = scanner.next();
		
		//output the animals entered by the user
		System.out.println("The animals you entered are: " + animals[0] + " " + animals[1] + " " + animals[2] + " " + animals[3] + " " + animals[4]);
		
		
		
		
	}

}
