package top.bing6749.binarytree;
/*
 * @author  MaRui
 * @date  2023/10/6 17:17
 * @version 1.0
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉搜索树
 *
 * @author MaRui
 */
public class SBTTree1 {
    BSTNode root;   //根节点

    static class BSTNode {
        int key;
        Object value;
        BSTNode left;
        BSTNode right;

        public BSTNode(int key) {
            this.key = key;
        }

        public BSTNode(int key, Object value) {
            this.key = key;
            this.value = value;
        }

        public BSTNode(int key, Object value, BSTNode left, BSTNode right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public Object get(int key) {
        return doGet(root, key);
    }

    private Object doGet(BSTNode node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.key) {
            return doGet(node.left, key);
        } else if (key > node.key) {
            return doGet(node.right, key);
        } else {
            return node.value;
        }
    }

    public Object min() {
        return doMin(root);
    }

    public Object min(BSTNode node) {
        return doMin(node);
    }
    private Object doMin(BSTNode node) {
        if (node == null) {
            return null;
        }
        if (node.left == null) {
            return node.value;
        } else {
            return doMin(node.left);
        }
    }

    public Object max() {
        return max(root);
    }

    private Object max(BSTNode node) {
        if (node == null) {
            return null;
        }
        BSTNode p = node;
        while (p != null) {
            p = p.right;
        }
        return p;
    }

    public void put(int key, Object value) {
        BSTNode node = root;
        BSTNode parent = null;
        while (node != null) {
            parent = node;
            if (key < node.key) {
                node = node.left;
            } else if (node.key < key) {
                node = node.right;
            } else {
                //更新
                node.value = value;
                return;
            }
        }
        if (parent == null) {
            root = new BSTNode(key, value);
            return;
        }
        //新增
        if (key < parent.key) {
            parent.left = new BSTNode(key, value);
        } else {
            parent.right = new BSTNode(key, value);
        }
    }

    //前驱值
    public Object successor(int key) {
        BSTNode node = root;
        BSTNode ancestorFromLeft = null;
        while (node != null) {
            if (key < node.key) {
                node = node.left;
            } else if (node.key < key) {
                ancestorFromLeft = node;
                node = node.right;
            } else {
                break;
            }
        }
        // 没有找到节点
        if (node == null) {
            return null;
        }
        //找到节点  节点有左子树
        if (node.left != null) {
            return max(node.left);
        }
        //找到节点  节点没有有左子树，自左面而来就是前任
        return ancestorFromLeft != null ? ancestorFromLeft.value : null;
    }

    //后继值
    public Object predecessor(int key) {
        BSTNode node = root;
        BSTNode ancestorFromRight = null;
        while (node != null) {
            if (key < node.key) {
                ancestorFromRight = node;
                node = node.left;
            } else if (node.key < key) {
                node = node.right;
            } else {
                break;
            }
        }
        if (node == null) {
            return null;
        }
        if (node.right != null) {
            return min(node.right);
        }
        return ancestorFromRight != null ? ancestorFromRight.value : null;
    }

    //根据关键字删除
    public Object delete(int key) {
        BSTNode node = root;
        BSTNode parent = null;
        while (node != null) {
            if (key < node.key) {
                 parent = node;
                node = node.left;
            } else if (node.key < key) {
                 parent = node;
                node = node.right;
            } else {
                break;
            }
        }
        if (node == null){
            return null;
        }
        if (node.left == null){
            shift(parent,node, node.right);
        } else if (node.right==null) {
            shift(parent,node, node.left);
        }else{
            BSTNode s = node.right;
            BSTNode sParent = node;
            while(s.left!=null){
                sParent = s;
                s = s.left;
            }
            if (sParent != node){   //不相邻
                shift(sParent,s, s.right);  //不可能有左孩子
                s.right = node.right;
            }
            shift(parent,node,s);
            s.left = node.left;
        }
        return node.value;
    }
    //托孤方法
    private void shift(BSTNode parent,BSTNode deleted,BSTNode child){
        if (parent == null){
            root = child;
        } else if (deleted  == parent.left) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }

    public List<Object> less(int key){
        List<Object> result = new ArrayList<>();
        BSTNode p = root;
        LinkedList<BSTNode> stack = new LinkedList<>();
        while(p!=null || !stack.isEmpty()){
            if (p!=null) {
                stack.push(p);
                p = p.left;
            }else{
                BSTNode pop = stack.pop();
                //处理值
                if (pop.key<key){
                    result.add(pop.value);
                } else {
                    break;
                }
                p = pop.right;
            }
        }
        return result;
    }
    public List<Object> greater(int key){
        List<Object> result = new ArrayList<>();
        BSTNode p = root;
        LinkedList<BSTNode> stack = new LinkedList<>();
        while(p!=null || !stack.isEmpty()){
            if (p!=null) {
                stack.push(p);
                p = p.right;
            }else{
                BSTNode pop = stack.pop();
                //处理值
                if (pop.key>key){
                    result.add(pop.value);
                }else {
                    break;
                }
                p = pop.left;
            }
        }
        return result;
    }
    public List<Object> between(int key1,int key2){
        List<Object> result = new ArrayList<>();
        BSTNode p = root;
        LinkedList<BSTNode> stack = new LinkedList<>();
        while(p!=null || !stack.isEmpty()){
            if (p!=null) {
                stack.push(p);
                p = p.left;
            }else{
                BSTNode pop = stack.pop();
                //处理值
                if (pop.key<=key2 && pop.key>=key1){
                    result.add(pop.value);
                }else if(pop.key>key2){
                    break;
                }
                p = pop.right;
            }
        }
        return result;
    }
}
