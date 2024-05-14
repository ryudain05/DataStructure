package ch9_Heap;

public class HeapDemo {

    public static void main(String[] args) {
        System.out.println("Heap w/ Exception!");
			Heap<Integer> h = new Heap<>(50);
        try {
            h.insert(20);
            h.insert(15);
            h.insert(19);
            h.insert(8);
            h.insert(13);
            h.insert(10);
            h. heapPrint();

            h.insert(25);
            h.insert(12);
            h.insert(18);
            h.insert(30);
            h. heapPrint();
            h.deleteMax();
            h.deleteMax();
            h.deleteMax();
            h.deleteMax();
            h.heapPrint();

        } catch (PQException e) {
            String msg = e.getMessage();
            System.out.println(msg);

        }
    }
} // 코드 8-4