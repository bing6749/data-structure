package top.homework.设计模式.实验3;
/*
 * @author  MaRui
 * @date  2024/10/24 9:28
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Triangle");
    }
}