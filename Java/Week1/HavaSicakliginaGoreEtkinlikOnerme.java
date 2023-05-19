import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        short heat;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hava sicakligini giriniz: ");
        heat = scan.nextShort();

        String s = (heat < 5) ?  "Kayak yapabilirsiniz" : 
                    (heat >= 5 && heat < 15) ? "Sinemaya gidebilirsiniz": 
                        (heat >= 15 && heat < 25) ? "Piknik Yapabilirsiniz":"Yüzmeye gidebilirsiniz";
                        
                        System.out.println(s);
    }
}
