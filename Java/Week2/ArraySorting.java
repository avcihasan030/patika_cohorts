//Java code sorts array in ascending order

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {

        // do process within try block
        try (Scanner scan = new Scanner(System.in)) {
            int array_size;// define the variable holds size of the array
            ArrayList<Integer> arr = new ArrayList<>();// define array list

            System.out.print("Input size of the array: ");// ask user to input size of the array
            array_size = scan.nextInt();

            System.out.println("Input each element of the array: ");
            for (int i = 0; i < array_size; i++) { // ask user to assign each element of the array
                System.out.print("-> ");
                arr.add(scan.nextInt());
            }

            System.out.println("\nUnsorted array: ");// print unsorted array
            System.out.println(arr);
            System.out.println("\nSorted array in ascending order: ");// print sorted array
            arr.sort(null);// sort the array
            System.out.println(arr);
            scan.close();// close scanner
        }
    }

}
