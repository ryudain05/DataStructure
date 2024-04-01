package ch5_CirucularDoublyLinkedList;

public class CircularDoublyLinkedListDemo {

    public static void main(String[] args) {
        System.out.println("Circular Doubly Linked List Demo!");
        CircularDoublylLinkedList<Integer> list = new CircularDoublylLinkedList<>();
        list.add(0, 300); // 오토박싱
        list.add(0, 200);
        list.add(0, 100);
        list.printList();
        list.append(500);
        list.append(600);
        list.printList();
        list.remove(3);
        list.printList();
        list.add(3, 250);
        list.add(1, 50);
        list.add(0, 10);
        list.printList();
        list.append(700);
        list.printList();
        list.remove(1);
        list.removeItem(600);
        list.printList();
    }
}