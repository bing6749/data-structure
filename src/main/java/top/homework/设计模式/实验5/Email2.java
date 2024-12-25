package top.homework.设计模式.实验5;
/*
 * @author  MaRui
 * @date  2024/11/14 15:02
 * @version 1.0
 */


import java.io.*;

/**
 * @author MaRui
 */
public class Email2 implements Serializable {
    private Attachment attachment = null;
    private String emailTitle;
    private int emailLevel;
    public Email2() {
        this.attachment = new Attachment();
    }
    public Email2(String emailTitle, int emailLevel) {
        this.attachment = new Attachment();
        this.emailTitle = emailTitle;
        this.emailLevel = emailLevel;
    }
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
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
