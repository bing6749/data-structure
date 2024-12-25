package top.homework.设计模式.实验9;
/*
 * @author  MaRui
 * @date  2024/12/23 14:26
 * @version 1.0
 */


/**
 * @author MaRui
 */
// 定义桌面快捷方式接口
interface Shortcut57 {
    void run();
}

// 应用程序类，实际运行的程序
class Application57 implements Shortcut57 {
    private String appName;

    public Application57(String appName) {
        this.appName = appName;
    }

    @Override
    public void run() {
        System.out.println(appName + " 应用正在启动...");
    }
}

// 桌面快捷方式代理类
class ShortcutProxy57 implements Shortcut57 {
    private Application57 application; // 代理的实际应用
    private String appName;

    public ShortcutProxy57(String appName) {
        this.appName = appName;
    }

    @Override
    public void run() {
        // 延迟加载实际应用，只有当需要运行时才实例化
        if (application == null) {
            application = new Application57(appName);
        }
        System.out.println("通过快捷方式启动应用...");
        application.run();
    }
}

