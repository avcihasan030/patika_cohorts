import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double km;//distance in km
        double perKm = 2.20,startPrice = 10.0,total;//prices

        try (Scanner scanner = new Scanner(System.in)) {
            //ask for user input
            System.out.print("Input distance in km: ");
            km = scanner.nextDouble();

            total = (km*perKm);
        }
        taxiMeterTotalPrice(startPrice, total);//function call 

    }

    //function that calculates the taximeter amount
    private static void taxiMeterTotalPrice(double startPrice, double total) {
        total += startPrice;

        total = (total < 20) ? 20:total;
        System.out.printf("Total price: $%.2f\n",total);
    }
    
}
