package ch3.list;

public class ArrayListExample {
    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList(50);

        list.append(3); list.append(6); list.append(12); list.append(15);
        list.printList();

        list.add(2, 9); list.add(5, 17);
        list.printList();

        list.add(5, 16);
        list.printList();

        int result = list.get(5);
        System.out.println("get(5) = " + result);

        list.remove(3); list.remove(4);
        list.printList();

        list.removeItem(15);
        list.printList();

        list.set(3, 19);
        list.printList();

        list.add(0, 24);
        list.printList();

        list.append(30);
        list.printList();

        list.remove(2);
        list.printList();

        list.removeItem(24);
        list.printList();

        int index = list.indexOf(30);
        System.out.println("30의 index = " + index);

    }
}
