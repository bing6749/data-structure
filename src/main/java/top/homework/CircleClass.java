package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/27 16:16
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class CircleClass implements CircleInterface{
    public double r;

    public CircleClass() {
    }




    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public CircleClass(double r) {
        this.r = r;
    }

    @Override
    public void circleArea() {
        System.out.println(r*PI*PI);
    }
}
