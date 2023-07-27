package Week6;

import java.util.ArrayList;

public class Process implements Runnable {

    private final ArrayList<Integer> sublist;
    private final ArrayList<Integer> evenList;
    private final ArrayList<Integer> oddList;

    public Process(ArrayList<Integer> sublist, ArrayList<Integer> evenList, ArrayList<Integer> oddList) {
        this.sublist = sublist;
        this.evenList = evenList;
        this.oddList = oddList;
    }

    @Override
    public void run() {
        for (Integer num : sublist) {
            if (num % 2 == 0) {
                synchronized (evenList) {
                    System.out.println(Thread.currentThread().getName() + " add even number : " + num);
                    evenList.add(num);
                }
            } else {
                synchronized (oddList) {
                    System.out.println(Thread.currentThread().getName() + " add odd number : " + num);
                    oddList.add(num);
                }
            }
        }
    }
}
