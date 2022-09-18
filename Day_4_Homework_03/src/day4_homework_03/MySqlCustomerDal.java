package day4_homework_03;

// Birden Fazla Interface i Inheritance Yapiyoruz
public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("My Sql Database Added");
	}
}