package bankAccountApp;

public class Savings extends Account{
	// List the properties specific for a savings account
	private double safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Call the constructor to initialize settings savings account
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		
		setSafetyDeposityBox();
		setSafetyDepositBoxKey();
		setRate();
	
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	// List any method specific to the savings account
	private void setSafetyDeposityBox() {
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
	}
	
	private void setSafetyDepositBoxKey() {
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo() {	
		System.out.println("Account type: Savings");
		super.showInfo();
		System.out.println("**** You savings account features **** " + 
							"\n Safety deposit box ID: " + safetyDepositBoxID + 
							"\n Safety deposit box Key: " + safetyDepositBoxKey);
	}	
	
}
