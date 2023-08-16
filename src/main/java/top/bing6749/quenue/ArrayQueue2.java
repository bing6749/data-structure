package top.bing6749.quenue;
/*
 * @author  MaRui
 * @date  2023/8/14 14:04
 * @version 1.0
 */


import java.util.Iterator;

/**
 * @author MaRui
 */
public class ArrayQueue2<E> implements Queue<E>, Iterable<E> {
    private E[] array;
    private int head = 0;
    private int tail = 0;
    private int size = 0;


    @SuppressWarnings("all")
    public ArrayQueue2(int capacity) {
        array = (E[]) new Object[capacity];

    }

    @Override
    public boolean offer(E value) {
        if (isFull()) {
            return false;
        }
        array[tail] = value;
        tail = (tail + 1) % array.length;
        size++;
        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        E value = array[head];
        head = (head + 1) % array.length;
        size--;
        return value;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return array[head];
    }

    @Override
    public boolean isEmpty() {
        return 0 == size;
    }

    @Override
    public boolean isFull() {
        return size == array.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = head;
            int count = 0;
            @Override
            public boolean hasNext() {
                return count < size ;
            }

            @Override
            public E next() {
                E value = array[p];
                p = (p+1)% array.length;
                count++;
                return value;
            }
        };
    }
}
