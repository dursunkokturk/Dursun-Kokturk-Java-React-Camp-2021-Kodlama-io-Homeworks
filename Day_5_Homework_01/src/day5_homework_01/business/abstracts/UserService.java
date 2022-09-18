package day5_homework_01.business.abstracts;

import java.util.List;

import day5_homework_01.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(User user);
	//void userSave(User user);
	
	List<User> getAll();
}