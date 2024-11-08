package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/11/6 21:15
 * @version 1.0
 */


import java.util.Arrays;
import java.util.Comparator;

/**
 * 合并区间
 * @author MaRui
 */
public class Problem56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // 按区间起始位置排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int outArrayIndex = 0;
        int[][] outArray = new int[intervals.length][2];
        int pre = intervals[0][0];
        int next = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]<=next){
                next = Math.max(next, intervals[i][1]);
                pre = Math.min(pre, intervals[i][0]);
            }
            else{
                outArray[outArrayIndex][0] = pre;
                outArray[outArrayIndex][1] = next;
                outArrayIndex++;
                pre = intervals[i][0];
                next = intervals[i][1];
            }
        }
        // 添加最后一个区间
        outArray[outArrayIndex][0] = pre;
        outArray[outArrayIndex][1] = next;
        outArrayIndex++;

        return Arrays.copyOf(outArray, outArrayIndex);
    }
}
