package top.homework.设计模式.实验8;
/*
 * @author  MaRui
 * @date  2024/12/5 8:45
 * @version 1.0
 */


/**
 * @author MaRui
 */
class Computer57 {
    private CPU57 cpu;
    private Memory57 memory;
    private HardDisk57 hardDisk;
    private OS57 os;

    public Computer57() {
        this.cpu = new CPU57();
        this.memory = new Memory57();
        this.hardDisk = new HardDisk57();
        this.os = new OS57();
    }

    public void on() {
        try {
            System.out.println("Starting the computer...");
            memory.check();
            cpu.run();
            hardDisk.read();
            os.load();
            System.out.println("Computer started successfully!");
        } catch (Exception e) {
            System.out.println("Computer startup failed: " + e.getMessage());
        }
    }
}

