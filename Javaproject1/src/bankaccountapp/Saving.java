package bankaccountapp;

public class Saving extends Account{

	//List properties specific to the saving account
	private int safetyDepositeBoxID ;
	private int safetyDepositBoxKey ;
	
	//Constructor to initialize settings to the saving account
	public Saving (String name,String sSN ,double initdeposit)
	{
		super(name,sSN,initdeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		
		
	}
	public void setRate()
	{
		rate = getBaseRate() - 0.25;
	}
	
	private void setSafetyDepositBox ()
	{
		safetyDepositeBoxID = (int)(Math.random() * Math.pow(10, 3));
		
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	//List any method specific to saving account 
	public void showInfo()
	{
		System.out.println("ACCOUNT TYPE - SAVING ACCOUT ");
		super.showInfo();
		System.out.println("\nYOUR SAVING ACCOUNT FEATURES\n "+ "SAFETY DEPOSITE BOX ID - " + safetyDepositeBoxID);
		System.out.println("SAFETY DEPOSITE BOX KEY - " + safetyDepositBoxKey);
	}
}
