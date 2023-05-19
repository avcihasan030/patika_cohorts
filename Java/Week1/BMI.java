import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Input weight in kilograms(kg): ");
            double weight = scan.nextDouble();

            System.out.print("Input height in meters(m): ");
            double height = scan.nextDouble();

            double BMI = calcBMI(weight, height);
            System.out.print("Your Body Mass Index (BMI) is " + BMI + " kg/m2");
        }
    }

    private static double calcBMI(double weight, double height) {
        double BMI = weight / (height * height);
        return BMI;
    }
}