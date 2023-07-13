package SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surname;
    private String email;
    private String profession;
    private int age;
    private ArrayList<Address> addressList;
    private Date lastLoginDate;
    private String password;

    public User(String name, String surname, String email, String password, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        this.addressList = new ArrayList<>();
    }

    public void addAddress(Address address) {
        addressList.add(address);
    }

    public void removeAddress(Address address) {
        addressList.remove(address);
    }

    public void displayAddresses() {
        for (Address address : addressList) {
            address.displayAddress();
        }
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void showUserInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Email: " + this.email);
        System.out.println("Profession: " + this.profession);
        System.out.println("Age: " + this.age);
        System.out.println("Last Login Date: " + this.lastLoginDate);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getProfession() {
        return this.profession;
    }

    public int getAge() {
        return this.age;
    }

    public ArrayList<Address> getAddressList() {
        return this.addressList;
    }

    public Date getLastLoginDate() {
        return this.lastLoginDate;
    }

    public String getPassword() {
        return this.password;
    }

}
