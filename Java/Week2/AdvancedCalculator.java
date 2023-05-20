import java.util.Scanner;

public class AdvancedCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int select;
        String menu = "\n1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü sayı hesaplama\n"
                + "6- Faktöriyel hesaplama\n"
                + "7- Mod alma\n"
                + "8- Dikdörtgen Alan ve çevre hesabı\n"
                + "0- Çıkış yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangularPerimeterAndArea();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrary deneyiniz.");
                    break;
            }
        } while (select != 0);
    }

    private static void plus() {
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    private static void minus() {
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void times() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scanner.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void power() {
        System.out.print("Taban değeri giriniz :");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void factorial() {
        System.out.print("Sayı giriniz :");
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void divided() {
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void mod() {
        int number, modula;
        System.out.print("Modu alınacak olan sayıyı girin: ");
        number = scanner.nextInt();
        System.out.print("Mod değerini girin: ");
        modula = scanner.nextInt();

        int result = number % modula;
        System.out.println(number + " mod " + modula + " = " + result);

    }

    private static void rectangularPerimeterAndArea() {
        int short_side, long_side, area, perimeter;

        System.out.println("Dikdörtgenin uzun ve kısa kenarlarını giriniz: ");
        System.out.print("uzun kenar-> ");
        long_side = scanner.nextInt();
        System.out.print("kısa kenar-> ");
        short_side = scanner.nextInt();

        area = long_side * short_side;
        perimeter = 2 * (long_side + short_side);

        System.out.println("\nAlan = " + area);
        System.out.println("Çevre = " + perimeter);
    }

}
