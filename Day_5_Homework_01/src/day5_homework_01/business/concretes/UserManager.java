package day5_homework_01.business.concretes;

import java.util.List;
import java.util.Scanner;

import day5_homework_01.business.abstracts.UserService;
import day5_homework_01.core.GoogleService;
import day5_homework_01.dataAccess.abstracts.UserDao;
import day5_homework_01.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao,GoogleService googleService) {
		this.userDao = userDao;
		this.googleService = googleService;
	}
	
	@Override
	public void add(User user) {
		if(UserValidator.NameValidator(user.getUserFirstName(),user.getUserLastName()) && 
				UserValidator.EmailValidator(user.getEMail()) && 
				UserValidator.PasswordValidator(user.getPassword())) {
			System.out.println("Saved To Person : " +user.getUserFirstName() +" "+user.getUserLastName());
		}
		else {
			System.out.println("Not Saved To Person");
		}
		this.userDao.add(user);
	}
	@Override
	public void login(User user) {
		
		System.out.println("Please Enter Your Email And Password");
		
		Scanner input = new Scanner(System.in);
	    String email,password;
	    
	    System.out.println("Enter Email : ");
	    email = input.nextLine();
	    
	    System.out.println("Enter Password : ");
	    password = input.nextLine();
	    
	    System.out.println("Email : " + email);
	    System.out.println("Password : " + password);
		
		if (user.getEMail() == email && user.getPassword() == password) {
			System.out.println("Your Infos True");
			return;
		}
		else if (user.getEMail() != email && user.getPassword() != password){
			System.out.println("Please Check Your Email And Password");
		}
		else {
			System.out.println("Please Check Infos");
		}
	}

	@Override
	public List<User> getAll() {
		return null;
	}
}