//package com.project0.screens;
//
//import java.util.Scanner;
//
//import com.project0.beans.User;
//import com.project0.daos.UserDao;
//import com.project0.java.CurrentUser;
//
//public class DepositScreen implements Screen {
//
//	CurrentUser loggedInUser = new CurrentUser();
//	private Scanner scan = new Scanner(System.in);
//	private UserDao ud = UserDao.currentUserDao;
//
//	@Override
//	public Screen start() {
//		User currentUser = loggedInUser.getCurrent();
//		double balance;
//		System.out.println("How much would you like to deposit?");
//		System.out.println("Balance: " + currentUser.getBalance());
//		String depositAmount = scan.nextLine();
//		currentUser.setTransactionHistory(depositAmount);
//		
////		System.out.println(depositAmount + currentUser.getBalance());
//		System.out.println(balance = Double.valueOf(depositAmount) + currentUser.getBalance());
//		currentUser.setBalance(balance);
//		ud.updateUser(currentUser);
//		return this;
//
//	}
//
//}