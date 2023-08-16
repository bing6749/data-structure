package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/11 15:04
 * @version 1.0
 */


import java.util.LinkedList;

/**
 * 汉诺塔
 *
 * @author MaRui
 */
public class E02HanoiTower {
    //a,bc为圆盘
    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    static void init(int n){
        for (int i = n; i >= 1; i--) {
            a.addLast(i);
        }
    }

    /**
     *
     * @param n 圆盘个数
     * @param a 源
     * @param b 借
     * @param c 目
     */
    static void move(int n,LinkedList<Integer> a,
                     LinkedList<Integer> b,
                     LinkedList<Integer> c){

        if (n == 0){
            return;
        }
        move(n-1,a,b,c);
        c.addLast(a.removeLast());
        move(n-1,b,a,c);
    }

    public static void main(String[] args) {
        init(3);
        System.out.println(a);
    }
}
