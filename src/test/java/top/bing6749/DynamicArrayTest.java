package top.bing6749;
/*
 * @author  MaRui
 * @date  2023/8/9 11:16
 * @version 1.0
 */


import org.junit.jupiter.api.Test;
import top.bing6749.linkedsndlist.DynamicArray;

/**
 * @author MaRui
 */

public class DynamicArrayTest {

    @Test
    public void test1(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        for (Integer integer : dynamicArray) {
            System.out.println(integer);
        }
    }
    @Test
    public void test2(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.remove(2);
        dynamicArray.stream().forEach((e) ->{
            System.out.println(e);
        });
    }

}
