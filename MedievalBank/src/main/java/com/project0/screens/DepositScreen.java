package com.project0.screens;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.project0.beans.User;
import com.project0.beans.BankAccount;
import com.project0.daos.BankAccountDao;
import com.project0.util.AppState;

public class DepositScreen implements Screen {
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
			currentAccount = ba.getBankAccount(currentUser.getId());
			state.getCurrentBankAccount();
			System.out.println(currentAccount);
			System.out.println(state.getCurrentBankAccount());
			int balance;
			System.out.println("How much would you like to deposit?");
			System.out.println("Balance: " + currentAccount.getBalance());
			String depositAmount = scan.nextLine();
			currentAccount.setTransactionHistory( currentAccount.getTransactionHistory()+ ", " + depositAmount);
			System.out.println(depositAmount + currentAccount.getBalance());
			System.out.println(balance = Integer.valueOf(depositAmount) + currentAccount.getBalance());
			currentAccount.setBalance(balance);
			System.out.println(currentAccount.getBalance());
			ba.updateUser(currentAccount);
//			

		} catch (NumberFormatException e) {
			System.out.println("Invalid number");
		}

		return new HomeScreen();
	}

}