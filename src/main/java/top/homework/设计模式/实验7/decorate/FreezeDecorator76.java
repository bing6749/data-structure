package top.homework.设计模式.实验7.decorate;

public class FreezeDecorator76 extends BookDecorator76 {
    private boolean isFrozen = false;

    public FreezeDecorator76(Book76 book76) {
        super(book76);
    }

    @Override
    public void borrow() {
        if (isFrozen) {
            System.out.println("书籍已被冻结，无法借出");
        } else {
            super.borrow();
        }
    }

    @Override
    public void freeze() {
        isFrozen = true;
        System.out.println("书籍已被冻结");
    }
}
