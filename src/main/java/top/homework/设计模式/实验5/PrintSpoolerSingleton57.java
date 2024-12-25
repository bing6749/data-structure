package top.homework.设计模式.实验5;
/*
 * @author  MaRui
 * @date  2024/11/14 15:18
 * @version 1.0
 */



import java.util.ArrayList;
import java.util.Random;

public class PrintSpoolerSingleton57 {
    private static ArrayList<PrintSpoolerSingleton57> instances = new ArrayList<>();
    private static final int MAX_INSTANCES = 3;

    private PrintSpoolerSingleton57() {}

    public static PrintSpoolerSingleton57 getInstance(int i) throws PrintSpoolerException57 {
        if (i < 1 || i > MAX_INSTANCES || i > instances.size()) {
            throw new PrintSpoolerException57("无效的实例编号!");
        }
        return instances.get(i - 1);
    }

    public static PrintSpoolerSingleton57 getInstance() {
        if (instances.size() < MAX_INSTANCES) {
            PrintSpoolerSingleton57 newInstance = new PrintSpoolerSingleton57();
            instances.add(newInstance);
            System.out.println("创建新的打印池，当前实例数：" + instances.size());
            return newInstance;
        }
        Random rand = new Random();
        return instances.get(rand.nextInt(MAX_INSTANCES));
    }

    public void manageJobs() {
        System.out.println("管理打印任务!");
    }
}
