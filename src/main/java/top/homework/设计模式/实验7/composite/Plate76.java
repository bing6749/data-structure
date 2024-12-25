package top.homework.设计模式.实验7.composite;

import java.util.ArrayList;
public class Plate76 implements MyElement76 {
    private ArrayList<MyElement76> list = new ArrayList<>();
    @Override
    public void eat() {
        for (MyElement76 element : list) {
            element.eat();
        }
    }
    @Override
    public void add(MyElement76 element) {
        list.add(element);
    }
    @Override
    public void delete(MyElement76 element) {
        list.remove(element);
    }
}
