package DataStructure.BinaryTree;

/**
 * 树的节点类
 * 
 * @author KureNaii
 * @since 2021-10-20 22:11:59
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "" + val;
    }

}
