package PatikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {
    private List<Brand> brands;
    private List<Product> products;

    public PatikaStore() {
        brands = new ArrayList<>();
        products = new ArrayList<>();
        initializeBrands();

    }

    private void initializeBrands() {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

        Collections.sort(brands, Comparator.comparing(Brand::getName));

    }

    public void listBrands() {
        System.out.println("Our Brands");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
        System.out.println();
    }

    public void listProducts(String productType) {
        String productTypeName = getProductTypeName(productType);
        if (productTypeName == null) {
            System.out.println("Invalid type of product!");
            return;
        }

        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (productTypeName.equals("Cellphone") && product instanceof CellPhone) {
                filteredProducts.add(product);
            } else if (productTypeName.equals("Notebook") && product instanceof Notebook) {
                filteredProducts.add(product);
            }
        }
        if (filteredProducts.isEmpty()) {
            System.out.println(productTypeName + " is not found!");
        } else {
            System.out.println("List of " + productType + "s\n");
            System.out.println(getProductTableHeader(productTypeName));

            for (Product product : filteredProducts) {
                System.out.println(((CellPhone) product).getProductTableRow());
            }
        }
        System.out.println();
    }

    private String getProductTypeName(String productType) {
        switch (productType) {
            case "1":
                return "Notebook";
            case "2":
                return "Cellphone";
            default:
                return null;
        }
    }

    private String getProductTableHeader(String productTypeName) {
        if (productTypeName.equals("Cellphone")) {
            return String.format("%-3s | %-25s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s",
                    "ID", "Product Name", "Price", "Brand", "Memory", "Screen", "Camera", "Battery", "RAM", "Color");
        } else if (productTypeName.equals("Notebook")) {
            return String.format("%-3s | %-25s | %-10s | %-10s | %-10s | %-10s | %-10s",
                    "ID", "Product Name", "Price", "Brand", "Memory", "Screen", "RAM");
        } else {
            return "";
        }
    }

    public void addProduct(String productType, Scanner scanner) {
        String productTypeName = getProductTypeName(productType);
        if (productTypeName == null) {
            System.out.println("Invalid type of product!");
            return;
        }

        System.out.print("Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Unit Price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Discount rate: ");
        double discountRate = scanner.nextDouble();
        System.out.println("Stock Amount: ");
        int stockAmount = scanner.nextInt();
        scanner.nextLine();

        Brand brand = selectBrand(scanner);

        if (productTypeName.equals("Cellphone")) {
            System.out.print("Memory of Cellphone ( 128 GB, 64 GB): ");
            String memory = scanner.nextLine();
            System.out.print("Screen Size (eg. 6.1 inches): ");
            String screenSize = scanner.nextLine();
            System.out.print("Battery Power: ");
            double batteryPower = scanner.nextDouble();
            System.out.print("RAM: ");
            int ram = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();

            CellPhone cellPhone = new CellPhone(products.size() + 1, unitPrice, discountRate, stockAmount, productName,
                    brand, memory, screenSize, batteryPower, ram, color);
            products.add(cellPhone);
            System.out.println("Cellphone added successfully!");
        } else if (productTypeName.equals("Notebook")) {
            System.out.print("RAM: ");
            int ram = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Memory: ");
            String storage = scanner.nextLine();
            System.out.print("Screen Size (e.g. 17 inches): ");
            String screenSize = scanner.nextLine();

            Notebook notebook = new Notebook(products.size() + 1, unitPrice, discountRate, stockAmount, productName,
                    brand, ram, storage, screenSize);
        }
    }

    private Brand selectBrand(Scanner scanner) {
        System.out.println("Brands: ");
        System.out.println("--------------");
        int index = 1;
        for (Brand brand : brands) {
            System.out.println(index + ". " + brand.getName());
            index++;
        }

        int choice;
        do {
            System.out.println("Choose a brand (1-" + brands.size() + "): ");
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (choice < 1 || choice > brands.size());

        return brands.get(choice - 1);
    }

    public void removeProduct(String productId) {
        int id;
        try {
            id = Integer.parseInt(productId);
        } catch (NumberFormatException e) {
            System.out.println("Invalid product id!");
            return;
        }

        boolean removed = false;

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Product is not found!");
        }
    }

    public void filterProductsByBrand(String brandName) {
        System.out.println("Filtered Products\n");
        System.out.println(getProductTableHeader("Cellphone"));
        for (Product product : products) {
            if (product instanceof CellPhone && product.getBrand().getName().equalsIgnoreCase(brandName)) {
                System.out.println(((CellPhone) product).getProductTableRow());
            }
        }

        System.out.println(getProductTableHeader("Notebook"));
        for (Product product : products) {
            if (product instanceof Notebook && product.getBrand().getName().equalsIgnoreCase(brandName)) {
                System.out.println(((CellPhone) product).getProductTableRow());
            }
        }
        System.out.println();
    }
}
