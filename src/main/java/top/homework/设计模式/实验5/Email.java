package top.homework.设计模式.实验5;
/*
 * @author  MaRui
 * @date  2024/11/14 14:54
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Email implements Cloneable {
    private Attachment attachment = null;
    private String emailTitle;
    private int emailLevel;
    public Email() {
        this.attachment = new Attachment();
    }
    public Email(String emailTitle, int emailLevel) {
        this.attachment = new Attachment();
        this.emailTitle = emailTitle;
        this.emailLevel = emailLevel;
    }
    @Override
    public Object clone() {
        Email clone = null;
        try {
            clone = (Email) super.clone();
// 浅克隆 attachment 对象
            clone.attachment = this.attachment;
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure!");
        }
        return clone;
    }
    public Attachment getAttachment() {
        return attachment;
    }
    public String getEmailTitle() {
        return emailTitle;
    }
    public int getEmailLevel() {
        return emailLevel;
    }
    public void display() {
        System.out.println("查看邮件");
    }
}