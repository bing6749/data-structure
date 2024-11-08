package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 22:22
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Pet {
    private String name;
    private int health;
    private int love;


    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public void print(){
        System.out.print(
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                '}');
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
