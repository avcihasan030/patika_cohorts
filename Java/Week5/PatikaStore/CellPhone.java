package PatikaStore;

public class CellPhone extends Product {
    private String memory;
    private String screenSize;
    private double batteryPower;
    private int ram;
    private String color;

    public CellPhone(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand,
            String memory, String screenSize, double batteryPower, int ram, String color) {
        super(id, unitPrice, discountRate, stockAmount, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public String getProductTableRow() {
        return String.format("%-3s | %-25s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s",
                getId(), getName(), getUnitPrice(), getBrand().getName(), getMemory(), getScreenSize(), "-",
                getBatteryPower(), getRam(), getColor());
    }

}
