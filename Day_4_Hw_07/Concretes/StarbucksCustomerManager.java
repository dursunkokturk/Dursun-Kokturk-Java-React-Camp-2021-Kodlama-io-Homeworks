package Concretes;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    // Bagimli Olunan Class i Gevsek Bagimliliga Cevirmek Gerekiyor
    ICustomerCheckService icustomerCheckServise;

    // CustomerCheckService Class i Uzerinden Girilen Musteri Bilgilerini
    // this Anahtar Kelimesini Kullanarak Dogrulama Islemi Yapiyoruz
    public StarbucksCustomerManager() {
        this.icustomerCheckServise = icustomerCheckServise;
    }

    @Override

    // Customer Class indan Gelen Data yi Kaydetmek Icin
    public void save(Customer customer) {
        if (ICustomerCheckService.checkIfRealPerson(customer)) {

            // Kayit Isleminin Gerceklestigini Belirten Mesaj Ve
            // Kaydedilen Data yi Yazdiriyoruz
            System.out.println("Saved in Database : " + customer.getFirstName());
        }
        else {
            System.out.println("Not A Valid Person");
        }
    }
}