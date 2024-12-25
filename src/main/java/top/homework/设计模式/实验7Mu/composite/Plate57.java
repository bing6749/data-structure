package top.homework.设计模式.实验7Mu.composite;
import java.util.ArrayList;
public class Plate57 implements MyElement57 {
    private ArrayList<MyElement57> list = new ArrayList<>();
    @Override
    public void eat() {
        for (MyElement57 element : list) {
            element.eat();
        }
    }
    @Override
    public void add(MyElement57 element) {
        list.add(element);
    }
    @Override
    public void delete(MyElement57 element) {
        list.remove(element);
    }
}
