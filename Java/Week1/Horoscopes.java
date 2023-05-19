import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte day, month;

        System.out.print("Dogdugunuz ay: ");
        month = scan.nextByte();

        System.out.print("Dogdugunuz gun: ");
        day = scan.nextByte();

        String s;

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                s = (day <= 21) ? "Oğlak burcu" : "Kova burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz.");
        }

        else if (month == 2) {
            if (day >= 1 && day <= 29) {
                s = (day <= 19) ? "Kova burcu" : "Balık burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 3) {
            if (day >= 1 && day <= 31) {
                s = (day <= 20) ? "Balık burcu" : "Koç burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 4) {
            if (day >= 1 && day <= 30) {
                s = (day <= 20) ? "Koç burcu" : "Boğa burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 5) {
            if (day >= 1 && day <= 31) {
                s = (day <= 21) ? "Boğa burcu" : "İkizler burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 6) {
            if (day >= 1 && day <= 30) {
                s = (day <= 22) ? "İkizler burcu" : "Yengeç burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 7) {
            if (day >= 1 && day <= 31) {
                s = (day <= 22) ? "Yengeç burcu" : "Aslan burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 8) {
            if (day >= 1 && day <= 31) {
                s = (day <= 22) ? "Aslan burcu" : "Başak burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 9) {
            if (day >= 1 && day <= 30) {
                s = (day <= 22) ? "Başak burcu" : "Terazi burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 10) {
            if (day >= 1 && day <= 31) {
                s = (day <= 22) ? "Terazi burcu" : "Akrep burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 11) {
            if (day >= 1 && day <= 30) {
                s = (day <= 21) ? "Akrep burcu" : "Yay burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else if (month == 12) {
            if (day >= 1 && day <= 31) {
                s = (day <= 21) ? "Yay burcu" : "Oğlak Burcu";
                System.out.println(s);
            } else
                System.out.println("Gün sayısını yanlış girdiniz!");
        }

        else {
            System.out.println("Lütfen geçerli bir ay giriniz!");
        }
    }
}
