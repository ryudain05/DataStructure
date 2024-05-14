package ch11_Index;

import ch10_Index.TreeNode;


public class BinarySearchTreeDemo {
    static BinarySearchTree bst1 = new BinarySearchTree();
    public static void main(String[] args) {
        System.out.println("Binary Search Tree!");
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

        Integer tmp = 70;
        searchPrint(tmp);
        tmp = 100;
        searchPrint(tmp);
        tmp = 45;
        searchPrint(tmp);
        tmp = 65;
        searchPrint(tmp);
        tmp = 70;
        searchPrint(tmp);

        bst1.delete(80);
        bst1.delete(30);
        bst1.delete(10);
        bst1.printPreOrder();

        bst1.delete(45);
        bst1.delete(70);
        bst1.printPreOrder();
    }
    public static void searchPrint(Integer tmp){
        TreeNode res = bst1.search(tmp);
        if (res == null) {
            System.out.println("Search for " + tmp + " failed");
        } else {
            System.out.println("Search for " + tmp + " returned the node of " + res.key);
        }
    }

    //        Scanner s = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\n** 검색할 키 값을 입력 (음수는 종료됨): ");
//            tmp = s.nextInt();
//            if (tmp < 0) {
//                break;
//            }
//            res = bst1.search(tmp);
//            if (res == null) {
//                System.out.println("Search for " + tmp + " failed");
//            } else {
//                System.out.println("Search for " + tmp + " returned the node of " + res.key);
//            }
//        }
}