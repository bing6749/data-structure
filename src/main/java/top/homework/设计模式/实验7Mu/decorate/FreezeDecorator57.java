package top.homework.设计模式.实验7Mu.decorate;

public class FreezeDecorator57 extends BookDecorator57 {
    private boolean isFrozen = false;

    public FreezeDecorator57(Book57 book57) {
        super(book57);
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
