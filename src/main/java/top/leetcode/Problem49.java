package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/10/21 19:00
 * @version 1.0
 */


import java.util.*;

/**
 * 字母异位词分组
 * @author MaRui
 */
public class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 创建一个哈希表，键是排序后的字符串，值是异位词的列表
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // 将字符串转为字符数组并排序
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            // 排序后转换为字符串作为键
            String key = new String(chars);

            // 如果键不存在，初始化列表
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // 将当前字符串加入相应的列表中
            map.get(key).add(str);
        }

        // 将哈希表中的所有值（即异位词分组）返回
        return new ArrayList<>(map.values());
    }
}
