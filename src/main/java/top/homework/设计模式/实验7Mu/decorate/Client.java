package top.homework.设计模式.实验7Mu.decorate;

public class Client {
    public static void main(String[] args) {
        Book57 book57 = new ConcreteBook57("设计模式");
        book57.borrow();
        book57.returnBook();

        Book57 freezeBook57 = new FreezeDecorator57(book57);
        if (freezeBook57 instanceof FreezeDecorator57) {
            ((FreezeDecorator57) freezeBook57).freeze();
        }
        freezeBook57.borrow();

        Book57 loseBook57 = new LoseDecorator57(book57);
        if (loseBook57 instanceof LoseDecorator57) {
            ((LoseDecorator57) loseBook57).lose();
        }
        loseBook57.returnBook();
    }
}
