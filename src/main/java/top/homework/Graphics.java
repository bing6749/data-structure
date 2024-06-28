package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/27 16:02
 * @version 1.0
 */


/**
 * @author MaRui
 */
public abstract class Graphics {
    private String name;
    public abstract void parameter();
    public abstract void area();

    public Graphics(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
