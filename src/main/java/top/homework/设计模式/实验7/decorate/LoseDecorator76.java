package top.homework.设计模式.实验7.decorate;

public class LoseDecorator76 extends BookDecorator76 {
    private boolean isLost = false;

    public LoseDecorator76(Book76 book76) {
        super(book76);
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
