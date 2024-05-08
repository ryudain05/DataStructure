package ch9_Heap;

public class HeapDemo {

    public static void main(String[] args) {
        System.out.println("Heap w/ Exception!");
			Heap<Integer> h = new Heap<>(50);
        try {
            h.insert(1);
            h.insert(10);
            h.insert(30);  	h. heapPrint();
            h.clear();		h. heapPrint();
            h.insert(10);
            h.insert(30);
            h.insert(20);
            h.insert(40); 	h.heapPrint();
            h.deleteMax(); 	h.heapPrint();
            h.insert(1);  	h.heapPrint();
            h.insert(3);  	h.heapPrint();
            h.deleteMax(); 	h.heapPrint();
            h.insert(50);
            h.insert(60); 	h.heapPrint();

            h.clear();
            h.insert(20);
            h.insert(35);
            h.insert(10);
            h.insert(25);
            h.insert(15);
            h.insert(30);
            h.insert(12);
            h.insert(32);
            h.heapPrint();

            h.deleteMax();
            h.deleteMax();
            h.deleteMax();
            h.deleteMax();
            h.heapPrint();

            h.insert(50);
            h.insert(40);
            h.insert(45);
            h.insert(55);
            h.insert(38);
            h.heapPrint();

            h.deleteMax();
            h.deleteMax();
            h.deleteMax();
            h.deleteMax();
            h.deleteMax();
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