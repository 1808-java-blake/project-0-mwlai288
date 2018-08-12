package com.project0.screens;

import java.util.Scanner;

public class HomeScreen implements Screen {
	private Scanner scan = new Scanner (System.in);
	
	public Screen start() {
		System.out.println("Welcome friend. What Wouldst Thou like to Dost?");
		System.out.println("Deposit coin");
		System.out.println("Withdraw coin");
		System.out.println("View Coin Amount");
		System.out.println("Transaction History");
		String selection = scan.nextLine();
		switch (selection) {
		case "1":
			System.out.println("selected 1 not yet implemented that screen");
			break;
		case "2":
			System.out.println("selected 2 not yet implemented that screen");
			break;
		case "3":
			System.out.println("selected 3 not yet implemented that screen");
			break;
		case "4":
			System.out.println("selected 4 not yet implemented that screen");
			break;
		default:
			break;
		}

		return this;
	}

}
