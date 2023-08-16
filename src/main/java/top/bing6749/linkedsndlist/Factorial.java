package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/10 16:06
 * @version 1.0
 */


/**
 * 阶乘
 * @author MaRui
 */
public class Factorial {
    public int f(int n){
        if (n == 1){
            return 1;
        }
        return n * f(n-1);
    }
}
