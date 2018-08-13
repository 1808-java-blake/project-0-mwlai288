package com.project0.screens;

import java.util.Scanner;

import com.project0.beans.User;
import com.project0.daos.UserDao;
import com.project0.java.CurrentUser;

public class LoginScreen implements Screen {
	private Scanner scan = new Scanner(System.in);
	private UserDao ud = UserDao.currentUserDao;
	public static User currentUser;
	
	CurrentUser loggedInUser = new CurrentUser();

	@Override
	public Screen start() {
		System.out.println("Enter Username or type Register to sign up: ");
		String username = scan.nextLine();
		if ("register".equalsIgnoreCase(username)) {
			return new RegisterUserScreen();
		}

		System.out.println("Enter Password: ");
		String password = scan.nextLine();

		User currentUser = ud.findByUsernameAndPassword(username, password);
		loggedInUser.current(currentUser);
		if (currentUser != null) {
			return new HomeScreen();
		}

		System.out.println("unable to login");
		return this;
	}

}
