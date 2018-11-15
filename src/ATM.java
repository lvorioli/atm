import java.util.Scanner;

public class ATM {
	
	private Scanner in;
	private BankAccount account;
	
	/**
	 * Constructs an ATM class.
	 * 
	 * @param account the account to be linked
	 */
	
	public ATM(BankAccount account) {
		this.account = account;
	}

	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the active account.
	 * 
	 * @return account
	 */

	public BankAccount getAccount() {
		return account;
	}

	/**
	 * Sets the active account.
	 * 
	 * @param account the new account
	 */
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}

	/////////////////////////////////// INSTANCE METHODS ///////////////////////////////////

	// TODO
	
	// to complete the ATM class, you need to provide the following functionality:
	//
	// 		- prompt the user to enter an account number and pin
	//		- validate that the accounut number and pin are valid
	//		- display a menu with available options
	//			+ deposit
	//			+ withdraw
	//			+ view balance
	//			+ exit
	//		- prompt the user to make a selection from the available menu options
	//		- respond accordingly to the user's selection
	//			+ this will involve calling methods of the BankAccount class
}