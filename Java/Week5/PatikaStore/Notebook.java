package PatikaStore;

public class Notebook extends Product {
    private int ram;
    private String storage;
    private String screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand, int ram,
            String storage, String screenSize) {
        super(id, unitPrice, discountRate, stockAmount, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getProductTableRow() {
        return String.format("%-3s | %-25s | %-10s | %-10s | %-10s | %-10s | %-10s",
                getId(), getName(), getUnitPrice(), getBrand().getName(), getStorage(), getScreenSize(), getRam());
    }
}
