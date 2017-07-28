
import java.util.*;
/**
 * AccountInfo class : concrete class 
 * this is the main class that has the AccountOwner class 
 * and the list for the all the accounts for that account owner 
 * 
 * @author Ali Bayati
 * @version 07262017
 *
 */
public class AccountInfo  {
 private String[] accountId = new String[1];
 private AccountOwner[] accountowner= new AccountOwner[1];
 private List<Account> accounts = new ArrayList<>();


 
 


public String getAccountId() {
	return accountId[0];
}

public AccountOwner getAccountowner() {
	return accountowner[0];
}

public List<Account> getAccounts() {
	return accounts;
}

public AccountInfo(String accountId, AccountOwner accountowner) {
	
	this.accountId[0] = accountId;
	this.accountowner[0] = accountowner;
	
}

public void addAccount(Account in){
	accounts.add(in);
}





}
