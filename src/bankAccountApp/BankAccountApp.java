package bankAccountApp;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import utilities.*;
public class BankAccountApp {

	public static void main(String[] args) {
		// create a list of accounts
		List<Account> accounts = new LinkedList<Account>();
		
		// read a CSV file then create a new account on that data
		String file = "C:\\Users\\anapa\\Documents\\NewBankAccounts.csv";
		List<String[]> newCustomers = utilities.CSV.read(file);
		for (String[] customer : newCustomers ) {
			String name = customer[0];
			String sSN = customer[1];
			String accountType = customer[2];
			double initDeposit = Double.parseDouble(customer[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
				
			} 
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			
			} 
			else {
				System.out.println("ERROR.");
			}
			
		}
		for (Account acct : accounts) {
			System.out.println("\n  *******************  \n");
			acct.showInfo();
			
		}
				
		
		
		// do deposits, withdraws and transfers
		
	}

}
