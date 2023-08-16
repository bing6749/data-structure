package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/9 15:25
 * @version 1.0
 */


import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 带哨兵单向链表
 *
 * @author MaRui
 */
//查找链表尾部元素
public class DoublyLinkedListSentinel implements Iterable<Integer> {
    /*
        节点类
        */
    private static class Node {
        int value;  //值
        Node prev;  //上一个节点指针
        Node next;  //下一个节点指针

        public Node(Node prev, int value, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;//头指针 -> 哨兵

    private Node tail;//尾指针 -> 哨兵

    public DoublyLinkedListSentinel() {

        head = new Node(null, 666, null);
        tail = new Node(null, 666, null);
        head.next = tail;
        tail.prev = head;
    }

    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != tail; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    /**
     * 向链表头部添加
     *
     * @param value
     */
    public void addFirst(int value) {
        insert(0, value);
    }
    /**
     * 向链表尾部添加
     *
     * @param value
     */
    public void addLast(int value) {
        Node prev = tail.prev;
        Node added = new Node(prev, value, tail);
        prev.next = added;
        tail.prev = added;

    }

    /**
     * 循环遍历链表
     */
    public void loop(Consumer<Integer> consumer) {
        Node point = this.head.next;
        while (point != null) {
            //需要做的事
            consumer.accept(point.value);
            point = point.next;
        }
    }

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head.next; p != null; p = p.next) {
            //需要做的事
            consumer.accept(p.value);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        //匿名内部类 -> 带名字的内部类
        return new Iterator<Integer>() {
            Node p = head.next;
            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    private Node findLast() {
        return tail.prev;
    }


    /**
     * 根据索引查找值
     *
     * @param index
     * @return
     */
    public int get(int index) {
        Node node = findNode(index);
        if (node == null) {
            //抛异常
            throw illegalIndex(index);
        }
        return node.value;
    }

    private static IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(String.format("index [%d] 不合法%n", index));
    }

    /**
     * 根据索引位置插入新的元素
     *
     * @param index
     */
    public void insert(int index, int value) {
        Node next = findNode(index);
        Node prev = next.prev;
        if (prev == null){
            throw illegalIndex(index);
        }
        Node inserted = new Node(prev, value, next);
        prev.next = inserted;
        next.prev = inserted;

    }

    /**
     * 删除第一个节点
     */
    public void removeFirst() {
        remove(0);
    }

    /**
     * 删除最后一个节点
     */
    public void removeLast() {
        Node prev = tail.prev.prev;
        if (prev == null){
            throw illegalIndex(0);
        }
        prev.next = tail;
        tail.prev = prev;
    }
    /**
     * 删除节点
     *
     * @param index
     */
    public void remove(int index) {
        Node prev = findNode(index - 1);  //上一个节点
        Node next = prev.next.next;
        if (next == null || prev == null){
            throw illegalIndex(index);
        }
        prev.next = next;
        next.prev = prev;
    }

}

