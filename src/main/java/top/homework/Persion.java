package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 22:10
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Persion {
    private String name;
    private String career;
    private int salary;

    public Persion() {
    }

    public Persion(String name, String career, int salary) {
        this.name = name;
        this.career = career;
        this.salary = salary;
    }
    public void show(){
        System.out.println("姓名"+name+"职业"+career+"固定工资"+salary);
    }
}
