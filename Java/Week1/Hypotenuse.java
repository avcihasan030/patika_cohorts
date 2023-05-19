//java code finds the area of triangle using heron's formula
import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        
        //perimeters of triangle
        int a,b,c;
        Scanner scan = new Scanner(System.in);

        //get user input for each edge
        System.out.println("Enter the perimeters of the triangle: ");
        System.out.print("a: ");
        a = scan.nextInt();
        System.out.print("b: ");
        b = scan.nextInt();
        System.out.print("c: ");
        c = scan.nextInt();

        heronFormula(a, b, c);

    }

    private static void heronFormula(int a, int b, int c) {
        int s;
        s = (a+b+c)/2;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area of triangle: " + area);
    }
}
