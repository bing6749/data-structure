package top.homework.com.test;
/*
 * @author  MaRui
 * @date  2023/12/5 21:23
 * @version 1.0
 */


import top.homework.com.graphic.Cylinder;

import java.util.Scanner;

/**
 * @author MaRui
 */
public class test {
    public static void main(String[] args) {
        String next = "23 10 -8 0 3 7 108";
        String[] s = next.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (int i1 = i; i1 <  s.length; i1++) {
                if (Integer.valueOf(s[i]) > Integer.valueOf(s[i1])){
                    String temp = s[i];
                    s[i] = s[i1];
                    s[i1] = temp;
                }
            }
        }
        for (String line : s) {
            System.out.print(line+" ");
        }
    }
}
