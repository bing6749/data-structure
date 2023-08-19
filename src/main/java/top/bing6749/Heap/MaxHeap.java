package top.bing6749.Heap;
/*
 * @author  MaRui
 * @date  2023/8/17 19:50
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class MaxHeap {
    int[] array;
    int size;

    public MaxHeap(int capacity) {
        this.array = new int[capacity];
    }

    public MaxHeap(int[] array) {
        this.array = array;
        this.size = array.length;
        heapify();
    }

    //建堆
    public void heapify() {
        //找到最后这个非叶子节点
        for (int i = (size / 2) - 1; i >= 0; i++) {
            down(i);
        }

    }

    //删除堆顶元素
    public int poll() {
        int top = array[0];
        swap(size - 1, 0);//交换堆顶与末尾元素
        size--;
        down(0);
        return top;

    }

    //删除堆指定元素
    public int poll(int index) {
        int top = array[index];
        swap(size - 1, index);//交换堆顶与末尾元素
        size--;
        down(index);
        return top;
    }

    //获取堆顶元素
    public int peek() {
        if (size == 0) {
            return 0;
        }
        return array[0];
    }

    //替换堆顶元素
    public void replace(int replaced) {
        array[0] = replaced;
        down(0);
    }

    //堆尾部添加元素
    public boolean offer(int offered) {
        if (size == array.length) {
            return false;
        }
        up(offered);
        size++;
        return true;
    }

    private void up(int offered) {
        int child = size;
        while (child > 0) {
            int parent = (child - 1) / 2;
            if (offered > array[parent]){
                array[child] = array[parent];
            }else {
                break;
            }
            child = parent;
        }
        array[child] = offered;
    }

    //(下潜)将parent与两个孩子进行比较，与两个孩子中较大的进行交换，直至没孩子或者孩子没他大
    private void down(int parent) {
        int left = parent * 2 + 1;
        int right =
                left + 1;
        int max = parent;
        if (left < size && array[left] > array[max]) {
            max = left;
        } else if (right < size && array[right] > array[max]) {
            max = right;
        }
        if (max != parent) { //找到了一个更大的孩子
            swap(max, parent);
            down(max);
        }
    }

    //交换两个索引处的元素
    private void swap(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

}
