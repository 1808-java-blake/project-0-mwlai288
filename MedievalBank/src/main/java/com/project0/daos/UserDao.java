package com.project0.daos;

import com.project0.beans.User;

public interface UserDao {

	public static final UserDao currentUserDao = new UserSerializer();

	void createUser(User u);

	User findByUsernameAndPassword(String username, String password);

	User findByUsername(String username);

	void updateUser(User u);

	void deleteUser(User u);

}