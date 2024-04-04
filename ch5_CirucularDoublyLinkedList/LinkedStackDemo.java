package ch5_CirucularDoublyLinkedList;

public class LinkedStackDemo {
    public static void main(String[] args) {
        System.out.println("Linked Stack Demo!");
        LinkedStack<Integer> s = new LinkedStack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.print("printAll(): ");
        s.printAll();
        s.popAll();
        System.out.println("isEmpty?: " + s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.push(40);
        int st = s.top();
        System.out.println("Stack top value = " + st);
        System.out.print("printAll(): ");
        s.printAll();
        System.out.println("pop() " + s.pop());
        System.out.println("pop() " + s.pop());
        System.out.println("pop() " + s.pop());
        System.out.println("pop() " + s.pop()); // no effect
        System.out.println("isEmpty?: " + s.isEmpty());
    }
}
