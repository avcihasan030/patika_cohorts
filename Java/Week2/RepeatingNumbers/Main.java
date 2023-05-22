package RepeatingNumbers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // define a sorted array in ascending order
        int[] arr = { 11, 14, 15, 15, 20, 20, 23, 29, 31, 54, 54, 65, 76, 99, 100 };
        ArrayList<Integer> _dupList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {// check if array duplicates itself
                    if (isEven(arr[i])) {// check if the duplicate number is even
                        if (!_isDuplicate(_dupList, arr[i])) {// try to pass duplicate numbers uniquely to the arraylist
                            _dupList.add(arr[i]);
                            break;
                        }
                    }
                }
            }
        }

        // display results
        for (Integer integer : _dupList) {
            System.out.print(integer + " ");
        }

    }

    // method checks duplication
    private static boolean _isDuplicate(ArrayList<Integer> _dupList, int arr2) {
        return _dupList.contains(arr2) ? true : false;
    }

    // method check if given number is an even number or not
    private static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
