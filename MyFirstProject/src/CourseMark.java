 import java.util.Scanner;
 
public class CourseMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner
		Scanner scanner = new Scanner(System.in);
		
		//array for holding mark
		int[] mark = new int[3];
		
		//holds the input from the user
		int num;
		
		//loop will popular mark[] with test marks
		for(int i = 0; i < mark.length; i++) {
			do {
				
				System.out.println("Enter a number between 0 and 100");
				num = scanner.nextInt();
				mark[i] = num;
				
				//lets the user know the number they entered was wrong
				if(num < 0 || num > 100) {
					System.out.println("The number you entered was invalid. Please try again");
				}
			}
			while(num > 100 || num <= 0); //will keep looping unless the number entered falls in the range of 0 - 100
		}
		
		//displays the users score, grade and feedback
		System.out.println("Score\tGrade\tFeedback");
		
		//loop to give fill the table with each mark from mark[]
		for(int i = 0; i < mark.length; i++) {
			
			//D grade
			if(mark[i] <= 25) {
				System.out.println(mark[i] + "\tD\tFail");
			}
			
			//C grade
			else if(mark[i] > 25 && mark[i] <= 50) {
				System.out.println(mark[i] + "\tC\tPass");
			}
			
			//B grade
			else if(mark[i] > 50 && mark[i] <= 75) {
				System.out.println(mark[i] + "\tB\tWell Done!");
			}
			
			//A grade
			else if(mark[i] > 75) {
				System.out.println(mark[i] + "\tA\tExcellent!");
			}
		}
		
		
		scanner.close();
	}

}
