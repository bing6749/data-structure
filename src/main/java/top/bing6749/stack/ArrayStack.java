package top.bing6749.stack;
/*
 * @author  MaRui
 * @date  2023/8/14 21:45
 * @version 1.0
 */


import java.util.Iterator;

/**
 * @author MaRui
 */
public class ArrayStack<E> implements Stack<E>,Iterable<E> {
    private E[] array;
    private int top;//栈顶指针

    public ArrayStack(int capacity) {
        this.array = (E[]) new Object[capacity];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = top;
            @Override
            public boolean hasNext() {
                return p == 0;
            }

            @Override
            public E next() {
                return array[--p];
            }
        };
    }

    @Override
    public boolean push(E value) {
        if (isFull()) {
            return false;
        }
        array[top++] = value;//++在后，先找索引再++
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return array[--top];
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return array[top -1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == array.length;
    }
}
