package com.project0.beans;

public class BankAccount {
	private int balance;
	private int userId;
	private String transactionHistory;

	public BankAccount() {

		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int balance, int userId, String transactionHistory) {
		super();
		this.balance = balance;
		this.userId = userId;
		this.transactionHistory = transactionHistory;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	public String getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(String transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result + balance;
		result = prime * result + ((transactionHistory == null) ? 0 : transactionHistory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (userId != other.userId)
			return false;
		if (balance != other.balance)
			return false;
		if (transactionHistory == null) {
			if (other.transactionHistory != null)
				return false;
		} else if (!transactionHistory.equals(other.transactionHistory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", userId=" + userId + ", transactionHistory="
				+ transactionHistory + "]";
	}

}
