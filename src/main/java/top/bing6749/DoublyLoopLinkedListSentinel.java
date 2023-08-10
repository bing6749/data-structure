package top.bing6749;
/*
 * @author  MaRui
 * @date  2023/8/10 14:08
 * @version 1.0
 */


import java.util.Iterator;

/**
 * 双向环形链表
 *
 * @author MaRui
 */
public class DoublyLoopLinkedListSentinel implements Iterable<Integer> {
    private static class Node {
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    //哨兵节点
    private Node sentinel = new Node(null, -1, null);

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentinel.next;

            @Override
            public boolean hasNext() {
                return p == sentinel;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    public DoublyLoopLinkedListSentinel(Node sentinel) {
        this.sentinel.prev = sentinel;
        this.sentinel.next = sentinel;
    }

    public void addFirst(int value) {
        Node next = sentinel.next;
        Node node = new Node(sentinel, value, next);
        sentinel.next = node;
        next.prev = node;
    }

    public void addLast(int value) {
        Node next = sentinel;
        Node prev = sentinel.prev;
        Node node = new Node(prev, value, next);
        sentinel.prev = node;
        prev.next = node;
    }

    private static IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(String.format("index [%d] 不合法%n", index));
    }

    public void removeFirst() {
        Node removed = sentinel.next;
        if (removed == sentinel) {
            throw illegalIndex(0);
        }
        Node next = removed.next;
        sentinel.next = next;
        next.prev = sentinel;

    }

    public void removeLast() {
        Node removed = sentinel.prev;
        Node prev = removed.prev;
        if (removed == sentinel){
            throw illegalIndex(0);
        }
        prev.next = sentinel;
        sentinel.prev = prev;
    }

    public void removeByValue(int value) {
        Node removed = findByValue(value);
        if (removed == null){
            throw illegalIndex(0);
        }
        Node prev = removed.prev;
        Node next = removed.next;
        prev.next = next;
        next.prev = prev;

    }

    private Node findByValue(int value) {
        Node p = sentinel.next;
        while (p != sentinel){
            if (p.value == value){
                return p;
            }
            p=p.next;
        }
        return null;
    }
}
