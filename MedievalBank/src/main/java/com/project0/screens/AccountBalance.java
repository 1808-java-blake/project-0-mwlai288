package com.project0.screens;


import com.project0.beans.BankAccount;
import com.project0.beans.User;
import com.project0.daos.BankAccountDao;
import com.project0.util.AppState;


public class AccountBalance implements Screen {
	private AppState state = AppState.state;
	private BankAccountDao ba = BankAccountDao.currentBankAccountDao;

	@Override
	public Screen start() {
		User currentUser = state.getCurrentUser();
		BankAccount currentAccount = new BankAccount();
		currentAccount = ba.getBankAccount(currentUser.getId());
		state.getCurrentBankAccount();
		System.out.println("Thy current balance be: " + currentAccount.getBalance());
		return this;

	}

}