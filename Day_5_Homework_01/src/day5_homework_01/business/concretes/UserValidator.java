package day5_homework_01.business.concretes;

import java.util.regex.Pattern;

public class UserValidator {
	public static boolean NameValidator(String userFirstName,String userLastName) {
		if (userFirstName.length()>2 && userLastName.length()>2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean PasswordValidator(String password) {
		if (password.length()>=6) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean EmailValidator(String mail) {
		final Pattern EMAIL_REGEX = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", Pattern.CASE_INSENSITIVE);
		return EMAIL_REGEX.matcher(mail).matches();
	}
}