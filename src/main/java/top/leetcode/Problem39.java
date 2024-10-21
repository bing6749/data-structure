package top.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合总数
 * 该类用于解决组合总和问题，给定一个候选数组和一个目标值，找出所有可以使数字和为目标值的组合。
 * @author MaRui
 */
public class Problem39 {
    /**
     * 组合总和方法
     * @param candidates 候选数组
     * @param target 目标值
     * @return 所有可以使数字和为目标值的组合
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>(); // 用于存储结果的列表
        backtrack(candidates, target, new ArrayList<>(), res, 0); // 调用回溯方法
        return res; // 返回结果
    }

    /**
     * 回溯方法
     * @param candidates 候选数组
     * @param target 当前目标值
     * @param curr 当前组合
     * @param res 结果列表
     * @param start 当前起始索引
     */
    private void backtrack(int[] candidates, int target, List<Integer> curr, List<List<Integer>> res, int start) {
        if (target == 0) { // 如果当前目标值为0，说明找到一个有效组合
            res.add(new ArrayList<>(curr)); // 将当前组合添加到结果列表中
            return; // 结束当前递归，剪枝
        }
        if (target < 0) { // 如果当前目标值小于0，说明当前组合无效
            return; // 结束当前递归，剪枝
        }
        for (int i = start; i < candidates.length; i++) { // 遍历候选数组
            curr.add(candidates[i]); // 将当前候选数添加到当前组合中
            backtrack(candidates, target - candidates[i], curr, res, i); // 递归调用回溯方法，更新目标值和起始索引
            curr.remove(curr.size() - 1); // 回溯，移除当前候选数
        }
    }

    /**
     * 计算列表中所有元素的和
     * @param curr 列表
     * @return 列表中所有元素的和
     */
    public int sum(List<Integer> curr) {
        int total = 0; // 初始化总和为0
        for (int num : curr) { // 遍历列表中的每个元素
            total += num; // 将元素值累加到总和中
        }
        return total; // 返回总和
    }
}