package top.homework.设计模式.题目二;
/*
 * @author  MaRui
 * @date  2024/11/7 10:07
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Character57 {
    private String gender;
    private String outfit;
    private String hairstyle;

    public Character57(String gender, String outfit, String hairstyle) {
        this.gender = gender;
        this.outfit = outfit;
        this.hairstyle = hairstyle;
    }

    public void display() {
        System.out.println("性别: " + gender);
        System.out.println("服装: " + outfit);
        System.out.println("发型: " + hairstyle);
    }
}

