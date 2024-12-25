package top.homework.设计模式.实验8.享元;
/*
 * @author  MaRui
 * @date  2024/12/5 10:36
 * @version 1.0
 */


/**
 * @author MaRui
 */
class Text57 {
    private final TextFlyweight57 flyweight; // 共享的内部状态
    private String color;                    // 外部状态
    private int size;                        // 外部状态

    public Text57(TextFlyweight57 flyweight, String color, int size) {
        this.flyweight = flyweight;
        this.color = color;
        this.size = size;
    }

    public void display() {
        System.out.println("Displaying text: " + flyweight.getContent()
                + ", Color: " + color + ", Size: " + size);
    }
}
