import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            short elements;

            System.out.print("Eleman sayisini giriniz: ");
            elements = scanner.nextShort();
            System.out.println(elements+" elemanli fibonacci serisi: ");
            fibonacci(elements);
        }

    }

    //function prints fibonacci series with iterative method
    private static void fibonacci(short elements){
        short a = 0,b = 1,c;
        for (short i = 0; i < elements; i++) {
            c = (short) (a + b);
            a = b;
            b = c;
            System.out.println(a +" + " + b + " = " + c);
        }
    }

    //function prints fibonacci series with recursive method
    private static int recFibonacci(int i){
        if(i == 0)
            return 0;
            if(i == 1)
                return 1;
            
                return recFibonacci(i-1)+recFibonacci(i-2);
    }
    
}
