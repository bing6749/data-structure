package top.bing6749;
/*
 * @author  MaRui
 * @date  2023/8/9 15:47
 * @version 1.0
 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author MaRui
 */
public class TestSinglyLinkedList {

    @Test
    public void test1(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);

        singlyLinkedList.loop(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
    @Test
    public void test2(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);

        for (Integer integer : singlyLinkedList) {
            System.out.println(integer);
        }
    }
    @Test
    public void test3(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);

        for (Integer integer : singlyLinkedList) {
            System.out.println(integer);
        }
        Assertions.assertIterableEquals(List.of(1,2,3,4),singlyLinkedList);
    }
    @Test
    public void test4(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);
        singlyLinkedList.loop3();
//        Assertions.assertEquals(2,singlyLinkedList.get(2));
    }
}
