package ch14_Sorting;

public class Sorting {
    int A[];

    public Sorting(int B[]) {
        A = B;
    }

    // [알고리즘 9-1] 구현: 선택 정렴
    public void selectionSort() {
        int k;
        int tmp;
        for (int last = A.length - 1; last >= 1; last--) {
            k = theLargest(last);        // A[0...last] 중 가장 큰 수 A[k] 찾기
            tmp = A[k];
            A[k] = A[last];
            A[last] = tmp;
            printArray(A);
        }
    }

    private int theLargest(int last) {
        // A[O...last]에서 가장 큰 수의 인덱스를 리턴한다.
        int largest = 0;
        for (int i = 0; i <= last; i++) {
            if (A[i] > A[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    private void printArray(int A[]) {
        System.out.print(">>> ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    } // 코드 9-1

    // [알고리즘 9-3] 구현: 버블 정렬
    public void bubbleSort() {
        int tmp = 0;
        boolean swapped;
        for (int last = A.length - 1; last >= 2; last--) {
            swapped = false;
            for (int i = 0; i <= last - 1; i++) {
                if (A[i] > A[i + 1]) {
                    tmp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = tmp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
            printArray(A);

            tmp = tmp;
        }
    }

    // 알고리즘[9-4] 구현: 삽입 정렬
    public void insertionSort() {
        for (int i = 1; i <= A.length - 1; i++) {
            int loc = i - 1;
            int newItem = A[i];
            while (loc >= 0 && newItem < A[loc]) {
                A[loc + 1] = A[loc];
                loc--;
            }
            A[loc + 1] = newItem;
            printArray(A);
        }
    }
}
