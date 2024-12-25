package top.homework.设计模式.实验9.题二;
/*
 * @author  MaRui
 * @date  2024/12/23 15:04
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        // 创建具体的处理者
        CuisineHandler57 luCuisine = new LuCuisineHandler57();
        CuisineHandler57 chuanCuisine = new ChuanCuisineHandler57();
        CuisineHandler57 yueCuisine = new YueCuisineHandler57();

        // 设置职责链顺序
        luCuisine.setNextHandler(chuanCuisine);
        chuanCuisine.setNextHandler(yueCuisine);

        // 测试查询功能
        String[] dishesToTest = {"麻婆豆腐", "九转大肠", "烤乳猪", "未知菜品"};
        for (String dish : dishesToTest) {
            luCuisine.handleRequest(dish);
        }
    }
}
