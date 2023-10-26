package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 22:24
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Dog extends Pet{
    private String strain;


    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public void print(){
        super.print();
        System.out.println(
                "strain='" + strain + '\''
               );
    }
    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}
