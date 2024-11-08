package top.homework.设计模式.实验4;
/*
 * @author  MaRui
 * @date  2024/11/7 13:19
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        // 从 XML 文件中读取工厂配置（模拟）
        AbstractFactory57 factory = getFactoryFromConfig("config.xml");

        AbstractProductCPU57 cpu = factory.createCPU();
        AbstractProductRAM57 ram = factory.createRAM();

        cpu.displayCPU();
        ram.displayRAM();
    }

    // 模拟从 XML 文件中读取工厂类名称并实例化
    private static AbstractFactory57 getFactoryFromConfig(String configFilePath) {
        // 此处省略具体 XML 解析逻辑
        String factoryClassName = "ConcreteFactoryPC57"; // 假设读取到的是 PC 工厂

        if ("ConcreteFactoryPC57".equals(factoryClassName)) {
            return new ConcreteFactoryPC57();
        } else if ("ConcreteFactoryMac57".equals(factoryClassName)) {
            return new ConcreteFactoryMac57();
        } else {
            throw new IllegalArgumentException("Unknown factory type in config.");
        }
    }
}

