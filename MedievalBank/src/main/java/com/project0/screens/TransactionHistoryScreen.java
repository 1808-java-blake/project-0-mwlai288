package com.project0.screens;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.project0.beans.BankAccount;
import com.project0.beans.User;
import com.project0.daos.BankAccountDao;
import com.project0.daos.UserDao;
import com.project0.java.CurrentUser;
import com.project0.util.AppState;

public class TransactionHistoryScreen implements Screen {
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
		currentAccount = ba.getBankAccount(currentUser.getId());
		state.getCurrentBankAccount();
		System.out.println("Past dealings");
		System.out
				.println("Deposit and Withdrawals: " + currentAccount.getTransactionHistory().replaceAll("null,", ""));

		return this;

	}

}