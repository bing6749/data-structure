package top.bing6749.quenue;
/*
 * @author  MaRui
 * @date  2023/8/14 11:29
 * @version 1.0
 */


import java.util.Iterator;

/**
 * @author MaRui
 */
public class LinkedListQueue<E> implements Queue<E>,Iterable<E>{

    private static class Node<E>{
        Node<E> next;
        E value;

        public Node(Node<E> next, E value) {
            this.next = next;
            this.value = value;
        }
    }
    Node<E> head = new Node<>(null,null);
    Node<E> tail = head;
    private int size;//节点数
    private int capacity = Integer.MAX_VALUE;//容量
    {

        tail.next = head;
    }
    public LinkedListQueue(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public boolean offer(E value) {
        if (isFull()){
            return false;
        }
        Node<E> added = new Node<>(head, value);
        tail.next = added;
        tail = added;
        size++;
        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()){
            return null;
        }
        Node<E> first = head.next;
        head.next = first.next;
        size--;
        return first.value;
    }

    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }
        Node<E> first = head.next;
        if (first == tail){
            tail = head;
        }
        head.next = first.next;
        return first.value;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> node = head.next;
            @Override
            public boolean hasNext() {
                return node != head;
            }

            @Override
            public E next() {
                E value = node.value;
                node = node.next;
                return value;
            }
        };
    }
}
