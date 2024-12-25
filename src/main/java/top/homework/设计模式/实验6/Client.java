package top.homework.设计模式.实验6;
// 抽象类：电器
abstract class Appliance57 {
    protected Brand57 brand; // 使用品牌接口作为桥接

    public Appliance57(Brand57 brand) {
        this.brand = brand;
    }

    abstract void produce();
}

// 具体类：电视机
class Television57 extends Appliance57 {
    public Television57(Brand57 brand) {
        super(brand);
    }

    @Override
    void produce() {
        System.out.print("[电视机] ");
        brand.manufacture();
    }
}

// 具体类：空调
class AirConditioner57 extends Appliance57 {
    public AirConditioner57(Brand57 brand) {
        super(brand);
    }

    @Override
    void produce() {
        System.out.print("[空调] ");
        brand.manufacture();
    }
}

// 具体类：手机
class MobilePhone57 extends Appliance57 {
    public MobilePhone57(Brand57 brand) {
        super(brand);
    }

    @Override
    void produce() {
        System.out.print("[手机] ");
        brand.manufacture();
    }
}

// 品牌接口：品牌
interface Brand57 {
    void manufacture();
}

// 具体品牌类：小米
class Mi57 implements Brand57 {
    @Override
    public void manufacture() {
        System.out.println("由小米制造");
    }
}

// 具体品牌类：海尔
class Haier57 implements Brand57 {
    @Override
    public void manufacture() {
        System.out.println("由海尔制造");
    }
}

// 具体品牌类：TCL
class TCL57 implements Brand57 {
    @Override
    public void manufacture() {
        System.out.println("由TCL制造");
    }
}

// 客户端类
public class Client {
    public static void main(String[] args) {
        // 创建不同品牌
        Brand57 mi = new Mi57();
        Brand57 haier = new Haier57();
        Brand57 tcl = new TCL57();

        // 创建不同类型的电器并分配品牌
        Appliance57 tv = new Television57(mi);
        Appliance57 ac = new AirConditioner57(haier);
        Appliance57 phone = new MobilePhone57(tcl);

        // 生产电器
        tv.produce();
        ac.produce();
        phone.produce();

        // 通过改变品牌和电器类型组合进行新的生产
        Appliance57 newPhone = new MobilePhone57(mi);
        newPhone.produce();
    }
}
