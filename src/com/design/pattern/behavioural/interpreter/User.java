package com.design.pattern.behavioural.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class User {

	private List<String> permissions;
	private String username;

	public User(String username, String... permissions) {
		this.permissions = new ArrayList<>();
		this.username = username;
		Stream.of(permissions).forEach(e -> this.permissions.add(e.toLowerCase()));
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "User [permissions=" + permissions + ", username=" + username + "]";
	}

}
