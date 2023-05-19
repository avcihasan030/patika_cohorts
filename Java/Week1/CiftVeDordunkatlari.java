import java.util.Scanner;

public class CiftVeDordunkatlari {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            short num;

            short total = 0;
            System.out.println("Sayi-lar giriniz: (cikis yapmak icin tek sayi giriniz)");

            while(true)
            {
                System.out.print("-> ");
                num = scan.nextShort();

                if(num%2 == 0 && num % 4 == 0)
                {
                    total += num;
                }

                if(num%2 != 0)
                    break;
            }
            System.out.println("Sum = " + total);
        }
    }
}
