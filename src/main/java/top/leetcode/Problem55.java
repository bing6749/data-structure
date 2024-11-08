package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/11/6 19:35
 * @version 1.0
 */


/**
 *
 * @author MaRui
 */
public class Problem55 {
    public boolean canJump(int[] nums) {
        // 初始化 maxReach 变量，表示当前能到达的最远位置
        int maxReach = 0;

        // 遍历数组中的每个元素
        for (int i = 0; i < nums.length; i++) {
            // 如果当前索引 i 在 maxReach 范围内
            if (maxReach >= i) {
                // 更新 maxReach 为当前索引 i 加上该位置的跳跃步数
                maxReach = Math.max(maxReach, i + nums[i]);
            }
            // 如果 maxReach 已经大于等于数组的长度，返回 true
            if (maxReach >= nums.length) {
                return true;
            }
        }
        // 遍历结束后仍未返回 true，返回 false
        return false;
    }
}
