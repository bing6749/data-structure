package top.homework.设计模式.实验5;
/*
 * @author  MaRui
 * @date  2024/11/14 14:56
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        PrintSpoolerSingleton57 ps1, ps2, ps3, ps4;

        try {
            ps1 = PrintSpoolerSingleton57.getInstance();
            ps1.manageJobs();
            System.out.println("---------------------");

            ps2 = PrintSpoolerSingleton57.getInstance();
            ps2.manageJobs();
            System.out.println("---------------------");

            ps3 = PrintSpoolerSingleton57.getInstance();
            ps3.manageJobs();
            System.out.println("---------------------");

            ps4 = PrintSpoolerSingleton57.getInstance();
            ps4.manageJobs();
            System.out.println("---------------------");

            ps2 = PrintSpoolerSingleton57.getInstance(2);
            ps2.manageJobs();
            System.out.println("---------------------");

            ps4 = PrintSpoolerSingleton57.getInstance(4);
            ps4.manageJobs();
        } catch (PrintSpoolerException57 e) {
            System.out.println(e.getMessage());
        }
    }
}

