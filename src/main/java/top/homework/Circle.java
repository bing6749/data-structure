package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/27 16:10
 * @version 1.0
 */


/**
 * @author MaRui
 */
public  class Circle implements Shape{

    @Override
    public double area(double i) {
        return Math.PI*Math.sqrt(i);
    }
}
