package top.homework.设计模式.实验9.题二;
/*
 * @author  MaRui
 * @date  2024/12/23 15:03
 * @version 1.0
 */


import java.util.Arrays;
import java.util.List;

// 抽象处理者角色：CuisineHandler
abstract class CuisineHandler57 {
    protected CuisineHandler57 nextHandler;

    public void setNextHandler(CuisineHandler57 nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String dishName);
}

// 具体处理者：鲁菜
class LuCuisineHandler57 extends CuisineHandler57 {
    private List<String> dishes = Arrays.asList(
            "汤爆双脆", "糖醋鲤鱼", "奶汤蒲菜", "济南烤鸭", "九转大肠", "宫保鸡丁");

    @Override
    public void handleRequest(String dishName) {
        if (dishes.contains(dishName)) {
            System.out.println(dishName + " 属于鲁菜。");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(dishName);
        } else {
            System.out.println("未找到菜名所属菜系：" + dishName);
        }
    }
}

// 具体处理者：川菜
class ChuanCuisineHandler57 extends CuisineHandler57 {
    private List<String> dishes = Arrays.asList(
            "麻婆豆腐", "回锅肉", "宫保鸡丁", "盐烧白", "粉蒸肉", "夫妻肺片");

    @Override
    public void handleRequest(String dishName) {
        if (dishes.contains(dishName)) {
            System.out.println(dishName + " 属于川菜。");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(dishName);
        } else {
            System.out.println("未找到菜名所属菜系：" + dishName);
        }
    }
}

// 具体处理者：粤菜
class YueCuisineHandler57 extends CuisineHandler57 {
    private List<String> dishes = Arrays.asList(
            "龙虎斗", "白灼虾", "烤乳猪", "香芋扣肉", "黄埔炒蛋", "炖禾虫");

    @Override
    public void handleRequest(String dishName) {
        if (dishes.contains(dishName)) {
            System.out.println(dishName + " 属于粤菜。");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(dishName);
        } else {
            System.out.println("未找到菜名所属菜系：" + dishName);
        }
    }
}

