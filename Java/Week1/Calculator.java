import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            short n1,n2,select;

            System.out.print("Input first number: ");
            n1 = scanner.nextShort();

            System.out.print("Input second number: ");
            n2 = scanner.nextShort();

            System.out.println();
            
            System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
            System.out.print("Select one: ");
            select = scanner.nextShort();

            switch (select) {
                case 1:
                    System.out.println("Sum: " + (n1+n2));
                    break;
                case 2:
                    System.out.println("Subtraction: " + (n1-n2));
                    break;
                case 3:
                System.out.println("Multiplication: " + (n1*n2));
                    break;
                case 4:
                    try{
                        double res = n1/n2;
                        System.out.println("Division: " + res);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    break;

                default:
                System.out.println("Invalid data entry!");
                    break;
            }
        }

    }
    
}
