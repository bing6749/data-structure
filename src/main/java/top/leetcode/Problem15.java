package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/7/12 11:03
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 *
 * @author MaRui
 */
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // 对数组进行排序
        // 如果数组长度小于3，或者最小值大于0，或者最大值小于0，则直接返回空列表
        if(length < 3 || nums[0] > 0 || nums[length - 1] < 0){
            return res;
        }
        // 遍历数组，寻找三数之和为0的组合
        for (int i = 0; i < length - 2; i++) {
            // 跳过重复的数，以避免重复的三元组
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            // 如果当前数的后两个数之和仍小于当前数的相反数，则结束循环
            if(nums[i + 1] + nums[i + 2] > -nums[i]){
                break;
            }
            // 如果当前数的相反数大于数组最后两个数之和，则继续下一次循环
            if(-nums[i] > nums[length - 1] + nums[length - 2]){
                continue;
            }
            int j = i + 1; // 左指针
            int k = length - 1; // 右指针
            // 使用双指针遍历数组，寻找两数之和为当前数相反数的组合
            while(j < k){
                int target = nums[i] + nums[j] + nums[k];
                if (target > 0) {
                    k--; // 如果三数之和大于0，移动右指针
                }else if(target < 0){
                    j++; // 如果三数之和小于0，移动左指针
                }else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k])); // 添加满足条件的三元组
                    ++j;
                    --k;
                    // 跳过重复的数
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }

        }
        return res; // 返回结果列表
    }
}