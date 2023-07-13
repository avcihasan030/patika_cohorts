package SigortaYonetimSistemi;

public class BusinessAddress implements Address {
    private String address;

    public BusinessAddress(String address) {
        this.address = address;
    }

    @Override
    public void displayAddress() {
        System.out.println("Business Address: " + address);
    }

}
