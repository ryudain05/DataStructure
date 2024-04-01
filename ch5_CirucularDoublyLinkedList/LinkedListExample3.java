package ch5_CirucularDoublyLinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        CircularDoublylLinkedList<Integer> list = new CircularDoublylLinkedList<>();

        list.append(3);
        list.append(6);
        list.append(12);
        list.append(15);
        list.printList();

        list.add(2, 9);
        list.add(5, 17);
        list.printList();

        list.add(5, 16);
        list.printList();

        Integer result = list.get(5);
        System.out.println("get(5) = " + result);

        list.remove(3);
        list.remove(4);
        list.printList();

        list.removeItem(15);
        list.printList();

        list.set(3, 19);
        list.printList();

        int index = list.indexOf(19);
        System.out.println("index(19) = " + index);

        list.removeItem(19);
        list.printList();

        list.add(1, 3);
        list.printList();

        list.append(20);
        list.printList();

        list.clear();
        list.printList();
    }
}
