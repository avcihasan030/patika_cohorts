package SigortaYonetimSistemi;

public class HomeAddress implements Address {

    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public void displayAddress() {
        System.out.println("Home Address: " + address);
    }

}
