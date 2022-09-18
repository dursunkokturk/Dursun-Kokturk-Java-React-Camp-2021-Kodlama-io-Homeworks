package Entities;

import Abstracts.IEntity;

// Ilerleyen Asamalarda Nesneslik Ile Ilgili Sorun Olmamasi Icin
// Entity Interface ini Implement Etmek Gerekiyor
// Ayni Zamanda Database Objesi Oldugunu Gosteriyoruz
public class Customer implements IEntity {

    // Iki Sirketinde Musteri Bilgilerini Kaydetme Istegi Oldugundan
    // Gereken Ozellikleri Belirtmek Gerekiyor
    private int id;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private int birthDay;

    public Customer() {

    }

    public Customer(int id,String nationalityId,String firstName,String lastName,int birthDay) {
        this.id = id;
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getNationalityId(){
        return nationalityId;
    }
    public void setNationalityId(){
        this.nationalityId = nationalityId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public int getBirthDay(){
        return birthDay;
    }
    public void setBirthDay(){
        this.birthDay = birthDay;
    }
}