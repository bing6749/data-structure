package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/10 19:04
 * @version 1.0
 */


/**
 * 递归插入排序
 *
 * @author MaRui
 */
public class E05InsertionSort {
    public static void sort(int[] a) {
        insertion(a,1);
    }

    private static void insertion(int[] a, int low) {
        if (low == a.length) {
            return;
        }
        int t = a[low];
        int i = low - 1;
        while (i >= 0 && a[i] > t) {
            a[i + 1] = a[i];
            i--;
        }
        if (i+1 != low) {
            a[i + 1] = t;
        }
        insertion(a, low + 1);
    }
    private static void insertion2(int[] a ,int low){
        if (low == a.length) {
            return;
        }
        int i = low -1;
        while (i>=0 && a[i] >a[i+1]){
            int t = a[i];
            a[i] = a[i+1];
            a[i+1] = t;

            i--;
        }

        insertion(a, low + 1);
    }
}
