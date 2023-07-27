package Week6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mainList = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            mainList.add(i);
        }

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        Thread[] threads = new Thread[4];
        int quarterLength = mainList.size() / threads.length;

        for (int i = 0; i < 4; i++) {
            int startIndex = i * quarterLength;
            int endIndex = (i + 1) * quarterLength;

            ArrayList<Integer> sublist = new ArrayList<>(mainList.subList(startIndex, endIndex));
            Process process = new Process(sublist, evenList, oddList);
            threads[i] = new Thread(process);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("List of even numbers: " + evenList);
        System.out.println("List of odd number: " + oddList);
    }
}
