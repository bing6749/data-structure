package top.homework.设计模式.实验10;
/*
 * @author  MaRui
 * @date  2024/12/24 14:44
 * @version 1.0
 */

interface Command57 {
    void execute();
}
// 退出系统命令
class ExitCommand57 implements Command57 {
    private ExitClass57 exitClass;

    public ExitCommand57(ExitClass57 exitClass) {
        this.exitClass = exitClass;
    }

    @Override
    public void execute() {
        exitClass.exitSystem();
    }
}
// 打开帮助界面命令
class HelpCommand57 implements Command57 {
    private HelpClass57 helpClass;

    public HelpCommand57(HelpClass57 helpClass) {
        this.helpClass = helpClass;
    }

    @Override
    public void execute() {
        helpClass.displayHelp();
    }
}
// 退出系统功能类
class ExitClass57 {
    public void exitSystem() {
        System.out.println("系统已退出！");
    }
}
// 帮助界面功能类
class HelpClass57 {
    public void displayHelp() {
        System.out.println("显示帮助界面！");
    }
}
// 功能键类
class FunctionButton57 {
    private String name;
    private Command57 command;

    public FunctionButton57(String name) {
        this.name = name;
    }

    // 设置绑定的命令
    public void setCommand(Command57 command) {
        this.command = command;
    }

    // 按下功能键，执行命令
    public void press() {
        System.out.print("按下功能键 [" + name + "]：");
        if (command != null) {
            command.execute();
        } else {
            System.out.println("未绑定任何命令！");
        }
    }
}

