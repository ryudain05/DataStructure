package ch6_Postfix.Queue;

public class ArrayQueueDemo {

    public static void main(String[] args) {
        // 타입 E를 String으로 결정하면서 수행하는 예
        ArrayQueue<String> q = new ArrayQueue<>();
        q.enqueue("test 1");
        q.enqueue("test 2");
        q.enqueue("test 3");
        q.enqueue("test 4");
        q.printAll();

        System.out.println("Deleted item = " + q.dequeue());
        System.out.println("Deleted item = " + q.dequeue());
        q.printAll();

        q.enqueue("test 6");
        q.enqueue("test 7");
        q.printAll();

        System.out.println("Deleted item = " + q.dequeue());
        System.out.println("Deleted item = " + q.dequeue());
        System.out.println("Deleted item = " + q.dequeue());
        System.out.println("Deleted item = " + q.dequeue());

        if (q.isEmpty()) {
            System.out.println("더이상 큐에 원소가 남아있지 않습니다.");
        } else {
            System.out.println("Deleted item = " + q.dequeue());
            System.out.println("Deleted item = " + q.dequeue());
            System.out.println("Deleted item = " + q.dequeue());
        }
    }
}
