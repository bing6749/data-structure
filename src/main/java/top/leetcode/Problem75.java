package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/11/29 20:38
 * @version 1.0
 */


/**
 * 颜色分类
 * @author MaRui
 */
public class Problem75 {
    public void sortColors(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
        }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
