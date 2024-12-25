package top.homework.设计模式.实验8.享元;
/*
 * @author  MaRui
 * @date  2024/12/5 10:37
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory57 factory = new FlyweightFactory57();

        // 获取共享的 Flyweight 对象
        TextFlyweight57 flyweight1 = factory.getFlyweight("Hello");
        TextFlyweight57 flyweight2 = factory.getFlyweight("World");
        TextFlyweight57 flyweight3 = factory.getFlyweight("Hello"); // 共享对象

        // 使用不同的外部状态
        Text57 text1 = new Text57(flyweight1, "Red", 12);
        Text57 text2 = new Text57(flyweight2, "Blue", 16);
        Text57 text3 = new Text57(flyweight3, "Green", 12);

        // 显示文本
        text1.display();
        text2.display();
        text3.display();

        // 验证共享对象是否相同
        System.out.println("Flyweight1 and Flyweight3 are the same: " + (flyweight1 == flyweight3));
    }
}