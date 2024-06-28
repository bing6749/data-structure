package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 21:45
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Undergraduate extends Student{
    private String specialty;
    public void show(){
        System.out.print("姓名："+ super.getName() +"    年龄："+super.getAge()+"    学位："+getDegree());

        System.out.println("    专业："+this.specialty);
    }

    public Undergraduate(String name, int age, String degree, String specialty) {
        super(name, age, degree);
        this.specialty = specialty;
    }

    public Undergraduate() {
    }
}
