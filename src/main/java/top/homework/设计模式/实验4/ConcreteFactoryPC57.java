package top.homework.设计模式.实验4;
/*
 * @author  MaRui
 * @date  2024/11/7 13:16
 * @version 1.0
 */


/**
 * @author MaRui
 */
class ConcreteFactoryPC57 implements AbstractFactory57 {
    @Override
    public AbstractProductCPU57 createCPU() {
        return new ConcreteProductPCCPU57();
    }

    @Override
    public AbstractProductRAM57 createRAM() {
        return new ConcreteProductPCRAM57();
    }
}

class ConcreteFactoryMac57 implements AbstractFactory57 {
    @Override
    public AbstractProductCPU57 createCPU() {
        return new ConcreteProductMacCPU57();
    }

    @Override
    public AbstractProductRAM57 createRAM() {
        return new ConcreteProductMacRAM57();
    }
}

