import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            short num;

            System.out.print("Bir sayi giriniz: ");
            num = scan.nextShort();

            if(isPerfect(num)){
                System.out.println(num+" mukemmel bir sayidir.");
            }else System.out.println(num+" mukemmel bir sayi degildir.");
        }
    }

    private static boolean isPerfect(short num){
        if( num == 1){
            return false;
        }

        short total = 0;

        for (int i = 1; i <=  num/2; i++) {
            if(num%i == 0)
                total += i;
        }

        if(total == num)
            return true;
        else 
            return false;
    }
}