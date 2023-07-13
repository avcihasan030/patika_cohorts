package SigortaYonetimSistemi;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accountList;

    public AccountManager() {
        this.accountList = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public Account login(String email, String password) {
        for (Account account : accountList) {
            try {
                account.login(email, password);
                return account;
            } catch (InvalidAuthenticationException e) {
                e.getMessage();
            }
        }
        return null;
    }

}
