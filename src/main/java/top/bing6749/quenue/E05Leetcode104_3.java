package top.bing6749.quenue;
/*
 * @author  MaRui
 * @date  2023/9/16 13:04
 * @version 1.0
 */


import top.bing6749.binarytree.TreeNode;

import java.util.LinkedList;

/**
 * @author MaRui
 */
public class E05Leetcode104_3 {
    public int maxDepth(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode poll = queue.poll();
            if (poll.left!= null){
                queue.offer(poll.left);
            }
            if (poll.right!= null){
                queue.offer(poll.right);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
