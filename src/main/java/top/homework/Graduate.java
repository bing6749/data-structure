package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 22:00
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Graduate extends Student{
    private String direction;

    public void show(){
        System.out.print("姓名："+ super.getName() +"    年龄："+super.getAge()+"    学位："+getDegree());
        System.out.println("    研究方向"+this.direction);
    }

    public Graduate(String name, int age, String degree, String direction) {
        super(name, age, degree);
        this.direction = direction;
    }

    public Graduate() {
    }
}
