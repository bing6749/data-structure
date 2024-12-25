package top.homework.设计模式.实验11.题2;
/*
 * @author  MaRui
 * @date  2024/12/25 10:23
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        // 创建中介者：联合国
        UnitedNations57 un = new UnitedNations57();

        // 创建具体同事类：中国和美国
        China57 china = new China57(un);
        USA57 usa = new USA57(un);

        // 设置中介者的同事
        un.setChina(china);
        un.setUSA(usa);

        // 中国发送消息
        china.sendMessage("中国提议加强全球气候合作。");

        // 美国发送消息
        usa.sendMessage("美国支持加强全球气候合作。");
    }
}
