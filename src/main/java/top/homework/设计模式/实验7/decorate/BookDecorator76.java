package top.homework.设计模式.实验7.decorate;

abstract class BookDecorator76 implements Book76 {
    protected Book76 book76;

    public BookDecorator76(Book76 book76) {
        this.book76 = book76;
    }

    @Override
    public void borrow() {
        book76.borrow();
    }

    @Override
    public void returnBook() {
        book76.returnBook();
    }

    public void freeze() {
        throw new UnsupportedOperationException("不能冻结普通书籍");
    }

    public void lose() {
        throw new UnsupportedOperationException("不能遗失普通书籍");
    }
}
