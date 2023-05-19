import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            short year;

            System.out.print("Yil giriniz: ");
            year = scan.nextShort();
            
            isLeapYear(year);
        }
    }

    private static void isLeapYear(short year) {
        boolean isLeap;
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    isLeap = true;
                }else isLeap = false;
            }else isLeap = true;
        }else isLeap = false;

        if(isLeap){
            System.out.println(year + " bir artik yildir");
        }else System.out.println(year + " bir artik yil degildir");
    }
}
