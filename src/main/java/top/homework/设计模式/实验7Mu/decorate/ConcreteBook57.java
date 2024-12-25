package top.homework.设计模式.实验7Mu.decorate;

public class ConcreteBook57 implements Book57 {
    private String title;

    public ConcreteBook57(String title) {
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