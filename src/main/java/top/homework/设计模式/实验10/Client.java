package top.homework.设计模式.实验10;
/*
 * @author  MaRui
 * @date  2024/12/24 14:45
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        // 创建接收者对象
        ExitClass57 exitClass = new ExitClass57();
        HelpClass57 helpClass = new HelpClass57();

        // 创建命令对象
        Command57 exitCommand = new ExitCommand57(exitClass);
        Command57 helpCommand = new HelpCommand57(helpClass);

        // 创建功能键对象
        FunctionButton57 button1 = new FunctionButton57("退出");
        FunctionButton57 button2 = new FunctionButton57("帮助");

        // 为功能键绑定命令
        button1.setCommand(exitCommand);
        button2.setCommand(helpCommand);

        // 模拟用户操作
        button1.press();
        button2.press();

        // 动态修改功能键绑定的命令
        button1.setCommand(helpCommand);
        button1.press();
    }
}