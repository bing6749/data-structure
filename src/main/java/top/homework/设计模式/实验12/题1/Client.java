package top.homework.设计模式.实验12.题1;
/*
 * @author  MaRui
 * @date  2024/12/25 15:53
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        UserInfoDTO57 userInfo = new UserInfoDTO57();
        Caretaker57 caretaker = new Caretaker57();

        userInfo.setAccount("user123");
        userInfo.setPassword("password123");
        userInfo.setTelNo("1234567890");

        caretaker.setMemento(userInfo.saveMemento());

        userInfo.setAccount("newUser");
        userInfo.setPassword("newPassword");
        userInfo.setTelNo("0987654321");

        System.out.println("修改后:");
        userInfo.show();

        userInfo.restoreMemento(caretaker.getMemento());

        System.out.println("恢复后:");
        userInfo.show();
    }
}