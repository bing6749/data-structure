package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/8 22:51
 * @version 1.0
 */


import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * 动态数组
 *
 * @author MaRui
 */
public class DynamicArray implements Iterable<Integer> {
    private int size = 0;// 逻辑大小
    private int capacity = 8;// 容量
    private int[] array = {};
    public void add(int element) {
        checkAndGrow();
        array[size] = element;
        size++;
    }
    /**
     * 添加元素
     * @param index
     * @param element
     */
    public void add(int index, int element) {
        checkAndGrow();
        if (index >= 0 && index < size) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = element;
        size++;
    }

    //检查容量并扩容
    private void checkAndGrow() {
        if (size == 0){
            array = new int[capacity];
        }else if (size == capacity) {
            capacity = +capacity >> 1;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public int get(int index) {
        return array[index];
    }

    //循环遍历
    public void foreach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
//            System.out.print(array[i]);
            consumer.accept(array[i]);
        }
    }

    //迭代器遍历
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public Integer next() {
                return array[i++];
            }
        };
    }

    //流遍历
    public IntStream stream() {
        return IntStream.of(Arrays.copyOfRange(array, 0, size));
    }

    //删除
    public int remove(int index) {
        int removed = array[index];
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return removed;
    }
}
