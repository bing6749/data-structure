package top.bing6749.binarytree;
/*
 * @author  MaRui
 * @date  2023/8/19 14:42
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(new TreeNode(new TreeNode(4), 2, null),
                1,
                new TreeNode(new TreeNode(5), 3, new TreeNode(6))
        );
        inOrder(root);
    }

    public static void preOrder(TreeNode node) {
        if (node == null){
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);   //左孩子
        preOrder(node.right);   //右孩子
    }
    public static void inOrder(TreeNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);   //左孩子
        System.out.println(node.val);
        inOrder(node.right);   //右孩子

    }
    public static void postOrder(TreeNode node){
        if (node == null){
            return;
        }
        postOrder(node.left);   //左孩子
        postOrder(node.right);   //右孩子
        System.out.println(node.val);

    }
}
