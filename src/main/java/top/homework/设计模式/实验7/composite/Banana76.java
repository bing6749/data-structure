package top.homework.设计模式.实验7.composite;

public class Banana76 implements MyElement76 {
    @Override
    public void eat() {
        System.out.println("Eating a banana.");
    }
    @Override
    public void add(MyElement76 element) {
        System.out.println("Cannot add to a leaf node.");
    }
    @Override
    public void delete(MyElement76 element) {
        System.out.println("Cannot delete from a leaf node.");
    }
}
