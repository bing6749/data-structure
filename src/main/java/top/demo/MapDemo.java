package top.demo;
/*
 * @author  MaRui
 * @date  2024/11/6 15:25
 * @version 1.0
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MaRui
 */
public class MapDemo {
    private static void testGetOrDefault(){
        Map<String, String> map = new HashMap<>(4);
        map.put("a", "apple");
        String key = "a";
        String defalutValue = "default";

        // key不存在，返回默认值
        String orDefault = map.getOrDefault(key, defalutValue);
        System.out.println("key如果不存在，返回默认值：" + orDefault);
    }
    private static void testForEach(){
        Map<String, String> map = new HashMap<>(4);
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "cherry");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
    private static void testMerge() {
        Map<String, Integer> cntMap = new HashMap<>(8);
        List<String> list = Arrays.asList("apple", "orange", "banana", "orange");

        // 老写法
        /*for (String item : list) {
            if (cntMap.containsKey(item)) {
                cntMap.put(item, cntMap.get(item) + 1);
            } else {
                cntMap.put(item, 1);
            }
        }*/

        // 新写法
        for (String item : list) {
            cntMap.merge(item, 1, Integer::sum);
        }
    }
    public static void main(String[] args) {
        testMerge();
    }
}
