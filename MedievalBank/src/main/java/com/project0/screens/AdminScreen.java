package com.project0.screens;

import java.util.Scanner;

import com.project0.beans.BankAccount;
import com.project0.beans.User;
import com.project0.daos.BankAccountDao;
import com.project0.daos.UserDao;
import com.project0.util.AppState;

public class AdminScreen implements Screen {
	private Scanner scan = new Scanner(System.in);
	private UserDao ud = UserDao.currentUserDao;
	private BankAccountDao ba = BankAccountDao.currentBankAccountDao;
	private AppState state = AppState.state;
	User currentUser = state.getCurrentUser();
	BankAccount currentAccount = new BankAccount();

	public Screen start() {
		System.out.println(" \n"
				+ "███╗   ███╗███████╗██████╗ ██╗███████╗██╗   ██╗ █████╗ ██╗         ██████╗  █████╗ ███╗   ██╗██╗  ██╗\n"
				+ "████╗ ████║██╔════╝██╔══██╗██║██╔════╝██║   ██║██╔══██╗██║         ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝\n"
				+ "██╔████╔██║█████╗  ██║  ██║██║█████╗  ██║   ██║███████║██║         ██████╔╝███████║██╔██╗ ██║█████╔╝ \n"
				+ "██║╚██╔╝██║██╔══╝  ██║  ██║██║██╔══╝  ╚██╗ ██╔╝██╔══██║██║         ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗ \n"
				+ "██║ ╚═╝ ██║███████╗██████╔╝██║███████╗ ╚████╔╝ ██║  ██║███████╗    ██████╔╝██║  ██║██║ ╚████║██║  ██╗\n"
				+ "╚═╝     ╚═╝╚══════╝╚═════╝ ╚═╝╚══════╝  ╚═══╝  ╚═╝  ╚═╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝\n"
				+ "                                                                                                     \n"
				+ " ");
		String username = scan.nextLine();
		BankAccount adminView = ba.findByUsername(username);
		System.out.println(adminView);
//		currentAccount = ba.getBankAccount(currentUser.getId());
		state.getCurrentBankAccount();
		System.out.println("Adminstrator");
		System.out.println("Find a user by username and display balance and transaction history");
//		System.out.println(currentAccount.getBalance());
//		int viewUser = currentAccount.getBalance();
//		System.out.println("Balance is: " + user. + " and Transaction History is: " + user.getTransactionHistory());
		return this;
	}

}