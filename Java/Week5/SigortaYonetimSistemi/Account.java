package SigortaYonetimSistemi;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    protected enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    protected AuthenticationStatus authenticationStatus;
    protected User user;
    protected ArrayList<Insurance> insurances;

    public Account(User user) {
        this.authenticationStatus = AuthenticationStatus.FAIL;
        this.user = user;
        this.insurances = new ArrayList<>();
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException();
        }
    }

    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }

    public abstract void showInsuranceInfo();

    public AuthenticationStatus getAuthenticationStatus() {
        return this.authenticationStatus;
    }

    public User getUser() {
        return this.user;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((authenticationStatus == null) ? 0 : authenticationStatus.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        result = prime * result + ((insurances == null) ? 0 : insurances.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (authenticationStatus != other.authenticationStatus)
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        if (insurances == null) {
            if (other.insurances != null)
                return false;
        } else if (!insurances.equals(other.insurances))
            return false;
        return true;
    }

    @Override
    public int compareTo(Account o) {

        return user.getSurname().compareTo(o.getUser().getSurname());
    }

    public final void showUserInfo() {
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Profession: " + user.getProfession());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());
        System.out.println("Addresses: " + user.getAddressList());
    }
}
