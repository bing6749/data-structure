package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/7/8 14:07
 * @version 1.0
 */


import java.util.Arrays;

/**
 * 724. 寻找数组的中心下标
 * @author MaRui
 */

public class Problem724 {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0, sumRight = Arrays.stream(nums).sum();
        for(int i=0;i<nums.length;i++){
            sumRight -= nums[i];
            if(sumLeft == sumRight){
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
}
