import java.util.Scanner;

public class HarmonicNums {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            short n;

            System.out.print("Bir n sayisi giriniz: ");
            n = scan.nextShort();

            double sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += ((double)1 / i);
            }

            System.out.println("result = " + sum);
        }
    }

}
