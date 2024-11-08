package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 22:12
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Teacher extends Persion{
    private int kechou;
    private int keshu;

    public Teacher() {
    }

    public Teacher(String name, String career, int salary, int kechou, int keshu) {
        super(name, career, salary);
        this.kechou = kechou;
        this.keshu = keshu;
    }
    public void show(){
        super.show();
        System.out.print(kechou+"元/节");
        System.out.println(keshu+"节/年");
    }
}
