package top.bing6749.stack;
/*
 * @author  MaRui
 * @date  2023/8/14 21:17
 * @version 1.0
 */


import org.w3c.dom.Node;
import top.bing6749.quenue.LinkedListQueue;

import java.util.Iterator;

/**
 * @author MaRui
 */
public class LinkedListStack<E> implements Stack<E>,Iterable<E>{
    private int capacity;
    private int size;
    private Node<E> head = new Node<>(null,null);
    private static class Node<E>{
        Node<E> next;
        E value;

        public Node(Node<E> next, E value) {
            this.next = next;
            this.value = value;
        }
    }
    @Override
    public boolean push(E value) {
        if (isFull()){
            return false;
        }
        head.next = new Node<>(head.next,value);
        size++;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        Node<E> first = head.next;
        head.next = first.next;
        size--;
        return first.value;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        Node<E> first = head.next;
        return first.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            LinkedListStack.Node<E> p = head;
            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public E next() {
                E value = p.value;
                p = p.next;
                return value;
            }
        };
    }
}
