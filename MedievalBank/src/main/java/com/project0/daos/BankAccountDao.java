package com.project0.daos;

import java.util.List;

import com.project0.beans.BankAccount;
import com.project0.beans.User;

public interface BankAccountDao {
	public static final BankAccountDao currentBankAccountDao = new BankAccountDaoJdbc();

	BankAccount getBankAccount(int id);

	void createBankAccount(int banana);
	
	int setBankAccount(BankAccount ba);

	void updateUser(BankAccount ba);

	List<BankAccount> findByUserId(int userId);
	
	BankAccount findByUsername(String username);

}
