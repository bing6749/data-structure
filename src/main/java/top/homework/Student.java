package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 21:45
 * @version 1.0
 */


/**
 * @author MaRui
 */
public abstract class Student {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public abstract void show();
}
