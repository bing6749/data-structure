package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/8/4 16:18
 * @version 1.0
 */


import java.util.Stack;

/**
 * 20. 有效的括号
 * @author MaRui
 */
public class Problem20 {
    /**
     * 判断输入的字符串是否是有效的括号字符串
     * @param s 输入的字符串
     * @return 如果是有效的括号字符串则返回 true，否则返回 false
     */
    public static boolean isValid(String s) {
        // 如果字符串长度为奇数，不可能是有效的括号字符串
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<String> stack = new Stack<>();
        // 遍历字符串中的每个字符
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            // 如果是左括号，压入栈中
            if (str.equals("(") || str.equals("[") || str.equals("{")) {
                stack.push(str);
            } else {
                // 如果是右括号，检查栈是否为空
                if (stack.isEmpty()) {
                    return false;
                }
                String pop = stack.pop();
                // 检查右括号是否与栈顶的左括号匹配
                if (str.equals(")") && !pop.equals("(")) {
                    return false;
                }
                if (str.equals("]") && !pop.equals("[")) {
                    return false;
                }
                if (str.equals("}") && !pop.equals("{")) {
                    return false;
                }
            }
        }
        // 如果栈为空，说明所有括号都匹配
        return stack.isEmpty();
    }
}
