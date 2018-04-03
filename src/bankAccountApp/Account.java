package bankAccountApp;

public abstract class Account implements IBaseRate {
	// List common properties for both savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	
	// constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
				
		// set account number
		this.accountNumber = setAccountNumber();
	}
	
	// List common methods
	public abstract void setRate();
	
	public void deposit(double deposit) {
		balance = balance + deposit;
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		printBalance();
	}
		
	public void transfer(String name, double money) {
		balance = balance - money;
		System.out.println("Transfer " + money + "€ " + "to " + name);
		printBalance();
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accruded Interest: " + accruedInterest + "€.");
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now: " + balance + "€.");
	}
	
	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		
		accountNumber = lastTwoSSN + uniqueID + randomNumber;
		index ++;
		
		return accountNumber;
	}
	
	public void showInfo() {
		System.out.println("Name: " + this.name +
							"\n Social Security Number: " + this.sSN + 
							"\n Account Number: " + accountNumber +
							"\n Balance: " + balance + 
							"\n Rate: " + rate + "%");
	}
	
}
