import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayisini giriniz: ");
        short digits = scanner.nextShort();

        for (int i = digits; i >= 1; i--) {
            for (int j = 1; j <= digits-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
