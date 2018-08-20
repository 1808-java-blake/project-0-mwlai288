package com.project0.util;

import com.project0.beans.BankAccount;
import com.project0.beans.User;

public class AppState {
	
	public static final AppState state = new AppState();
	private User currentUser;
	private BankAccount currentBankAccount;

	private AppState() {

	}

	public User getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	public BankAccount getCurrentBankAccount() {
		return currentBankAccount;
	}
	
	public void setCurrentBankAccount(BankAccount currentBankAccount) {
		this.currentBankAccount = currentBankAccount;
	}

}
