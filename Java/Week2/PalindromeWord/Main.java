package PalindromeWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String _word;

        System.out.print("Enter a word : ");
        _word = scanner.nextLine();

        System.out.println(isPalindrome(_word));
    }

    private static String isPalindrome(String _word) {
         String rev = "";
         for (int i = _word.length()-1; i >= 0; i--) {
            rev += _word.charAt(i);
         }

         return (_word.equalsIgnoreCase(rev)) ? "This is palindrome":"This is not palindrome";
    }
    
}
