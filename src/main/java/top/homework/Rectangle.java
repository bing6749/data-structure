package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/27 16:04
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Rectangle extends Graphics{
    private int chang;
    private int kuan;

    public Rectangle(String name, int chang, int kuan) {
        super(name);
        this.chang = chang;
        this.kuan = kuan;
    }

    @Override
    public void parameter() {
        System.out.print("名称："+super.getName());
        System.out.println("长："+chang+"    宽："+kuan);
    }

    @Override
    public void area() {
        System.out.print("    面积："+this.chang*this.kuan);
    }
}
