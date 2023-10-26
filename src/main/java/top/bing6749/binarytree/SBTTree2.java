package top.bing6749.binarytree;
/*
 * @author  MaRui
 * @date  2023/10/6 17:17
 * @version 1.0
 */


/**
 * 二叉搜索树
 * @author MaRui
 */
public class SBTTree2<T extends Comparable<T>,V> {
    BSTNode<T,V> root;   //根节点
    static class BSTNode<T,V>{
        T key;
        V value;
        BSTNode<T,V> left;
        BSTNode<T,V> right;

        public BSTNode(T key) {
            this.key = key;
        }

        public BSTNode(T key, V value) {
            this.key = key;
            this.value = value;
        }

        public BSTNode(T key, V value, BSTNode<T,V> left, BSTNode<T,V> right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public V get(T key){
        return doGet(root,key);
    }

    private V doGet(BSTNode<T,V> node,T key){
        while(node!= null){
            if (key.compareTo(node.key)<0) {
                node = node.left;
            }else if(key.compareTo(node.key)>0){
                node = node.right;
            }else{
                return node.value;
            }

        }
        return null;
    }
    public Object delete(int key){
        return null;
    }
    private BSTNode doDelete(BSTNode<T,V> node,T key){
        if (node == null){
            return null;
        }
        if (key.compareTo(node.key)<0){
            node.left = doDelete(node.left,key);
            return node;
        }
        return null;
    }
}
