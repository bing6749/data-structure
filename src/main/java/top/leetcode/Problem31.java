package top.leetcode;

import java.util.Arrays;

/**
 * 下一个排序
 */
public class Problem31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int firstBig = -1;

        // 找到第一个递减的元素
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                firstBig = i;
                break;
            }
        }

        if (firstBig == -1) {
            // 如果没有找到递���元素，说明当前排列是最大的，直接反转为最小排列
            reverse(nums, 0, n - 1);
        } else {
            // 找到第一个比 firstBig 大的元素
            int areaSmall = n - 1;
            for (int i = n - 1; i > firstBig; i--) {
                if (nums[i] > nums[firstBig]) {
                    areaSmall = i;
                    break;
                }
            }
            // 交换 firstBig 和 areaSmall
            swap(nums, firstBig, areaSmall);
            // 反转 firstBig 之后的元素
            reverse(nums, firstBig + 1, n - 1);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        Problem31 problem31 = new Problem31();
        int[] nums = new int[]{2, 3, 1};
        problem31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}