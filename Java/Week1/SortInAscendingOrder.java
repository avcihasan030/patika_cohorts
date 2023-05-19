import java.util.ArrayList;
import java.util.Scanner;

public class SortInAscendingOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Short> abc = new ArrayList<>();

        short a,b,c;
        

        System.out.print("input a : ");
        a = scan.nextShort();
        abc.add(a);

        System.out.print("input b : ");
        b = scan.nextShort();
        abc.add(b);

        System.out.print("input c : ");
        c = scan.nextShort();
        abc.add(c);

        abc.sort(null);
        System.out.println("sort a,b and c in ascending order: ");
        
        for (Short short1 : abc) {
            System.out.print(short1+" ");
        }
        
    }
    
}
