//java code checks if the given number is prime recursively

import java.util.Scanner;

public class RecursivePrimeNumbers {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int num, i;

            System.out.print("Input number: ");//ask user for input
            num = scan.nextInt();

            i = num / 2;

            if (recursivePrime(num, i)) {//if method returns true then it's prime
                System.out.println(num + " bir asal sayidir.");
            } else
                System.out.println(num + " bir asal sayi degildir.");
        }
    }

    //recursive method that check if the given number is a prime number or not 
    private static boolean recursivePrime(int num, int i) {
        if(num <= 2){
            return num == 2 ? true : false;
        }if(num%i == 0)
            return false;
        if(i*i > num)
            return true;

            return recursivePrime(num, i-1);
    }

}
