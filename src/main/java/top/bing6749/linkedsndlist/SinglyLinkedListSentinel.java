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
 * @author MaRui
 */
public class SinglyLinkedListSentinel implements Iterable<Integer> {
    private Node head = new Node(666,null);//头指针 -> 哨兵

    /**
     * 向链表头部添加
     *
     * @param value
     */
    public void addFirst(int value) {
        insert(0,value);
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
            public boolean hasNext() {  //是否有下一个元素
                return p != null;
            }

            @Override
            public Integer next() { //返回当前元素的值，并且指向下一个元素
                Node n = p;
                p = p.next;
                return n.value;
            }
        };
    }

    //查找链表尾部元素
    private Node findLast() {
        Node p = this.head;
        while (p.next != null) {
            p = p.next;
        }
        return p;
    }

    /**
     * 从链表尾部添加元素
     */
    public void addLast(int value) {
        Node last = findLast();
        last.next = new Node(value, null);
    }

    /**
     * 根据下标索引查找节点
     *
     * @param index
     * @return
     */
    private Node findNode(int index) {
        int i = 0;
        for (Node p = head.next; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
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
        Node prev = findNode(index - 1);
        if (prev == null){
            //抛异常
            throw illegalIndex(index);
        }

        prev.next = new Node(value, prev.next);
    }

    /**
     * 删除第一个节点
     */
    public void removeFirst(){
        remove(0);
    }

    /**
     * 删除节点
     * @param index
     */
    public void remove(int index){
        Node prev = findNode(index-1);  //上一个节点
        if (prev == null || prev.next == null){
            //抛异常
            throw illegalIndex(index);

        }
        prev = prev.next;
    }
    /*
    节点类
    */
    private static class Node {
        int value;  //值
        Node next;  //下一个节点指针

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}

