//Java code that calculates the harmonic mean of an array elements.

package AverageOfArrayElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // declare variables
        int[] numbers = { 1, 2, 3, 4, 5 };
        double harmonicSum = 0;
        int arrLength = numbers.length;// variable holds length of the array

        for (int i : numbers) {// usage of foreach loop to calculate harmonic serie of the array
            harmonicSum += 1 / i;
        }

        // display elements of the given array
        System.out.println("Given array: " + Arrays.toString(numbers));
        System.out.println("Result = " + (arrLength / harmonicSum));// print result
    }
}