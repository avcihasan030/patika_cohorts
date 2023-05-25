import java.util.Arrays;
import java.util.Random;

public class ArrayFrequency {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[40];
        int[] frequency = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        System.out.println("Original array : \n\n" + Arrays.toString(arr) + "\n\n");

        for (int i = 0; i < arr.length; i++) {
            ++frequency[arr[i]];
        }

        System.out.println("Array\t\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + "\t\t " + frequency[i]);
        }
    }
}
