package day5_homework_01;

import day5_homework_01.business.concretes.UserManager;
import day5_homework_01.core.JGoogleManagerAdapter;
import day5_homework_01.dataAccess.concretes.HibernateUserDao;
import day5_homework_01.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userService = new UserManager(new HibernateUserDao(),new JGoogleManagerAdapter());
		User user = new User(1,"98765432123","Dursun","Köktürk","dk@gmail.com","1234567");
		
		userService.add(user);
		userService.login(user);
	}
}