package day5_homework_01.entities.concretes;

import day5_homework_01.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String nationalityId;
	private String userFirstName;
	private String userLastName;
	private String mail;
	private String password;
	
	public User() {
		
	}
	public User(int id,String nationalityId,String userFirstName,String userLastName,String mail,String password) {
		this.id = id;
		this.nationalityId = nationalityId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.mail = mail;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getEMail() {
		return mail;
	}
	public void setEMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}