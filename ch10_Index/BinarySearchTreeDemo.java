package ch10_Index;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree!");
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.insert(10);
        bst1.insert(20);
        bst1.insert(5);
        bst1.insert(80);
        bst1.insert(90);
        bst1.insert(75);
        bst1.insert(301);
        bst1.insert(77);
        bst1.insert(15);
        bst1.insert(40);
        bst1.printPreOrder();

        bst1.insert(50);
        bst1.insert(30);
        bst1.insert(70);
        bst1.insert(40);
        bst1.printPreOrder();

        bst1.insert(100);
        bst1.insert(25);
        bst1.insert(150);
        bst1.insert(60);
        bst1.insert(35);
        bst1.printPreOrder();
    }
}