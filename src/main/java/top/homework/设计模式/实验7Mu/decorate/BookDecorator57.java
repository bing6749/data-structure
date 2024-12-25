package top.homework.设计模式.实验7Mu.decorate;

abstract class BookDecorator57 implements Book57 {
    protected Book57 book57;

    public BookDecorator57(Book57 book57) {
        this.book57 = book57;
    }

    @Override
    public void borrow() {
        book57.borrow();
    }

    @Override
    public void returnBook() {
        book57.returnBook();
    }

    public void freeze() {
        throw new UnsupportedOperationException("不能冻结普通书籍");
    }

    public void lose() {
        throw new UnsupportedOperationException("不能遗失普通书籍");
    }
}
