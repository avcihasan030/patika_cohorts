import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int num;

            System.out.print("-> ");
            num = scan.nextInt();

            recPattern(num, num, -1);
        }
    }

    private static void recPattern(int num, int temp, int multp) {
        if (temp > num)
            return;

        if (temp <= 0)
            multp = multp * -1;

        System.out.print(" " + temp);
        recPattern(num, temp + 5 * multp, multp);
    }
}
