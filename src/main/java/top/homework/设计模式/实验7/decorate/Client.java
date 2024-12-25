package top.homework.设计模式.实验7.decorate;

public class Client {
    public static void main(String[] args) {
        Book76 book76 = new ConcreteBook76("设计模式");
        book76.borrow();
        book76.returnBook();

        Book76 freezeBook76 = new FreezeDecorator76(book76);
        if (freezeBook76 instanceof FreezeDecorator76) {
            ((FreezeDecorator76) freezeBook76).freeze();
        }
        freezeBook76.borrow();

        Book76 loseBook76 = new LoseDecorator76(book76);
        if (loseBook76 instanceof LoseDecorator76) {
            ((LoseDecorator76) loseBook76).lose();
        }
        loseBook76.returnBook();
    }
}
