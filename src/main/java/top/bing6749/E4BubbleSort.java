package top.bing6749;
/*
 * @author  MaRui
 * @date  2023/8/10 18:13
 * @version 1.0
 */


import java.util.Arrays;

/**
 * 递归冒泡排序
 *
 * @author MaRui
 */
public class E4BubbleSort {
    // j 代表未排序区域的右边界
    private static void bubble(int[] a,int j){
        if (j == 0){
            return;
        }
        int x = 0;
        for (int i = 0; i < j; i++) {
            if (a[i]>a[i+1]){
                int m = a[i];
                a[i] = a[i+1];
                a[i+1] =m;
                x= i;
            }
        }
        bubble(a,x);

    }
    //递归冒泡
    public static void factorialSort(int[] a){
        bubble(a,a.length-1);
    }
    //常规冒泡
    public static void sort(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]){
                    int m = a[j];
                    a[j] = a[j+1];
                    a[j+1] =m;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {0,6,5,4,1,2,3};
        factorialSort(a);
        System.out.println(Arrays.toString(a));
    }
}
