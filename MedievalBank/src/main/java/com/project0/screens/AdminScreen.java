//package com.project0.screens;
//
//import java.util.Scanner;
//
//import com.project0.beans.User;
//import com.project0.daos.UserDao;
//
//public class AdminScreen implements Screen {
//	private Scanner scan = new Scanner(System.in);
//	private UserDao ud = UserDao.currentUserDao;
//	private User user;
//
//	public Screen start() {
//		System.out.println(" \n"
//				+ "███╗   ███╗███████╗██████╗ ██╗███████╗██╗   ██╗ █████╗ ██╗         ██████╗  █████╗ ███╗   ██╗██╗  ██╗\n"
//				+ "████╗ ████║██╔════╝██╔══██╗██║██╔════╝██║   ██║██╔══██╗██║         ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝\n"
//				+ "██╔████╔██║█████╗  ██║  ██║██║█████╗  ██║   ██║███████║██║         ██████╔╝███████║██╔██╗ ██║█████╔╝ \n"
//				+ "██║╚██╔╝██║██╔══╝  ██║  ██║██║██╔══╝  ╚██╗ ██╔╝██╔══██║██║         ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗ \n"
//				+ "██║ ╚═╝ ██║███████╗██████╔╝██║███████╗ ╚████╔╝ ██║  ██║███████╗    ██████╔╝██║  ██║██║ ╚████║██║  ██╗\n"
//				+ "╚═╝     ╚═╝╚══════╝╚═════╝ ╚═╝╚══════╝  ╚═══╝  ╚═╝  ╚═╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝\n"
//				+ "                                                                                                     \n"
//				+ " ");
//		
//		System.out.println("Adminstrator");
//		System.out.println("Find a user by username and display balance and transaction history");
//		String username = scan.nextLine();
//		user = ud.findByUsername(username);
//		System.out.println("Balance is: " + user.getBalance() + " and Transaction History is: " + user.getTransactionHistory());
//		return this;
//	}
//
//}