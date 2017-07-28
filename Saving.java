/**
 * Saving concrete class : subclass of BankingAccount
 * 
 * Methods: getAccountType() and getAccountBalance() from Account class
   depositAmount() withdrawAmount() from the superClass
 * @author Ali Bayati
 * @version 07262017
 *
 */
public class Saving extends BankingAccount  {
	
	public Saving(String type,double balance, double annualPercentageYield) {
		super(type);
		this.type=type;
		this.balance=balance;
		this.annualPercentageYield=annualPercentageYield;
	}

	
	
	@Override
	void depositAmount(double amonut) {
		balance+=amonut;
		
	}

	@Override
	void withdrawAmount(double amount) {
		if(balance>0)
			balance-=amount;
			else
			System.out.println("Insficent Funds !");
		
	}
	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public double getAccountBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}
