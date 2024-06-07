package ch10_Index;

import ch9_Heap.IndexInterface;

public class BinarySearchTree implements IndexInterface<TreeNode> {
    private TreeNode root;

    public BinarySearchTree() { // 생성자
        root = null;
    }

    // [알고리즘 10-3] 구현 : 삽입
    public void insert(Comparable newKey) {
        root = insertItem(root, newKey);
    }

    private TreeNode insertItem(TreeNode tNode, Comparable newItem) {
        if (tNode == null)  // insert after a leaf  (or into an empty tree)
        {
            tNode = new TreeNode(newItem, null, null);
        } else if (newItem.compareTo(tNode.key) < 0)    // branch left
        {
            tNode.left = insertItem(tNode.left, newItem);
        } else                    // branch right
        {
            tNode.right = insertItem(tNode.right, newItem);
        }
        return tNode;
    }



    /////////////////////////////////////////////////
    public void printPreOrder() {
        prPreOrder(root);
    }

    public void prPreOrder(TreeNode tNode) {
        if (tNode != null) {
            System.out.println(tNode.key);
            prPreOrder(tNode.left);
            prPreOrder(tNode.right);

        }
    }



} // 코드 10-3
