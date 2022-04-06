import java.util.LinkedList;
import java.util.Scanner;

public class GroceryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a scanner object
		Scanner scanner = new Scanner(System.in);
		String reply = ""; //used to store user input
		
		LinkedList<String> groceryList = new LinkedList<String>();
		
		//check to see if the user wants to add a new item to the list
		boolean addItem;
		
		System.out.println("Do you want to enter an item into the grocery list? Type 'yes' or 'no'.");
		reply = scanner.next();
		
		//checks the users reply for yes or no
		if(reply.contains("yes"))
		{
			addItem = true;
		}
		else {
			addItem = false;
			System.out.println("Closing application");
		}
		
		while(addItem) {
			System.out.println("Enter the item to the grocery list");
			String item = scanner.next(); //gets the item from the user
			//adds the item to the list
			groceryList.add(item);
			
			//asks the user if they wish to add another item.
			//asks the user the first time using the app
			System.out.println("Do you want to enter an item into the grocery list? Type 'yes' or 'no'.");
			reply = scanner.next();
			
			//checks the users reply for yes or no
			if(reply.contains("yes"))
			{
				addItem = true;
			}
			else {
				addItem = false;
				System.out.println("This is your grocery list:");
			}
		}
		
		
		//displays the items in the list
		for(String foodItem : groceryList) {
			System.out.println(foodItem);
		}
		
		scanner.close();
	}

}
