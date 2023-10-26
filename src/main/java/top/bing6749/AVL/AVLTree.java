package top.bing6749.AVL;
/*
 * @author  MaRui
 * @date  2023/10/12 21:57
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class AVLTree {
    static class AVLNode {
        int key;
        Object value;
        AVLNode left;
        AVLNode right;
        int height = 1;

        public AVLNode(int key, Object value, AVLNode left, AVLNode right, int height) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.height = height;
        }

        public AVLNode(int key) {
            this.key = key;
        }

        public AVLNode(int key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    //求节点高度
    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    //更新节点高度（新增、删除、旋转）
    private void updateHeight(AVLNode node) {
        node.height = Integer.max(height(node.left), height(node.right)) + 1;
    }

    //平衡因子
    private int bf(AVLNode node) {
        return height(node.left) - height(node.right);
    }


    //右旋，返回值表示新的根节点
    private AVLNode rightRotate(AVLNode node) {
        AVLNode left = node.left;
        node.left = left.right;
        left.right = node;
        updateHeight(left);
        updateHeight(node);
        return left;
    }

    //左旋，返回值表示新的根节点
    private AVLNode leftRotate(AVLNode node) {
        AVLNode right = node.right;
        node.right = right.left;
        right.left = node;
        updateHeight(right);
        updateHeight(node);
        return right;
    }

    //左右旋，返回值表示新的根节点
    private AVLNode leftRightRotate(AVLNode node) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }

    //右左旋，返回值表示新的根节点
    private AVLNode rightLeftRotate(AVLNode node) {
        node.right = leftRotate(node.right);
        return leftRotate(node);
    }

    //检查节点是否失衡，重新平衡代码
    private AVLNode balance(AVLNode node) {
        if (node == null) {
            return null;
        }
        int bf = bf(node);
        if (bf > 1 && bf(node.left) >= 0) {
            return rightRotate(node);
        } else if (bf > 1 && bf(node.left) < 0) {
            return leftRightRotate(node);
        } else if (bf < -1 && bf(node.right) > 0) {
            return rightLeftRotate(node);
        } else if (bf < -1 && bf(node.right) <= 0) {
            return leftRotate(node);
        }
        return node;
    }
AVLNode root;
    public void put(int key,Object value){
        root = doPut(key,value,root);
    }
    private AVLNode doPut(int key, Object value,AVLNode node){
         if (node == null){
             return new AVLNode(key,value);
         }
         if (key == node.key){
             node.value = value;
             return node;
         }
        if (key<node.key){
            node.left = doPut(key, value, node.left);
        }else{
            node.right = doPut(key, value, node.right);
        }
        updateHeight(node);
        return balance(node);
    }
}
