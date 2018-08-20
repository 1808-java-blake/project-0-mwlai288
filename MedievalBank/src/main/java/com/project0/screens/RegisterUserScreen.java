package com.project0.screens;

import java.util.Scanner;

import com.project0.beans.User;
import com.project0.daos.BankAccountDaoJdbc;
import com.project0.daos.UserDao;

public class RegisterUserScreen implements Screen {
	private Scanner scan = new Scanner(System.in);
	private UserDao ud = UserDao.currentUserDao;

	private BankAccountDaoJdbc ba = new BankAccountDaoJdbc();
	@Override
	public Screen start() {
		User u = new User();
		System.out.println("Enter new username");
		u.setUsername(scan.nextLine());
		System.out.println("Enter password");
		u.setPassword(scan.nextLine());
		System.out.println("Enter first name");
		u.setFirstName(scan.nextLine());
		System.out.println("Enter last name");
		u.setLastName(scan.nextLine());
		
		ud.createUser(u);
		u = ud.findByUsernameAndPassword(u.getUsername(), u.getPassword());
		ba.createBankAccount(u.getId());
		
		return new LoginScreen();
	}

}
