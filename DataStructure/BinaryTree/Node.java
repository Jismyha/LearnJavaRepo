package DataStructure.BinaryTree;

/**
 * 树的节点类
 * 
 * @author KureNaii
 * @since 2021-09-21 19:02:55
 */
public class Node {
    private int key;
    private double data;
    private Node leftNode;
    private Node rightNode;

    public Node(int key, int data, Node left, Node right) {
        this.key = key;
        this.data = data;
        this.leftNode = left;
        this.rightNode = right;
    }
}
