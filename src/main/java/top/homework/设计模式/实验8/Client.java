package top.homework.设计模式.实验8;
/*
 * @author  MaRui
 * @date  2024/12/5 8:45
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        // 创建外观对象
        Computer57 computer = new Computer57();
        // 启动计算机
        computer.on();
    }
}