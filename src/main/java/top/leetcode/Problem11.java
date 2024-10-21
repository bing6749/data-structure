package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/7/11 16:54
 * @version 1.0
 */

/**
 * LeetCode 11: 盛最多水的容器
 * 给定一个整数数组 height，数组中的每个元素代表一个点的高度。数组中任意两个点可以构成一个容器，
 * 你需要找到能够使容器盛水最多的两个点，返回它们能够构成的容器的最大容量。
 * 解题思路采用双指针法。
 *
 * @author MaRui
 */
public class Problem11 {
    /**
     * 计算能够盛最多水的容器的最大容量。
     *
     * @param height 整数数组，每个元素代表一个点的高度。
     * @return 返回能够构成的容器的最大容量。
     */
    public int maxArea(int[] height) {
        int res = 0; // 用于存储最大容量
        int left = 0; // 左指针，从数组的开始位置出发
        int right = height.length - 1; // 右指针，从数组的末尾开始
        while (left < right) { // 当左指针小于右指针时，执行循环
            // 计算当前左右指针构成的容器的容量，并更新最大容量
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
            // 移动指针，总是向内移动较矮的一边，以寻找可能存在的更大容量
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res; // 返回最大容量
    }
}