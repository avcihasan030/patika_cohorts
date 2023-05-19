import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("N sayısını girin: ");
            int N = scan.nextInt();

            System.out.print("R sayısını girin: ");
            int R = scan.nextInt();

            int combination = calculateCombination(N, R);

            System.out.println("C(" + N + ", " + R + ") = " + combination);
        }
    }

    // iterative method
    public static int calculateCombination(int n, int r) {
        if (r > n - r) {
            r = n - r;
        }

        int combination = 1;
        for (int i = 1; i <= r; i++) {
            combination *= n - i + 1;
            combination /= i;
        }

        return combination;
    }

    // recursive method
    public static int calculateCombinationRec(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return calculateCombinationRec(n - 1, r - 1) + calculateCombinationRec(n - 1, r);
        }
    }
}
