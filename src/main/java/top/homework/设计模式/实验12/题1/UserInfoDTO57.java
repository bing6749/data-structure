package top.homework.设计模式.实验12.题1;
/*
 * @author  MaRui
 * @date  2024/12/25 15:59
 * @version 1.0
 */


/**
 * @author MaRui
 */
class UserInfoDTO57 {
    private String account;
    private String password;
    private String telNo;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    // 创建备忘录
    public Memento57 saveMemento() {
        return new Memento57(account, password, telNo);
    }

    // 恢复备忘录
    public void restoreMemento(Memento57 memento) {
        this.account = memento.getAccount();
        this.password = memento.getPassword();
        this.telNo = memento.getTelNo();
    }

    // 显示信息
    public void show() {
        System.out.println("Account: " + account);
        System.out.println("Password: " + password);
        System.out.println("TelNo: " + telNo);
    }
}

// 备忘录类
class Memento57 {
    private final String account;
    private final String password;
    private final String telNo;

    public Memento57(String account, String password, String telNo) {
        this.account = account;
        this.password = password;
        this.telNo = telNo;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getTelNo() {
        return telNo;
    }
}

// 负责人类
class Caretaker57 {
    private Memento57 memento;

    public Memento57 getMemento() {
        return memento;
    }

    public void setMemento(Memento57 memento) {
        this.memento = memento;
    }
}
