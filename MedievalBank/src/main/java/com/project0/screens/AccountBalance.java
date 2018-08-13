package com.project0.screens;

import java.util.Scanner;

import com.project0.beans.User;
import com.project0.daos.UserDao;
import com.project0.java.CurrentUser;

public class AccountBalance implements Screen {

	CurrentUser loggedInUser = new CurrentUser();
	private Scanner scan = new Scanner(System.in);
	private UserDao ud = UserDao.currentUserDao;

	@Override
	public Screen start() {
		User currentUser = loggedInUser.getCurrent();
		System.out.println("Thy current balance be: " + currentUser.getBalance());
		return this;

	}

}