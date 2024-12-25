package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/11/9 20:26
 * @version 1.0
 */


/**
 * 最小路径和
 * @author MaRui
 */
public class Problem67 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] outArr = new int[m][n];
        outArr[0][0] = grid[0][0];
        // 初始化第一行
        for (int j = 1; j < n; j++) {
            outArr[0][j] = outArr[0][j-1] + grid[0][j];
        }

        // 初始化第一列
        for (int i = 1; i < m; i++) {
            outArr[i][0] = outArr[i-1][0] + grid[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int i1 = 1; i1 < n; i1++) {
                outArr[i][i1] = Math.min(outArr[i-1][i1],outArr[i][i1-1]) + grid[i][i1];
            }
        }
        return outArr[m-1][n-1];
    }
}
