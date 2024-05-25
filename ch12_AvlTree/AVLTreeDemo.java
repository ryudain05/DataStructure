package ch12_AvlTree;

public class AVLTreeDemo {
    public static void main(String[] args) {
        System.out.println("AVL Tree!!");
        AVLTree avl = new AVLTree();
        System.out.println("isEmpty(): " + avl.isEmpty());

        avl.insert(10);
        avl.insert(20);
        avl.insert(5);
        avl.insert(80);
        avl.insert(90);
        avl.insert(30);
        avl.insert(40);
        avl.printPreOrder();
        avl.clear();

        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.printPreOrder();

        avl.clear();
        avl.insert(90);
        avl.insert(80);
        avl.insert(70);
        avl.insert(60);
        avl.insert(50);
        avl.insert(40);
        avl.insert(30);
        avl.insert(20);
        avl.insert(10);
        avl.printPreOrder();

        System.out.println("isEmpty(): " + avl.isEmpty());

        avl.clear();
        avl.insert(60);
        avl.insert(40);
        avl.insert(70);
        avl.insert(30);
        avl.insert(50);
        avl.insert(20);
        avl.insert(10);
        avl.insert(5);
        avl.printPreOrder();

    }
}
