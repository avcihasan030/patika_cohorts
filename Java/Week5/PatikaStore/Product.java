package PatikaStore;

public abstract class Product {
    private int id;
    private double unitPrice;
    private double discountRate;
    private int stockAmount;
    private String name;
    private Brand brand;

    public Product(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }
}
