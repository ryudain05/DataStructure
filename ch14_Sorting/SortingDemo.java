package ch14_Sorting;

public class SortingDemo {
    public static void printA(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.print("\n\n");
    }

    static final int SIZE = 10;

    public static void main(String[] args) {
//        int[] A = {20, 15, 30, 5, 25, 70, 40, 55, 10, 35};
        int[] A = {60, 10, 30, 2, 16, 8, 40, 20};
        int[] B = new int[8];

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

        //Bubble Sorting
        System.out.println("\n*** Bubble Sorting Demo! \n");
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.println("Before bubble sorting >>>");
        printA(B);

        s.bubbleSort();

        System.out.println("After bubble sorting");
        printA(B);

        //Insertion Sorting
        System.out.println("\n*** Insertion Sorting Demo! \n");
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.println("Before insertion sorting >>>");
        printA(B);

        s.insertionSort();

        System.out.println("After insertion sorting >>>");
        printA(B);
    }
}
