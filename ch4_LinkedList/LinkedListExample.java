package ch4_LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 슬라이드를 참고하여 해당 문장을 작성하시오.
        list.add(0,300);
        list.add(0,200);
        list.add(0,100);
        list.printList();

        list.append(500);
        list.append(600);
        list.printList();

        list.remove(3);
        list.printList();

        list.add(3,250);
        list.add(1,50);
        list.add(0,10);
        list.printList();

        list.append(700);
        list.remove(1);
        list.printList();

        list.removeItem(600);
        list.printList();
    }
}
