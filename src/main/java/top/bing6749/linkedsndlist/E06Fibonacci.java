package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/10 19:57
 * @version 1.0
 */


import java.util.Arrays;

/**
 * 递归求斐波那契第n项
 *
 * @author MaRui
 */
public class E06Fibonacci {

    public static int f(int n,int[] cache){
        if (cache[n] != -1){
            return cache[n];
        }
        cache[n] = f(n-1,cache)+ f(n-2,cache);
        return cache[n];

    }

    public static int fibonacci(int n){
        int[] cache = new int[n+1];
        Arrays.fill(cache,-1);
        cache[0] = 0;
        cache[1] = 1;
        return f(n,cache);
    }
    public static void main(String[] args) {
        int n = fibonacci(60);
        System.out.println(n);
    }
}
