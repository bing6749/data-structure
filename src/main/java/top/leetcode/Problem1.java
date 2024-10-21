package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/7/8 14:20
 * @version 1.0
 */


import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author MaRui
 */
public class Problem1 {
    //暴力解法
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    //哈希表
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
