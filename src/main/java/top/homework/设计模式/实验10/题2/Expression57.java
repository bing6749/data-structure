package top.homework.设计模式.实验10.题2;
/*
 * @author  MaRui
 * @date  2024/12/24 15:01
 * @version 1.0
 */


/**
 * @author MaRui
 */
interface Expression57 {
    boolean interpret();
}
// 常量表达式类，表示 0 或 1
class Constant57 implements Expression57 {
    private boolean value;

    public Constant57(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret() {
        return value;
    }
}
// 与运算表达式类
class AndExpression57 implements Expression57 {
    private Expression57 left;
    private Expression57 right;

    public AndExpression57(Expression57 left, Expression57 right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() && right.interpret();
    }
}
// 或运算表达式类
class OrExpression57 implements Expression57 {
    private Expression57 left;
    private Expression57 right;

    public OrExpression57(Expression57 left, Expression57 right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() || right.interpret();
    }
}
// 表达式解析器，用于将字符串解析为表达式
class Parser57 {
    public static Expression57 parse(String expression) {
        String[] tokens = expression.split(" ");
        return buildExpression(tokens);
    }

    private static Expression57 buildExpression(String[] tokens) {
        Expression57 result = null;
        Expression57 left = null;

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            switch (token) {
                case "0":
                    left = new Constant57(false);
                    break;
                case "1":
                    left = new Constant57(true);
                    break;
                case "and":
                    Expression57 rightAnd = new Constant57(tokens[++i].equals("1"));
                    left = new AndExpression57(left, rightAnd);
                    break;
                case "or":
                    Expression57 rightOr = new Constant57(tokens[++i].equals("1"));
                    left = new OrExpression57(left, rightOr);
                    break;
            }
            result = left;
        }
        return result;
    }
}

