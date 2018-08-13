package com.project0.java;

import com.project0.beans.User;

public class CurrentUser {

	private static User current;

	public void current(User ud) {
		CurrentUser.current = ud;
	}

	public User getCurrent() {
		return CurrentUser.current;
	}
}
