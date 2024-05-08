package ch9_Heap;

public class HeapSort {
    public static void main(String[] args) throws PQException {
        Integer []A = {30, 20, 40, 10, 90, 70, 60, 100, 80, 50};
        int size = A.length;

        System.out.print("Before sort : ");
        for (int i =0; i<size; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        Heap<Integer> h= new Heap<>(A, size); //배역 A를 갖는 힙 객체를 생성함
        h.buildHeap(); //힙을 구성함
        //힙에서 차례로 삭제함-- 큰 순서대로 삭제됨
//        for (int i = 0; i <= size - 1; i++) {
//            System.out.println(h.deleteMax()+" ");
//        }

        for (int i = size - 1; i >= 0; i--) A[i] = h.deleteMax();
        System.out.print("After sort : ");

        for (int i = 0; i < size; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();

    }
}
