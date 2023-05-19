import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
        n2 = scanner.nextInt();

        System.out.println("gcd = " + gcd(n1, n2));
        lcm(n1, n2);

    }

    private static int gcd(int n1, int n2) {// greatest common divisor
        int i = smallerNumber(n1, n2);
        int greatest_common_divisor = i;

        while (i >= 0) {
            if (n1 % i == 0 && n2 % i == 0) {
                greatest_common_divisor = i;
                break;
            }
            i--;
        }
        return greatest_common_divisor;
    }

    private static int smallerNumber(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    private static void lcm(int n1, int n2) { // least common multiple
        int lest_common_multiple = (n1 * n2) / gcd(n1, n2);
        System.out.println("least common multiple = " + lest_common_multiple);
    }
}
