package day5_homework_01.dataAccess.abstracts;

import java.util.List;

import day5_homework_01.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	
	User get(int id);
	List<User> getAll();
}