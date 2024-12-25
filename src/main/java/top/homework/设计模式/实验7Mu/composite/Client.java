package top.homework.设计模式.实验7Mu.composite;

public class Client {
    public static void main(String[] args) {
        MyElement57 pear = new Pear57();
        MyElement57 apple = new Apple57();
        MyElement57 banana = new Banana57();
        MyElement57 plate = new Plate57();
        plate.add(pear);
        plate.add(apple);
        plate.add(banana);
        plate.eat();
        pear.add(new Pear57());
        apple.delete(new Apple57());
    }
}
