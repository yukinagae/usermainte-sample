package usermainte.service;

import java.util.ArrayList;
import java.util.List;

import usermainte.entity.User;

public class UserService {

	public List<User> findAll() {
		List<User> users = new ArrayList<>();

		User user1 = new User(1L, "user1");
		User user2 = new User(2L, "user2");
		users.add(user1);
		users.add(user2);

		return users;
	}
}
