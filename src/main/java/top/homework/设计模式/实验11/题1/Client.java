package top.homework.设计模式.实验11.题1;
/*
 * @author  MaRui
 * @date  2024/12/25 10:11
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        Class57 class57 = new Class57();
        class57.addStudent(new Student57("wcb", 20, "男"));
        class57.addStudent(new Student57("mjx", 22, "男"));
        class57.addStudent(new Student57("wyd", 19, "女"));

        // 使用迭代器遍历并输出学生信息
        for (Student57 student : class57) {
            System.out.println(student);
        }
    }
}