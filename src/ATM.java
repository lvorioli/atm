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
	//		- validate that the account number and pin are valid
	//		- display a menu with available options
	//			+ deposit
	//			+ withdraw
	//			+ view balance
	//			+ exit
	//		- prompt the user to make a selection from the available menu options
	//		- respond accordingly to the user's selection
	//			+ this will involve calling methods of the BankAccount class
	
	public void interactATM() {
		in = new Scanner(System.in);
		if(validate() == true) {
			selection();
		}
		else {
			System.out.println("\nIncorrect Credentials\n");
			interactATM();
		}
			
	}
	private boolean validate() {
		System.out.print("Account number: ");
		long accountNumber = in.nextLong();
		System.out.print("\nPin: ");
		int pin = in.nextInt();
		if(accountNumber == account.getAccountNumber() && pin == account.getUser().getPIN()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private void selection() {
		System.out.print("\n\nDeposit(1)\nWithdraw(2)\nView balance(3)\nExit(4)\n\nMake a selection: ");
		int menuSelection = in.nextInt();
		if(menuSelection == 1) {
			depositMenu();
		}
		else if(menuSelection == 2) {
			withdrawMenu();
		}
		else if(menuSelection == 3) {
			viewBalanceMenu();
		}
		else if(menuSelection == 4) {
			
		}
		else {
			System.out.println("\nInvalid Selection");
		}
	}
	private void depositMenu() {
		int returnCode = 1;
		long depositAmount;
		System.out.print("\n\nDeposit Amount: ");
		do{
			if(returnCode == 0) {
				System.out.println("\nPlease enter a valid deposit amount: ");
			}
			depositAmount = in.nextLong();
			returnCode = account.deposit(depositAmount);
		}while(returnCode == 0);
			
		System.out.println("\n$" + depositAmount + " has been deposited.");
		System.out.print("\nMake another deposit(1)\nExit to menu screen(2)\n\nMake a selection: ");
		int menuSelection = in.nextInt();
		if(menuSelection == 1) {
			depositMenu();
		}
		else {
			selection();
		}
	}
	
	private void withdrawMenu() {
		int returnCode = 2;
		long withdrawAmount;
		System.out.print("\n\nWithdraw Amount: ");
		do{
			if(returnCode == 1) {
				System.out.println("\nPlease enter a valid withdraw amount: ");
			}
			else if(returnCode == 0) {
				System.out.println("\nWithdraw amount is too high: ");
			}
			withdrawAmount = in.nextLong();
			returnCode = account.withdraw(withdrawAmount);
		}while(returnCode != 2);
		
		System.out.println("\n$" + withdrawAmount + " has been withdrawn.");
		System.out.print("\nMake another withdraw(1)\nExit to menu screen(2)\n\nMake a selection: ");
		int menuSelection = in.nextInt();
		if(menuSelection == 1) {
			withdrawMenu();
		}
		else {
			selection();
		}
	}
	
	private void viewBalanceMenu() {
		System.out.println("\n\nBalance Amount: " + account.getBalance());
		System.out.print("\nExit to menu screen(2)\nMake a selection: ");
		int menuSelection = in.nextInt();
		selection();
	}
}