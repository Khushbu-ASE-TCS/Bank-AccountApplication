package bankaccountapp;

public class Checking extends Account {

	//List the properties specific to check account
	private int debitCardNumber ;
	private int debitCardPIN ;
	
	
	// constructor to initialize checking account properties
	public Checking (String name,String sSN ,double initDeposit)
	{
		super(name,sSN , initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
	}
	
	public void setRate()
	{
		rate = getBaseRate() * 0.15;
	}
	
	private void setDebitCard()
	{
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		
		 debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
	}
	public void showInfo()
	{
		System.out.println("ACCOUNT TYPE - CHECKING ACCOUT ");
		super.showInfo();
		System.out.println("\nYOUR SAVING ACCOUNT FEATURES\n "+ "DEBIT CARD NUMBER - " + debitCardNumber);
		System.out.println("YOUR DEBIT CARD PIN  - " +  debitCardPIN);
		
	}
   
	//List any method specific to checking account
}
