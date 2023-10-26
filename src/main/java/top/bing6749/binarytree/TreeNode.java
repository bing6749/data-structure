package top.bing6749.binarytree;
/*
 * @author  MaRui
 * @date  2023/8/19 14:40
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(TreeNode left, int val, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + String.valueOf(val) +'}';
    }
}
