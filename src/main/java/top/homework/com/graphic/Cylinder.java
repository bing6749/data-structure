package top.homework.com.graphic;
/*
 * @author  MaRui
 * @date  2023/12/5 21:21
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Cylinder {
    private double r;
    private double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public Cylinder() {
    }
    public double volume(){
        return (double) (Math.PI*r*r*h);
    }
}
