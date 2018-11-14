import java.util.Scanner;

public class ATM {
	
	private Scanner in;
	private BankAccount account;
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		ATM atm = new ATM(new BankAccount(0, new User(1234, "Ryan Wilson", "January 1, 1970", "123 Main St., Scotch Plains, NJ 07076")));
	}
	
	/**
	 * Constructs an ATM class.
	 * 
	 * @param account
	 */
	
	public ATM(BankAccount account) {
		this.account = account;
	}

	// TODO
}