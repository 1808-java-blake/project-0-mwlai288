package com.project0.screens;

import java.util.Scanner;

import com.project0.util.AppState;

public class HomeScreen implements Screen {
	private AppState state = AppState.state;
	private Scanner scan = new Scanner(System.in);

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
		System.out.println("Welcome friend. What wouldst thou like to dost?");
		System.out.println("Enter 1 to deposit coin");
		System.out.println("Enter 2 to withdraw coin");
		System.out.println("Enter 3 to view transaction history");
		System.out.println("Enter 4 to view account balance");
		String selection = scan.nextLine();
		switch (selection) {
//		case "1":
//			Screen ds = new DepositScreen();
//			ds.start();
//			break;

//		case "2":
//			Screen ws = new WithdrawScreen();
//			ws.start();
//			break;
//
//		case "3":
//			Screen th = new TransactionHistoryScreen();
//			th.start();
//			break;
//
//		case "4":
//			Screen ab = new AccountBalance();
//			ab.start();
//			break;
		default:
			break;
		}

		return this;

	}

}
