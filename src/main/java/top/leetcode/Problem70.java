package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/11/9 20:53
 * @version 1.0
 */


/**
 * 爬楼梯
 * @author MaRui
 */
public class Problem70 {
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
