package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/7/8 15:40
 * @version 1.0
 */


import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * @author MaRui
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        // 创建一个HashMap来存储字符及其对应的索引
        Map<Character, Integer> map = new HashMap<>();
        // 记录最长子串的长度
        int maxLength = 0;
        // 初始化滑动窗口的两个指针
        for (int start = 0, end = 0; end < s.length(); end++) {
            // 获取当前字符
            char currentChar = s.charAt(end);
            // 如果当前字符已经在哈希表中出现过
            if (map.containsKey(currentChar)) {
                // 更新start指针，确保start指针始终在当前字符上一次出现位置的后面
                start = Math.max(map.get(currentChar) + 1, start);
            }
            // 将当前字符和它的索引存入哈希表中
            map.put(currentChar, end);
            // 更新最长子串的长度
            maxLength = Math.max(maxLength, end - start + 1);
        }
        // 返回最长子串的长度
        return maxLength;
    }
}
