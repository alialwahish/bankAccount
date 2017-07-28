/**
 * Mortgage concrete class 
 * 
 * Methods: getAccountType() and getAccountBalance() from Account class
    applyPayment() getInitialAmount()getMonths() from the superClass
    
 * @author Ali Bayati
 * @version 07262017
 *
 */

public class Mortgage extends LoanAccount implements Account {

	private double initialAmount;
	private int Months;
	public Mortgage(String type,double initialAmount, int Months) {
		super(type);
		this.initialAmount = initialAmount;
		this.balance = initialAmount;
		this.Months = Months;
		this.type= AccountTyps.MORTGAGE;
	}
	
	
	
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}



	public void setMonths(int months) {
		Months = months;
	}



	@Override
	void applyPayment(double payment) {
		double intrst=payment*.0475;
		payment-=intrst;
		balance-=payment;
	}
	
	
	public double getInitialAmount() {
		return initialAmount;
	}

	@Override
	public String getAccountType() {
		return type;
	}

	@Override
	public double getAccountBalance() {
		return balance;
	}


	@Override
	public int getMonths() {
		return Months;
	}



	
	
	

}
