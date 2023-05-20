import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num;

            System.out.print("-> ");
            num = scanner.nextInt();

            String s = isPalindrome(num) ? "Palidrome" : "Not palindrome";

            System.out.println(s);
        }

    }

    private static boolean isPalindrome(int num) {
        int temp = num, total = 0, rem;

        while (num > 0) {
            rem = num % 10;
            total = total * 10 + rem;
            num = num / 10;
        }

        return (temp == total) ? true : false;
    }
}
