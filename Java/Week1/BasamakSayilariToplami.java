import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num,temp,total = 0;
            int rem;

            System.out.print("Bir sayi giriniz: ");
            num = scanner.nextInt();

            temp = num;
            while(temp != 0)
            {
                rem = temp%10;
                total += rem;
                temp = temp/10;
            }
            System.out.println("total = " + total);
        }
    }
   
}
