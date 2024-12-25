package top.homework.设计模式.实验10.题2;
/*
 * @author  MaRui
 * @date  2024/12/24 15:02
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        String[] testExpressions = {
                "1 and 0",
                "1 or 1",
                "1 or 0",
                "1 and 1",
                "0 and 0",
                "1 and 1 or 0",
                "0 or 1 and 0",
                "0 or 1 and 1 or 1",
                "1 or 0 and 1 and 0 or 0"
        };

        for (String expression : testExpressions) {
            Expression57 parsedExpression = Parser57.parse(expression);
            System.out.println("表达式: " + expression + " -> 结果: " + (parsedExpression != null ? parsedExpression.interpret() : "解析失败"));
        }
    }
}
