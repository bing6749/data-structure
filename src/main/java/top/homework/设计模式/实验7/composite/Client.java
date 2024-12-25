package top.homework.设计模式.实验7.composite;

public class Client {
    public static void main(String[] args) {
        MyElement76 pear = new Pear76();
        MyElement76 apple = new Apple76();
        MyElement76 banana = new Banana76();
        MyElement76 plate = new Plate76();
        plate.add(pear);
        plate.add(apple);
        plate.add(banana);
        plate.eat();
        pear.add(new Pear76());
        apple.delete(new Apple76());
    }
}
