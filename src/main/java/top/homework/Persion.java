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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
