package top.homework.设计模式.实验7Mu.decorate;

public class LoseDecorator57 extends BookDecorator57 {
    private boolean isLost = false;

    public LoseDecorator57(Book57 book57) {
        super(book57);
    }

    @Override
    public void returnBook() {
        if (isLost) {
            System.out.println("书籍已遗失，无法归还");
        } else {
            super.returnBook();
        }
    }

    @Override
    public void lose() {
        isLost = true;
        System.out.println("书籍已遗失");
    }
}
