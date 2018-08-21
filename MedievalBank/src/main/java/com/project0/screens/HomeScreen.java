package com.project0.screens;

import java.util.List;
import java.util.Scanner;

import com.project0.beans.BankAccount;
import com.project0.daos.BankAccountDao;
import com.project0.util.AppState;


public class HomeScreen implements Screen {
	private Scanner scan = new Scanner(System.in);
	private BankAccountDao ba = BankAccountDao.currentBankAccountDao;
	private AppState state = AppState.state;
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
		case "1":
			Screen ds = new DepositScreen();
			ds.start();
			break;

		case "2":
			Screen ws = new WithdrawScreen();
			ws.start();
			break;

		case "3":
			Screen th = new TransactionHistoryScreen();
			th.start();
			break;

		case "4":
			List<BankAccount> bankaccount = ba.findByUserId(state.getCurrentUser().getId());
			bankaccount.stream().forEach((each) -> {
				System.out.println(each);
			});
//			Screen ab = new AccountBalance();
//			ab.start();
//			break;
		default:
			break;
		}

		return this;

	}

}
