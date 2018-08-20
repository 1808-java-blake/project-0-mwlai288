package com.project0.screens;
import java.util.Scanner;
import org.apache.log4j.Logger;

import com.project0.beans.BankAccount;
import com.project0.beans.User;
import com.project0.daos.BankAccountDao;
import com.project0.util.AppState;

//
//import java.util.Scanner;
//
//import com.project0.beans.User;
//import com.project0.daos.UserDao;
//import com.project0.java.CurrentUser;
//
public class WithdrawScreen implements Screen {
	private AppState state = AppState.state;
	private Logger log = Logger.getRootLogger();
	private Scanner scan = new Scanner(System.in);
	private BankAccountDao ba = BankAccountDao.currentBankAccountDao;

	@Override
	public Screen start() {
		User currentUser = state.getCurrentUser();
		BankAccount currentAccount = new BankAccount();
		if (currentUser == null) {
			return new LoginScreen();
		}
		try {
//			
			int balance;
			currentAccount = ba.getBankAccount(currentUser.getId());
			state.getCurrentBankAccount();
			System.out.println(currentAccount);
			System.out.println(state.getCurrentBankAccount());
			System.out.println("How much would you like to withdraw?");
			System.out.println("Balance: " + currentAccount.getBalance());
			String withdrawAmount = scan.nextLine();
			if (Double.valueOf(withdrawAmount) > currentAccount.getBalance()) {
				System.out.println("You don't have the coin mate");
			} else {
				currentAccount.setTransactionHistory("-" + withdrawAmount);
				System.out.println(withdrawAmount + currentAccount.getBalance());
				System.out.println(balance = (-Integer.valueOf(withdrawAmount)) + currentAccount.getBalance());
				currentAccount.setBalance(balance);
				System.out.println(currentAccount.getBalance());
				ba.updateUser(currentAccount);
			}
//			
//			currentAccount.setTransactionHistory(currentAccount.getTransactionHistory() + ", " + depositAmount);
//			System.out.println(depositAmount + currentAccount.getBalance());
//			System.out.println(balance = Integer.valueOf(depositAmount) + currentAccount.getBalance());

		} catch (NumberFormatException e) {
			System.out.println("Invalid number");
		}

		return new HomeScreen();
	}

}
//
//	CurrentUser loggedInUser = new CurrentUser();
//	private Scanner scan = new Scanner(System.in);
//	private UserDao ud = UserDao.currentUserDao;
//
//	@Override
//	public Screen start() {

//		User currentUser = loggedInUser.getCurrent();
//		double balance;
//		System.out.println("How much would you like to withdraw?");
//		System.out.println("Balance: " + currentUser.getBalance());
//
//		String withdrawAmount = scan.nextLine();
//		if (Double.valueOf(withdrawAmount) > currentUser.getBalance()) {
//			System.out.println("You don't have the coin mate");
//		} else {
//			currentUser.setTransactionHistory("-" + withdrawAmount);
//			System.out.println(withdrawAmount + currentUser.getBalance());
//			System.out.println(balance = (-Double.valueOf(withdrawAmount)) + currentUser.getBalance());
//			currentUser.setBalance(balance);
//			ud.updateUser(currentUser);
//		}
//		return this;
//
//	}
//
//}