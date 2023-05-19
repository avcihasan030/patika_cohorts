//recursive metot kullanarak üslü  sayı hesaplayan java program kodu
import java.util.Scanner;

public class RecExp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int base, exponent; // define base and exponent variables

            // ask user for input
            System.out.print("Input base number: ");
            base = scanner.nextInt();
            System.out.print("Input exponent: ");
            exponent = scanner.nextInt();

            // display result on the screen
            System.out.println("result = " + recexp(base, exponent));
        }
    }

    // method finds exponential number using recursion
    private static int recexp(int base, int exp) {
        if (exp == 0)
            return 1;

        return recexp(base, exp - 1) * base;
    }

}
