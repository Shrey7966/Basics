package com.quicklearn.demo.First.Spring.project.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.quicklearn.demo.First.Spring.project.users.User;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static int userId;

	static {
		users.add(new User(userId++, "Shrey", LocalDate.now().minusYears(30)));
		users.add(new User(userId++, "Khushi", LocalDate.now().minusYears(26)));
		users.add(new User(userId++, "Gahan", LocalDate.now().minusYears(2)));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId() == id;
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public User saveUser(User user) {
		user.setId(userId++);
		users.add(user);
		return user;
	}

	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId() == id;
		users.removeIf(predicate);
	}

}
