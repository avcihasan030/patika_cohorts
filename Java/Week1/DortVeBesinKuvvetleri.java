import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            byte N;

            System.out.print("-> ");
            N = scan.nextByte();

            for (int i = 0; i <= N; i++) {
                System.out.println("4^" + i + " = " + Math.pow(4, i));
                System.out.println("5^" + i + " = " + Math.pow(5, i));
            }
        }
    }
    
}
