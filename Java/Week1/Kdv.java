import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            double amount,taxRate;

            //user inputs amount
            System.out.print("lutfen bir tutar giriniz: ");
            amount = input.nextDouble();
            if(amount >= 0 && amount <= 1000){
                taxRate = .18;
                System.out.printf("kdv'li tutar = %.2f TL\t kdv Tutari = %.2f TL\n",taxRate(amount, taxRate),(amount*taxRate));
            }else if ( amount > 1000){
                taxRate = .08;
                System.out.printf("kdv'li tutar = %.2f TL\t kdv tutari = %.2f TL\n",taxRate(amount, taxRate),(amount*taxRate));
            }else {
                System.out.println("ERROR!");//amount is less than zero 
                return;
            }
        }

    }

    //function that returns kdv amount
    private static double taxRate(double amount,double taxRate){
           return kdvLiTutar(amount, amount*taxRate);
    }

    //function returns amount including kdv amount
    private static double kdvLiTutar(double amount,double taxRate){
        return amount + taxRate;
    }
}
