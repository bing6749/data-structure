package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 21:45
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Student {
    private String name;
    private int age;
    private String degree;

    public Student(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }
    public Student() {
    }


    public void show(){
        System.out.print("姓名："+name+"    年龄："+age+"    学位："+degree);
    }
}
