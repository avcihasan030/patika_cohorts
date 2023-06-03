package MovieManagementSystem;

public class Film {

    private String filmName;
    private double priceOfBuying;
    private double priceOfHiring;
    private boolean onSale;

    public Film(String filmName, double priceOfBuying, double priceOfHiring) {
        this.filmName = filmName;
        this.priceOfBuying = priceOfBuying;
        this.priceOfHiring = priceOfHiring;
        this.onSale = true;
    }

    public String getName() {
        return this.filmName;
    }

    public double getPriceOfBuying() {
        return this.priceOfBuying;
    }

    public double getPriceOfHiring() {
        return this.priceOfHiring;
    }

    public boolean isOnSale() {
        return this.onSale;
    }

    public void setIsOnSale(boolean onSale) {
        this.onSale = onSale;
    }
}
