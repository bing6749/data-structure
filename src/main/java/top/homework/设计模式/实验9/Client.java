package top.homework.设计模式.实验9;
/*
 * @author  MaRui
 * @date  2024/12/23 14:27
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个快捷方式代理
        Shortcut57 shortcut = new ShortcutProxy57("记事本");
        // 通过代理运行应用程序
        shortcut.run();
    }
}
