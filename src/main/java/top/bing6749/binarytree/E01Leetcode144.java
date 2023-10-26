package top.bing6749.binarytree;
/*
 * @author  MaRui
 * @date  2023/8/21 11:01
 * @version 1.0
 */


import java.util.LinkedList;
import java.util.List;

/**
 * @author MaRui
 */
public class E01Leetcode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(new TreeNode(new TreeNode(4), 2, null),
                1,
                new TreeNode(new TreeNode(5), 3, new TreeNode(6))
        );

        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode curr = root;
        TreeNode pop = null;//最近一次弹栈的元素
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
//                System.out.println("前"+curr.val);
                //待处理左子树
                curr = curr.left;
            } else {
                TreeNode peek = stack.peek();
                //没有右子树
                if (peek.right == null) {
                    pop = stack.pop();
//                    System.out.println("中"+peek.val);
                    System.out.println("后"+pop.val);
                //右子树处理完成
                } else if (peek.right == pop) {
                    pop = stack.pop();
                    System.out.println("后"+pop.val);
                }
                //待处理右子树
                else {
//                    System.out.println("中"+peek.val);
                    curr = peek.right;
                }
            }


        }
    }
}
