package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/7 22:23
 * @version 1.0
 */


/**
 * @author MaRui
 * 二分查找算法
 */
public class BinarySearch {
    /**
     * 二分查找基础版
     *
     * @param a=数组
     * @param target 目标
     * @return 返回目标数下标，找不到返回-1
     */
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            //int m = (i + j) / 2;    若i+j超过整形最大值，则转换会出现问题，java中把最高位看成了符号位
            int m = (i + j) >>> 1;    //右移一位
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

        /*
            同一个二进制数
            1011_1111_1111_1111_1111_1111_1111_1110

            不把最高位视为符号位, 代表 3221225470
            把最高位视为符号位, 代表 -1073741826
         */
}
