package day4_homework_04;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	// Is Katmani
	// Musteri Adi Girilme Durumu 
	// Dogru Girilme Kontrolu
	public void add() {
		customerDal.add();
	}
}