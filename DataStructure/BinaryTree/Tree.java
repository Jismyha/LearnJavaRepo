package DataStructure.BinaryTree;

/**
 * 树的接口 所有树的实现都应继承该类
 * 
 * @author KureNaii
 * @since 2021-09-21 19:08:58
 */
public interface Tree {
    public Node find(int key);

    public void insert(int id, double data);

    public void delete(int id);
}
