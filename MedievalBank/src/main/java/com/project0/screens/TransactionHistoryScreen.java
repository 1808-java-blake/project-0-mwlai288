//package com.project0.screens;
//
//import java.util.Scanner;
//
//import com.project0.beans.User;
//import com.project0.daos.UserDao;
//import com.project0.java.CurrentUser;
//
//public class TransactionHistoryScreen implements Screen {
//
//	CurrentUser loggedInUser = new CurrentUser();
//	private Scanner scan = new Scanner(System.in);
//	private UserDao ud = UserDao.currentUserDao;
//
//	@Override
//	public Screen start() {
//		User currentUser = loggedInUser.getCurrent();
//		System.out.println("View transaction history");
//		System.out.println("Deposit and Withdrawals: " + currentUser.getTransactionHistory().replaceAll("null,", ""));
//	
//		return this;
//
//	}
//
//}