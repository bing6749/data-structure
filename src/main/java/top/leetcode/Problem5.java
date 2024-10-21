package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/7/11 17:25
 * @version 1.0
 */

/**
 * 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 回文子串是正着读和倒着读都一样的字符串。
 * 本解法采用中心扩展算法，对每个可能的中心位置进行尝试，计算以该位置为中心的最长回文长度。
 * 中心位置可能是一个字符（奇数长度的回文），也可能是两个字符之间的空隙（偶数长度的回文）。
 * 时间复杂度为 O(n^2)，空间复杂度为 O(1)。
 *
 * @author MaRui
 */
public class Problem5 {
    public String longestPalindrome(String s) {
        int res_start = 0; // 记录最长回文子串的起始位置
        int res_len = 0; // 记录最长回文子串的长度

        for (int i = 0; i < s.length(); i++) {
            // 奇数长度的回文子串
            int L = i, R = i;
            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                if (R - L + 1 > res_len) {
                    res_len = R - L + 1;
                    res_start = L;
                }
                --L;
                ++R;
            }

            // 偶数长度的回文子串
            L = i;
            R = i + 1;
            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                if (R - L + 1 > res_len) {
                    res_len = R - L + 1;
                    res_start = L;
                }
                --L;
                ++R;
            }
        }

        // 根据最长回文子串的起始位置和长度截取并返回结果
        return s.substring(res_start, res_start + res_len);
    }
}