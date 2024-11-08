package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/11/4 17:03
 * @version 1.0
 */


/**
 * 最大子数组和
 * @author MaRui
 */
public class Problem53 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0){
                sum += num;
            }else {
                sum = num;
            }
            ans = Math.max(sum,ans);
        }

        return ans;
    }
}
