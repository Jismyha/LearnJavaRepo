package DataStructure.BinaryTree;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 二叉树相关操作
 * 
 * @author KureNaii
 * @since 2021-10-20 22:09:16
 */
public class BinaryTree {

    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    /**
     * 在树中查找某一个特定的值，复杂度为 O(log2N)
     * 
     * @param key
     * @return
     */
    public TreeNode find(int key) {
        TreeNode current = this.root;
        while (current != null) {
            if (key < current.val) {
                current = current.left;
            } else if (key > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }

    /**
     * 插入新节点，默认无重复节点
     * 
     * @param key
     */
    public void insert(int key) {
        TreeNode newTreeNode = new TreeNode(key);
        if (root == null) {
            root = newTreeNode;
        } else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (key < current.val) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newTreeNode;
                        newTreeNode.parent = parent;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newTreeNode;
                        newTreeNode.parent = parent;
                        return;
                    }
                }
            }

        }

    }

    /**
     * 前序遍历 递归版
     * 
     * @param
     */
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 中序遍历 递归版
     * 
     * @param root
     */
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root + " ");
        inOrder(root.right);
    }

    /**
     * 后序遍历 递归版
     * 
     * @param root
     */
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root + " ");
    }

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.insert(5);
        bTree.insert(10);
        bTree.insert(3);
        bTree.insert(7);
        bTree.insert(8);
        bTree.insert(1);
        System.out.println("preOrder:");
        bTree.preOrder(bTree.root);
        System.out.println("\ninOrder:");
        bTree.inOrder(bTree.root);
        System.out.println("\npostOder:");
        bTree.postOrder(bTree.root);
    }
}
