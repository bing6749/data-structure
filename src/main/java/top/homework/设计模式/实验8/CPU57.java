package top.homework.设计模式.实验8;
/*
 * @author  MaRui
 * @date  2024/12/5 8:45
 * @version 1.0
 */


/**
 * @author MaRui
 */
// CPU 子系统
class CPU57 {
    public void run() throws Exception {
        System.out.println("CPU is running...");
        // 模拟异常
        if (Math.random() < 0.2) {
            throw new Exception("CPU failed to start!");
        }
    }
}

// Memory 子系统
class Memory57 {
    public void check() throws Exception {
        System.out.println("Memory is checking...");
        // 模拟异常
        if (Math.random() < 0.2) {
            throw new Exception("Memory check failed!");
        }
    }
}

// HardDisk 子系统
class HardDisk57 {
    public void read() throws Exception {
        System.out.println("HardDisk is reading...");
        // 模拟异常
        if (Math.random() < 0.2) {
            throw new Exception("HardDisk read error!");
        }
    }
}

// OS 子系统
class OS57 {
    public void load() throws Exception {
        System.out.println("Operating System is loading...");
        // 模拟异常
        if (Math.random() < 0.2) {
            throw new Exception("OS load failed!");
        }
    }
}
