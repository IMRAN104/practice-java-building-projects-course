package bankAccountApp;

public class Checking extends Account{
	// List the properties specific for a checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	// Call the constructor to initialize settings checking account
	public Checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setDebitCard();
		setRate();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// List any method specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random()*Math.pow(10, 12));
		debitCardPin = (int)(Math.random()*Math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println("Account type: Checking");
		super.showInfo();
		System.out.println("**** You checking account features **** " + 
				"\n Debit account number: " + debitCardNumber + 
				"\n Debit account pin: " + debitCardPin);
	}

}
