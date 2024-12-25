package top.homework.设计模式.实验8.享元;
/*
 * @author  MaRui
 * @date  2024/12/5 10:36
 * @version 1.0
 */


import java.util.HashMap;

/**
 * @author MaRui
 */

class FlyweightFactory57 {
    private HashMap<String, TextFlyweight57> flyweights = new HashMap<>();

    public TextFlyweight57 getFlyweight(String content) {
        // 如果不存在共享对象则创建，否则直接返回
        if (!flyweights.containsKey(content)) {
            flyweights.put(content, new TextFlyweight57(content));
        }
        return flyweights.get(content);
    }
}