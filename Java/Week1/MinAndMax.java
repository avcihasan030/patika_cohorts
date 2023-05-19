import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short min = Short.MAX_VALUE;
        short max = Short.MIN_VALUE;

        findMinAndMax(scan, min, max);
    }

    private static void findMinAndMax(Scanner scan, short min, short max) {
        byte N;
        short number;
        System.out.print("Kac adet sayi gireceksiniz? : ");
        N = scan.nextByte();
        
        for (int i = 1; i <= N; i++) {
            System.out.print(i+". sayiyi girin: ");
            number = scan.nextShort();
            if(number > max){
                max = number;
            }

            if(number < min){
                min = number;
            }
        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }
    
}
