import java.util.Scanner;

public class CalculateTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TAX = 0.15;
		
		Scanner scanner = new Scanner(System.in);
		
		double price = 0;
		
		System.out.println("Enter price of item: ");
		price = scanner.nextDouble();
		
		
		double taxToPay;
		taxToPay = price * TAX;
		
		//output how much tax they have to pay
		System.out.println("Price\tTAX");
		System.out.println("$" + price + "\t$" + taxToPay);
	}

}
