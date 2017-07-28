/**
 * AccountOwner class : concrete class
 * this class holds the account owner personal information 
 * name and address
 * 
 * @author Ali Bayati
 * @version 07262017
 *
 */
public class AccountOwner {
String firstName;
String lastName;
String address;
public AccountOwner(String firstName, String lastName, String address) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
