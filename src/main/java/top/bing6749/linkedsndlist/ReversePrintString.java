package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/10 16:14
 * @version 1.0
 */


/**
 * 递归反向打印字符串
 *
 * @author MaRui
 */
public class ReversePrintString {
    public static void f(String str,Integer n){
        if (n == str.length()){
            return;
        }
        f(str,n+1);
        System.out.println(str.charAt(n));
    }

    public static void print(String str){
        f(str,0);
    }

    public static void main(String[] args) {
        print("abcd");
    }
}
