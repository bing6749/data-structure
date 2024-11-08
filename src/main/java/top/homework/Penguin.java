package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 22:26
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Penguin extends Pet{
    private String sex;

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }
    public void print(){
        super.print();
        System.out.println("sex='" + sex + '\'');
    }


}
