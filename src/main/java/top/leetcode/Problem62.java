package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/11/7 21:10
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Problem62 {
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        int[][] dp = new int[m][n];

        for(int i = 0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int i = 1;i<n;i++){
            dp[0][i] = 1;
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
