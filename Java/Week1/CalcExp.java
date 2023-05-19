import java.util.Scanner;

public class CalcExp {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            byte base,exponent;

            System.out.print("Üssü alınacak sayıyı girin: ");
            base = scan.nextByte();
            
            System.out.print("Üs olacak sayıyı girin: ");
            exponent = scan.nextByte();

            short res = 1;

            for (int i = 0; i < exponent; i++) {
                    res *= base;
            }

            System.out.println("Cevap -> " + res);
        }
    }
}
