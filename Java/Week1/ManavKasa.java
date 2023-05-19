import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5;

        double toplamTutar = 0,kilo;

        Scanner scan = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
            kilo = scan.nextDouble();
            toplamTutar += armut*kilo;

        System.out.print("Elma kaç kilo? : ");
            kilo = scan.nextDouble();        
            toplamTutar += elma*kilo;

        System.out.print("Domates kaç kilo? : ");
             kilo = scan.nextDouble();
             toplamTutar += domates*kilo;

        System.out.print("Muz kaç kilo? : ");
             kilo = scan.nextDouble();
             toplamTutar += muz*kilo;

        System.out.print("Patlican kaç kilo? : ");
             kilo = scan.nextDouble();
             toplamTutar += patlican*kilo;

        System.out.print("Toplam tutar = " + toplamTutar + "TL");
    }
    
}
