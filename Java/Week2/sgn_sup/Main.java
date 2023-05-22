package sgn_sup;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Dizinin boyutunu alınız
            System.out.print("Dizi boyutunu girin: ");
            int n = input.nextInt();

            // Dizi elemanlarını alınız
            int[] dizi = new int[n];
            System.out.println("Dizi elemanlarını girin:");
            for (int i = 0; i < n; i++) {
                dizi[i] = input.nextInt();
            }

            // Hedef sayıyı alınız
            System.out.print("Hedef sayıyı girin: ");
            int destination = input.nextInt();

            // Diziyi sıralayınız
            Arrays.sort(dizi);

            // En yakın sayıları bulunuz
            int enYakinKucuk = -1;
            int enYakinBuyuk = -1;

            for (int i = 0; i < n; i++) {
                if (dizi[i] < destination) {
                    enYakinKucuk = dizi[i];
                } else if (dizi[i] > destination) {
                    enYakinBuyuk = dizi[i];
                    break;
                }
            }

            // Sonuçları yazdırınız
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
        }
    }
}
