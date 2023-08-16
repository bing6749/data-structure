package top.bing6749.linkedsndlist;
/*
 * @author  MaRui
 * @date  2023/8/11 15:33
 * @version 1.0
 */


/**
 * 杨辉三角
 *
 * @author MaRui
 */
public class E03PascalTriangle {
    //记忆版
    private static int element(int[][] triangle,int i,int j){
        if (triangle[i][j] >0){
            return triangle[i][j];
        }
        if (j == 0 || i == j){
            triangle[i][j] = 1;
            return 1;
        }
        triangle[i][j] = element(triangle,i-1,j-1)+element(triangle,i-1,j);
        return triangle[i][j];
    }

    public static void print(int n){
        int[][] triangle = new int[n][];
        for (int j = 0; j < n; j++) {
            triangle[j] = new int[j+1];
            if (j < n - 1) {
                System.out.printf("%" + 2 * (n - 1 - j) + "s", " ");
            }
            for (int k = 0; k <= j; k++) {
                System.out.printf("%-4d",element(triangle,j,k));
            }
            System.out.println();
        }
    }
    //普通版
    private static int element1(int i,int j){
        if (j == 0 || i == j){
            return 1;
        }
        return element1(i-1,j-1)+element1(i-1,j);
    }

    public static void print1(int n){
        for (int j = 0; j < n; j++) {
                if (j < n - 1) {
                    System.out.printf("%" + 2 * (n - 1 - j) + "s", " ");
                }
            for (int k = 0; k <= j; k++) {
                System.out.printf("%-4d",element1(j,k));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
    }

}
