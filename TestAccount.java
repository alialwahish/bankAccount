import java.text.DecimalFormat;
/**
 * TestAccount concrete class : testing all class
 * 
 * initialing from every constructor possible
 * methods being tested in this class  
 * 
 * addAcount/getAccountType/getAccountBalance/deposit-withdrawAmount/applyPayments
 * @author Ali Bayati
 * @version 07262017
 *
 */
public class TestAccount {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("$#,###.00");
						
		AccountOwner ac1= new AccountOwner("Ali", "Bayati", "171 waters edge \nGlendale heights , il 60139");
		BankingAccount sav = new Saving(AccountTyps.SAVING, 2250.00, 0.5);
		Checking chk= new Checking(AccountTyps.CHECKING, 874.41, 0.75);
		LoanAccount lon= new Mortgage(AccountTyps.MORTGAGE, 50000, 120);
		AccountInfo ai= new AccountInfo("444", ac1);
		ai.addAccount(chk);
		ai.addAccount(sav);
		ai.addAccount(lon);
		
		// deposit $100 in checking
		chk.depositAmount(100);
		// deposit $500 in saving
		((BankingAccount)ai.getAccounts().get(ai.getAccounts().indexOf(sav))).depositAmount(500);
		//making 10 payment of $500 towards the loan 
		lon.applyPayment(5000);
		// withdraw $250 from Checking 
		((BankingAccount)ai.getAccounts().get(ai.getAccounts().indexOf(chk))).withdrawAmount(250);
		// withdraw $150 from saving
		sav.withdrawAmount(150);
		// using one of the getters and setters to set the checking balance to $840.66
		chk.setBalance(840.66);
		
		System.out.println(ai.getAccountowner().getFirstName()+" "+
						   ai.getAccountowner().getLastName());
		System.out.println(ai.getAccountowner().getAddress());
		System.out.println("_________________________________________\n");
		System.out.println("BANKING            Balance  APY ");
		System.out.println("_________________________________________\n"); 
		double bnkBlnc=0;
		int i= 0;
		
		
		//using on loop to show all AccountInfo ai accounts .
		
		
		for(Account disp:ai.getAccounts())
		{
			i++;
			if(!disp.getClass().getName().equals("Mortgage"))
			{
				System.out.print(disp.getAccountType()+"           ");
				 
				 System.out.println(df.format(disp.getAccountBalance())+"  "+
						 			((BankingAccount)disp).getAnnualPercentageYield());
				 bnkBlnc+=disp.getAccountBalance();
							
			}
			
			if(i==ai.getAccounts().size()){
				System.out.println("_________________________________________\n");
				 System.out.println("Banking Balance:    "+df.format(bnkBlnc));	
				 System.out.println("_________________________________________");
				 System.out.println("\n\n");
				 System.out.println("_____________________________________________________________________");
				 System.out.println();
				
			int loanIndx = ai.getAccounts().indexOf(lon);
			 disp=(Account)(ai.getAccounts().get(loanIndx));
			System.out.println("LOAN            Balance   Loan Amount  Rate  Term(mos.) ");
			 System.out.println("_____________________________________________________________________\n");
			 System.out.print(disp.getAccountType()+"       "
					 			+ df.format(disp.getAccountBalance())+"  "+
					 			df.format(((LoanAccount)disp).getInitialAmount())+"  "+
					 			((LoanAccount)disp).getInterestRate()+"     "+
					 			((LoanAccount)disp).getMonths());	
			 System.out.println("\n_____________________________________________________________________");
			
			 System.out.println("Loan Balance:  ("+df.format(((LoanAccount)disp).getAccountBalance())+")");
			}
			}	
		 
		
		 
		}

}
/*Output
Ali Bayati
171 waters edge 
Glendale heights , il 60139
_________________________________________

BANKING            Balance  APY 
_________________________________________

Checking           $724.41  0.75
Saving           $2,600.00  0.5
_________________________________________

Banking Balance:    $3,324.41
_________________________________________



_____________________________________________________________________


 LOAN           Balance   Loan Amount  Rate  Term(mos.) 
_____________________________________________________________________


Mortgage       $45,237.50  $50,000.00  4.75     120
_____________________________________________________________________
Loan Balance:  ($45,237.50)

 */
