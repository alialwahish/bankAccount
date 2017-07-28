/**
 *LoanAcoount abstract class : implements Account 
 * this class is the super class for Mortgage class
 * 
 * @author Ali Bayati
 * @version 07262017
 *
 */
public abstract class LoanAccount implements Account{

	String type=getAccountType();
	double balance;
	double interestRate=4.75;
	
	
			
	
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


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public LoanAccount(String type) {
		
		this.type = getAccountType();
		
	}
	
		
	abstract void applyPayment( double payment);
	abstract double getInitialAmount();
	abstract int getMonths();
	
	
	}
	
	
	

