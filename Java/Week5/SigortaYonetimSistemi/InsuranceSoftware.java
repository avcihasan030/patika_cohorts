package SigortaYonetimSistemi;

import java.sql.Date;

public class InsuranceSoftware {
    public static void main(String[] args) {
        // Create User
        User user = new User("Hasan", "Avci", "hasanavci@example.com", "password", "engineer", 22);
        Account individualAccount = new Individual(user);
        Account enterpriseAccount = new Enterprise(user);

        // create individual and enterprise accounts
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        // login
        String email = "hasanavci@example.com";
        String password = "password";
        Account loggedInAccount = accountManager.login(email, password);

        if (loggedInAccount != null) {
            System.out.println("Login successful!");

            // Display user info
            User loggedInUser = loggedInAccount.getUser();
            loggedInUser.showUserInfo();

            // Display user addresses
            loggedInUser.displayAddresses();

            // Add new address
            Address newAddress = new BusinessAddress("789 Street, New York City, USA");
            AddressManager.addAddress(loggedInUser, newAddress);

            // Remove addresss
            Address addressToRemove = new HomeAddress("123 Street,New York City,USA");
            AddressManager.removeAddress(loggedInUser, addressToRemove);
            loggedInUser.displayAddresses();

            // Add insurance
            Insurance healthInsurance = new HealthInsurance("Health Insurance", 100.0, new Date(0), new Date(0));
            loggedInAccount.addInsurance(healthInsurance);
            loggedInAccount.showInsuranceInfo();
        } else {
            System.out.println("Login failed!");
        }
    }
}
