package top.homework.设计模式.实验7.decorate;

public class ConcreteBook76 implements Book76 {
    private String title;

    public ConcreteBook76(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println(title + " 被借出");
    }

    @Override
    public void returnBook() {
        System.out.println(title + " 被归还");
    }
}