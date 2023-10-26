package top.bing6749;

import java.util.*;

/**
 * @author MaRui
 */
public class Person{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext()) {
            int a = reader.nextInt();
            System.out.print(area(a)+" ");
            System.out.println(length(a));
        }
        reader.close();
    }

    private static int length(int a) {

        return a*4;
    }

    private static int area(int a) {
        return a*a;
    }

}