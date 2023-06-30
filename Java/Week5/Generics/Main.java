package Generics;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.getCapacity());

        myList.add(40);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.getCapacity());

        myList.remove(1);
        System.out.println(myList);
        System.out.println(myList.size());

        myList.set(1, 50);
        System.out.println(myList);

        System.out.println(myList.indexOf(50));
        System.out.println(myList.lastIndexOf(40));

        System.out.println(myList.isEmpty());

        myList.clear();
        System.out.println(myList);
        System.out.println(myList.isEmpty());

        for (int i = 10; i <= 100; i += 10) {
            myList.add(i);
        }

        System.out.println(myList);

        System.out.println("sublist: " + myList.subList(3, 7));

        myList.clear();
        System.out.println(myList);
        System.out.println(myList.isEmpty());
    }
}
