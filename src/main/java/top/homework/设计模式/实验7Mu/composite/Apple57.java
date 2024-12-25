package top.homework.设计模式.实验7Mu.composite;
public class Apple57 implements MyElement57 {
    @Override
    public void eat() {
        System.out.println("Eating an apple.");
    }
    @Override
    public void add(MyElement57 element) {
        System.out.println("Cannot add to a leaf node.");
    }
    @Override
    public void delete(MyElement57 element) {
        System.out.println("Cannot delete from a leaf node.");
    }
}
