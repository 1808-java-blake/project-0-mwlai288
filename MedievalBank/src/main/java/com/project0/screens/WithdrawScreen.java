package com.project0.screens;

import java.util.Scanner;

import com.project0.beans.User;
import com.project0.daos.UserDao;
import com.project0.java.CurrentUser;

public class WithdrawScreen implements Screen {

	CurrentUser loggedInUser = new CurrentUser();
	private Scanner scan = new Scanner(System.in);
	private UserDao ud = UserDao.currentUserDao;

	@Override
	public Screen start() {
		User currentUser = loggedInUser.getCurrent();
		double balance;
		System.out.println("How much would you like to withdraw?");
		System.out.println("Balance: " + currentUser.getBalance());

		String withdrawAmount = scan.nextLine();
		if (Double.valueOf(withdrawAmount) > currentUser.getBalance()) {
			System.out.println("You don't have the coin mate");
		} else {
			currentUser.setTransactionHistory("-" + withdrawAmount);
			System.out.println(withdrawAmount + currentUser.getBalance());
			System.out.println(balance = (-Double.valueOf(withdrawAmount)) + currentUser.getBalance());
			currentUser.setBalance(balance);
			ud.updateUser(currentUser);
		}
		return this;

	}

}