/**
 * BankingAccount concrete class 
 * 
 * Methods: getAccountType() and getAccountBalance() from Account class
   applyPayment() getInitialAmount()getMonths() from the superClass
    
 * @author Ali Bayati
 * @version 07262017
 *
 */
public abstract class BankingAccount implements Account  {
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	String type=getAccountType();
	double balance;
	double annualPercentageYield;
	
		
	public BankingAccount(String type){
		
	}
		
	
	public double getAnnualPercentageYield() {
		return annualPercentageYield;
	}
	public void setAnnualPercentageYield(double annualPercentageYield) {
		this.annualPercentageYield = annualPercentageYield;
	}
	
	
	abstract void depositAmount(double amonut);
	abstract void withdrawAmount(double amount);
		
}
