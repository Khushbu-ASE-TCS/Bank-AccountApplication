package bankaccountapp;

public abstract class Account implements IBaseRate 
{

	//List common properties for saving and checking accounts
	private String name ;
	private String sSN;
	private double Balance ;
	protected String accountNumber ;
	protected double rate ;
	private static int index = 10000;
	
	
	//Constructor to set base properties and initialize the account
	public Account(String name,String sSN , double initDeposit)
	{
		this.name=name ;
		this.sSN = sSN;
		Balance = initDeposit;
		
		
		index++;
		// Set account number 
		this.accountNumber = setAccountNumber();
		
	
		setRate();
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber()
	{
		String LastTwoSSN = sSN.substring(sSN.length()-2,sSN.length()) ;
		int uniqueID = index;
		int randomNumber = (int)( Math.random() * Math.pow(10 ,  3));
		return  LastTwoSSN + uniqueID + randomNumber;
		
	}
	
	public void compound ()
	{
		
		double accuredInterest = Balance * (rate/100); 
		Balance = Balance + accuredInterest;
		System.out.println("ACCURED INTERSET: Rs"+ accuredInterest );
		printBalance();
	}
	//List common method - transaction
	
	public void deposite(int amount)
	{
		Balance = Balance + amount;
		System.out.println("DEPOSITING Rs "+ amount );
		printBalance();
	}
	
	public void withdraw(int amount)
	{

		Balance = Balance - amount;
		System.out.println("WITHDRAWING Rs "+ amount );
		printBalance();
	}
	public void transfer(String toWhere , double amount)
	{
		Balance = Balance - amount;
		System.out.println("TRANSFERRING Rs "+ amount + " TO "+ toWhere);
		printBalance();
	}
	
	public void printBalance()
	{
		System.out.println("YOUR BALANCE IS Rs "+ Balance);
	}
	public void showInfo()
	{
		System.out.println(
				"NAME :" + name +
				"\nACCOUNT NUMBER :" + accountNumber +
				"\nBALANCE : " + Balance +
				"\nRATE : " + rate + "%" 
				);
	}
}
