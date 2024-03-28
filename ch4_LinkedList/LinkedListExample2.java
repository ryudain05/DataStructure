package ch4_LinkedList;

public class LinkedListExample2 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();


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

        int get = list.get(5);
        System.out.println("get(5) = " + get);

        list.remove(3);
        list.remove(4);
        list.printList();

        list.removeItem(15);
        list.printList();

        list.set(3, 19);
        list.printList();


        //임의의 연산 5개

        list.set(3, 10);
        list.printList();

        list.append(20);
        list.printList();

        list.remove(2);
        list.printList();

        int index = list.indexOf(20);
        System.out.println("index(20) = " + index);

        list.clear();
        list.printList();
    }
}
