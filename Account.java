/**
 * Account interface
 * this interface is used in casting the the LaonAccount class
 * and the BankingAccount class so they can be added to the accountlist
 * in the AccountInfo class   
 * 
 * @author Ali Bayati
 * @version 07262017
 *
 */
public interface Account {
abstract String getAccountType();
abstract double getAccountBalance();

}
