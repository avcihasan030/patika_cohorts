import java.util.Scanner;

public class UcVeDordeTamBolunenOrtalama {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Bir sayı girin: ");
            int N = scan.nextInt();

            int sum = 0;
            int count = 0;

            for (int i = 0; i <= N; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    sum += i;
                    count++;
                }
            }

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Ortalama = " + average);
            } else {
                System.out.println("Hem 3'e hem de 4'e bölünebilen bir sayı bulunamadı.");
            }
        }
    }
}