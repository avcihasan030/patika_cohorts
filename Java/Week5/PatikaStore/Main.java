package PatikaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatikaStore store = new PatikaStore();

        while (true) {
            System.out.println("PatikaStore Product Management Board !");
            System.out.println("1 - Notebook Operations");
            System.out.println("2 - Cellphone Operations");
            System.out.println("3 - List Brands");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    store.listProducts("1");
                    performProductOperations(store, "1", scanner);
                    break;
                case "2":
                    store.listProducts("2");
                    performProductOperations(store, "2", scanner);
                    break;
                case "3":
                    store.listBrands();
                    break;
                case "0":
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }

    private static void performProductOperations(PatikaStore store, String productType, Scanner scanner) {
        System.out.println("1 - Add Product");
        System.out.println("2 - Remove Product");
        System.out.println("3 - Filter by Brand");
        System.out.println("0 - Return to Main Menu");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                store.addProduct(productType, scanner);
                break;
            case "2":
                System.out.print("Silmek istediğiniz ürünün numarasını girin: ");
                String productId = scanner.nextLine();
                store.removeProduct(productId);
                break;
            case "3":
                System.out.print("Filtrelemek istediğiniz markanın adını girin: ");
                String brandName = scanner.nextLine();
                store.filterProductsByBrand(brandName);
                break;
            case "0":
                break;
            default:
                System.out.println("Geçersiz seçim!");
                break;
        }
    }
}