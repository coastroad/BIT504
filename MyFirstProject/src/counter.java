import java.util.Scanner;
public class counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println("\n" + i);
		}
		
		scanner.close();
		
		//added a comment

	}

}
