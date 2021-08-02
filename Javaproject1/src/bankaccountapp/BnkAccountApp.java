package bankaccountapp;
import java.util.LinkedList;
import java.util.List;
public class BnkAccountApp {
	
	public static void main(String args[])
	{
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\khush\\Downloads\\NewBankAccounts.csv";
		/*
		Checking chkacc1 = new Checking("KHUSHBU TIWARI" , "123456789",1500);
		
		Saving savacc1 = new Saving ("RAM LAKHAN ","123456789",2500);
		savacc1.compound();
		savacc1.showInfo();
		System.out.println("\n***************************\n");
		chkacc1.showInfo();
		*/
		
		//Read a csv file then create new account based on data
		
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolder)
		{
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if(accountType.equals("Saving"))
			{
				
				accounts.add(new Saving(name , sSN,initDeposit));
			}
			
			else if(accountType.equals("Checking"))
			{
				
				accounts.add(new Checking(name , sSN,initDeposit));
			}
			
			
		}
		
		for (Account acc : accounts)
		{
			System.out.println("\n********************************************");
			acc.showInfo();
		}
	}

}
