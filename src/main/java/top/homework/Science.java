package top.homework;
/*
 * @author  MaRui
 * @date  2023/10/19 22:16
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Science extends Persion{
    private int keyanjili;

    public Science() {
    }

    public Science(String name, String career, int salary, int keyanjili) {
        super(name, career, salary);
        this.keyanjili = keyanjili;
    }

    public void show(){
        super.show();
        System.out.print(keyanjili+"元/季度");
    }
}
