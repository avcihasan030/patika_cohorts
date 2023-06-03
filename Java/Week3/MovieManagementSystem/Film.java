package MovieManagementSystem;

public class Film {

    private String filmName;
    private double price;
    private boolean onSale;

    public Film(String filmName, double price) {
        this.filmName = filmName;
        this.price = price;
        this.onSale = true;
    }

    public String getName() {
        return filmName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setIsOnSale(boolean onSale) {
        this.onSale = onSale;
    }
}
