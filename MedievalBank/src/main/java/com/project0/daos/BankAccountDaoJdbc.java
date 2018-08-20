package com.project0.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.project0.beans.BankAccount;
import com.project0.util.ConnectionUtil;
import com.project0.beans.User;

public class BankAccountDaoJdbc implements BankAccountDao {
	private Logger log = Logger.getRootLogger();
	private ConnectionUtil cu = ConnectionUtil.cu;

	@Override
	public BankAccount getBankAccount(int id) {
		try (Connection conn = cu.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM account WHERE user_id=? ");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				BankAccount ba = new BankAccount();
				ba.setBalance(rs.getInt("balance"));
				ba.setTransactionHistory(rs.getString("transaction_history"));
				ba.setuserId(rs.getInt("user_id"));
				return ba;
			} else {
				log.warn("failed to find user with provided credentials from the db");
				return null;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int setBankAccount(BankAccount ba) {
		try (Connection conn = cu.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO account (balance, transaction_history, user_id) VALUES (?,?,?)",
					new String[] { "weapon_id" });
			ps.setInt(1, ba.getBalance());
			ps.setString(2, ba.getTransactionHistory());
			ps.setInt(3, ba.getuserId());
			int recordsCreated = ps.executeUpdate();
			log.trace(recordsCreated + " records created");

			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				log.trace("bank accouunt is" + rs.getInt("balance"));
				return rs.getInt("balance");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
			for (StackTraceElement ste : e.getStackTrace()) {
				log.error(ste);
			}
			log.warn("failed to create new account");
		}
		return 0;
	}

	@Override
	public List<BankAccount> findByUserId(int userId) {
		try (Connection conn = cu.getConnection()) {
			List<BankAccount> bankaccount = new ArrayList<>();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM bank_account WHERE user_id=?");
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BankAccount ba = new BankAccount();
				ba.setBalance(rs.getInt("balance"));
				ba.setuserId(rs.getInt("user_id"));
				ba.setTransactionHistory(rs.getString("transaction_history"));

				bankaccount.add(ba);
			}
			return bankaccount;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void updateUser(BankAccount ba) {
		try (Connection conn = cu.getConnection()) {
			PreparedStatement ps = conn
					.prepareStatement("UPDATE account SET balance = ?, transaction_history = ? WHERE user_id = ? ");
			ps.setInt(1, ba.getBalance());
			ps.setString(2, ba.getTransactionHistory());
			ps.setInt(3, ba.getuserId());
			int recordsCreated = ps.executeUpdate();
			log.trace(recordsCreated + " account updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
			for (StackTraceElement ste : e.getStackTrace()) {
				log.error(ste);
			}
			log.warn("failed to update user");
		}
		return;
	}

}
