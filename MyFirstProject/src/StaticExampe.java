

public class StaticExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create account object for John
		Account johnAccount = new Account();
		johnAccount.personName = "John";
		johnAccount.accountNumber = 1020498;
		johnAccount.balance = 700.39;
		
		
		
		//create account object for Mary
		Account maryAccount = new Account();
		maryAccount.personName = "Mary";
		maryAccount.accountNumber = 1020473;
		maryAccount.balance = 1590.39;
		
		//set the account fee
		Account.fee = 12.40;
		
		//display account fee
		System.out.println("John's fee: " + johnAccount.fee);
		System.out.println("Mary's fee: " + maryAccount.fee);
		
	}

}
