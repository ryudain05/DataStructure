package ch15_Sorting;

public class SortingDemo {
    public static void printA(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.print("\n\n");
    }

    static final int SIZE = 10;

    public static void main(String[] args) {
        int[] A = {20, 15, 30, 5, 25, 70, 40, 55, 10, 35};
        int[] B = new int[SIZE];
        //Selection Sorting
        System.out.println("*** Selection Sorting Demo! \n");
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.println("Before selection sorting >>>");
        printA(B);

        Sorting s = new Sorting(B);
        s.selectionSort();

        System.out.println("\nAfter selection sorting >>>");
        printA(B);
    }
}
