package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size;

    public MyList() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyList(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be at least 1.");
        }
        this.array = (T[]) new Object[capacity];
        size = 0;
    }

    protected int size() {
        return size;
    }

    protected int getCapacity() {
        return array.length;
    }

    protected void add(T data) {
        if (size == getCapacity()) {
            resize();
        }

        array[size] = data;
        size++;
    }

    private void resize() {
        int newCapacity = getCapacity() * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = (T[]) newArray;
    }

    protected T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        return (T) array[index];
    }

    protected T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        T removedData = get(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;
        return removedData;
    }

    protected T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }

        T prevData = get(index);
        array[index] = data;
        return prevData;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(" , ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // public String toString(){
    // return Arrays.toString(array);
    // }

    protected int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(array[i]))
                return i;
        }
        return -1;
    }

    protected int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (data.equals(array[i]))
                return i;
        }
        return -1;
    }

    protected boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        return this.array;
    }

    protected void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    protected MyList<T> subList(int start, int finish) {
        if (start < 0 || finish < 0 || start >= size || finish >= size) {
            return null;
        }
        MyList<T> sublist = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sublist.add(get(i));
        }
        return sublist;
    }

    private boolean contains(T data) {
        return indexOf(data) != -1;
    }
}
